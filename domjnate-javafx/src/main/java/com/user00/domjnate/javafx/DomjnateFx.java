package com.user00.domjnate.javafx;

import java.lang.annotation.Annotation;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

import com.user00.domjnate.util.JsThunk;
import com.user00.domjnate.util.JsThunkAccess;

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
      JsThunk thunk;
      MethodHandles.Lookup methodHandlesLookup;
      JsObjectWrapperInvocationHandler(JSObject obj, JsThunk thunk)
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
            return wrapJsReturnType(obj.call(name, unwrapArguments(args)), method.getReturnType(), thunk);
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
            return mh.bindTo(proxy).invokeWithArguments(unwrapArguments(args));
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
   
   public static <T> T createJsBridgeProxy(Class<T> wrapper, JSObject obj, JsThunk thunk)
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

   static Object unwrapObject(Object val)
   {
      if (val instanceof DomjnateJSObjectAccess)
         return ((DomjnateJSObjectAccess)val).__DomjnateGetJSObjectFromProxy();
      return val;
   }
   
   static Object [] unwrapArguments(Object[] args)
   {
      Object[] toReturn = new Object[args.length];
      for (int n = 0; n < args.length; n++)
         toReturn[n] = unwrapObject(args[n]);
      return toReturn;
   }

   static <T> T wrapJsReturnType(Object obj, Class<T> desiredType, JsThunk thunk)
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
      Annotation jsType = desiredType.getAnnotation(JsType.class);
      if (jsType != null && obj instanceof JSObject)
      {
         return createJsBridgeProxy(desiredType, (JSObject)obj, thunk); 
      }
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
