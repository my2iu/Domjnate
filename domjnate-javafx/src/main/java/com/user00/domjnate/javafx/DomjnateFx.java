package com.user00.domjnate.javafx;

import java.lang.annotation.Annotation;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.lang.reflect.Type;
import java.util.Arrays;

import com.user00.domjnate.util.JsThunk;
import com.user00.domjnate.util.JsThunkAccess;

import jsinterop.annotations.JsFunction;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import netscape.javascript.JSObject;

public class DomjnateFx
{
   static Method GET_JS_OBJECT_FROM_PROXY;
   static Method GET_JS_THUNK_FROM_PROXY;
   static {
      try
      {
         GET_JS_OBJECT_FROM_PROXY = DomjnateJSObjectAccess.class.getMethod("__DomjnateGetJSObjectFromProxy");
         GET_JS_THUNK_FROM_PROXY = JsThunkAccess.class.getMethod("__DomjnateGetJsThunk");
      } catch (NoSuchMethodException | SecurityException e)
      {
         e.printStackTrace();
      }
   }
   
   static class JsObjectWrapperInvocationHandler implements InvocationHandler
   {
      JSObject obj;
      JsThunkFx thunk;
      MethodHandles.Lookup methodHandlesLookup;
      JsObjectWrapperInvocationHandler(JSObject obj, JsThunkFx thunk)
      {
         this.obj = obj;
         this.thunk = thunk;
      }
      
      @Override
      public Object invoke(Object proxy, Method method, Object[] args)
            throws Throwable
      {
         JsProperty prop = method.getAnnotation(JsProperty.class);
         if (prop != null) 
         {
            if (method.getName().startsWith("get"))
            {
               return wrapJsReturnType(obj.getMember(prop.name()), method.getReturnType(), thunk);
            }
            if (method.getName().startsWith("set"))
            {
               // Pull out JSObject if it is wrapped
               if (obj instanceof DomjnateJSObjectAccess)
                  obj.setMember(prop.name(), ((DomjnateJSObjectAccess)args[0]).__DomjnateGetJSObjectFromProxy());
               else
                  obj.setMember(prop.name(), args[0]);
               return null;
            }
         }
         JsMethod call = method.getAnnotation(JsMethod.class);
         if (call != null)
         {
            String name = call.name();
            if (name == null) name = method.getName();
            Class<?> expectedReturnType = method.getReturnType();
            Object toReturn = obj.call(name, unwrapArguments(args, thunk)); 
            if (expectedReturnType == Void.TYPE) return null; 
            return wrapJsReturnType(toReturn, expectedReturnType, thunk);
         }
         if (method.isDefault())
         {
            if (methodHandlesLookup == null)
               methodHandlesLookup = MethodHandles.lookup();
            MethodHandle mh = 
                  MethodHandles.privateLookupIn(method.getDeclaringClass(), methodHandlesLookup) 
                        .findSpecial(method.getDeclaringClass(), 
                              method.getName(), 
                              MethodType.methodType(method.getReturnType(), method.getParameterTypes()),
                              method.getDeclaringClass());
            return mh.bindTo(proxy).invokeWithArguments(unwrapArguments(args, thunk));
         }
         if (GET_JS_OBJECT_FROM_PROXY.equals(method))
         {
            return obj;
         }
         if (GET_JS_THUNK_FROM_PROXY.equals(method))
         {
            return thunk;
         }
         return null;
      }
      
   }
   
   public static <T> T createJsBridgeProxy(Class<T> wrapper, JSObject obj, JsThunkFx thunk)
   {
      return (T)Proxy.newProxyInstance(wrapper.getClassLoader(), new Class[] {wrapper, DomjnateJSObjectAccess.class, JsThunkAccess.class},
            new JsObjectWrapperInvocationHandler(obj, thunk));
   }

   public static <T> T createJsBridgeGlobalsProxy(Class<T> wrapper, JSObject obj)
   {
      JsThunkFx thunk = new JsThunkFx();
      T o = (T)Proxy.newProxyInstance(wrapper.getClassLoader(), new Class[] {wrapper, DomjnateJSObjectAccess.class, JsThunkAccess.class},
            new JsObjectWrapperInvocationHandler(obj, thunk));
      thunk.scope = ((DomjnateJSObjectAccess)o).__DomjnateGetJSObjectFromProxy();
      return o;
   }

   static Object unwrapObject(Object val, JsThunkFx thunk)
   {
      if (val instanceof DomjnateJSObjectAccess)
         return ((DomjnateJSObjectAccess)val).__DomjnateGetJSObjectFromProxy();
      else
      {
         Class<?> objClass = val.getClass();
         if (objClass.getInterfaces().length > 0 &&
                     objClass.getInterfaces()[0].isAnnotationPresent(JsFunction.class))
         {
            return ((JSObject)thunk.scope.eval(
                  "(function(fnObj) {" +
                  "  return function(...args) { return fnObj.passthroughCall(args); };" +
                  "})")).call("call", thunk.scope, new ArgumentPasser.FunctionPassthroughToJava((args) -> {
                     for (int n = 0; n < args.length; n++)
                     {
                        args[n] = wrapJsReturnType(args[n], val.getClass().getInterfaces()[0].getMethods()[0].getParameterTypes()[n], thunk);
                     }
                     try {
                        return val.getClass().getInterfaces()[0].getMethods()[0].invoke(val, args);
                     } 
                     catch (IllegalAccessException | InvocationTargetException | SecurityException e)
                     {
                        throw new IllegalArgumentException(e);
                     }
                  }));
         }
      return val;
      }
   }
   
   static Object [] unwrapArguments(Object[] args, JsThunkFx thunk)
   {
      Object[] toReturn = new Object[args.length];
      for (int n = 0; n < args.length; n++)
         toReturn[n] = unwrapObject(args[n], thunk);
      return toReturn;
   }

   static <T> T wrapJsReturnType(Object obj, Type desiredType, JsThunkFx thunk)
   {
      if (obj == null) return null;
      if (desiredType == String.class)
         return (T)obj;
      else if (desiredType == Double.TYPE || desiredType == Double.class)
      {
         if (obj instanceof Integer)
            return (T)Double.valueOf(((Integer)obj).doubleValue());
         return (T)obj;
      }
      else if (desiredType == Boolean.TYPE || desiredType == Boolean.class)
         return (T)obj;
      // Check if it's a JSType
      if (desiredType instanceof Class)
      {
         Annotation jsType = ((Class<?>)desiredType).getAnnotation(JsType.class);
         if (jsType != null && obj instanceof JSObject)
         {
            return createJsBridgeProxy((Class<T>)desiredType, (JSObject)obj, thunk); 
         }
      }
      else
         throw new IllegalArgumentException("Expecting Class");
      if (obj instanceof String && "undefined".equals(obj))
      {
         throw new IllegalArgumentException("Could not wrap object--received \"undefined\", and it's ambiguous whether it should be a string or null");
      }
      throw new IllegalArgumentException("Could not wrap object");
   }
   
//   public static Object wrapJs(Object obj)
//   {
//      if (obj == null) {
//         return null;
//       } else if (obj instanceof JSObject) {
//          
//       } else if (obj instanceof Number) {
//          return obj;
//       } else if (obj instanceof Boolean) {
//         return obj;
//       } else if ("undefined".equals(obj)) {
//         return null;
//       } else if (obj instanceof String) {
//         return obj;
//       }
//       return null;
//   }
}
