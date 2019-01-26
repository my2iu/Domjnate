package com.user00.domjnate.javafx;

import java.lang.reflect.Type;

import com.user00.domjnate.api.Function;
import com.user00.domjnate.util.JsThunk;

import jsinterop.annotations.JsFunction;
import netscape.javascript.JSObject;

public class JsThunkFx implements JsThunk
{
   JSObject scope;
   
   @Override
   public Object getConstructor(String className)
   {
      return scope.getMember(className);
   }

   @Override
   public <T> T construct(Object constructor, Type type, Object...args)
   {
      if (constructor instanceof String && "undefined".equals(constructor))
      {
         throw new IllegalArgumentException("Constructor is \"undefined\", and it's ambiguous whether it should be a string or null");
      }
      JSObject jsObj = (JSObject)constructor;
      JSObject constructorFn = (JSObject)jsObj.eval("(function (...args) { return new this(...args); })");
      Object [] argsWithThis = new Object[args.length + 1];
      for (int n = 0; n < args.length; n++)
         argsWithThis[n + 1] = DomjnateFx.unwrapObject(args[n], this);
      // Will use jsObj as "this", but it doesn't matter since we're just calling a function
      argsWithThis[0] = jsObj;
      if (type instanceof Class)
         return (T)DomjnateFx.createJsBridgeProxy((Class<T>)type, (JSObject)constructorFn.call("call", argsWithThis), this);
      else
         throw new IllegalArgumentException("Expecting Class");
   }

   @Override
   public <T> T callMethod(Object obj, String methodName, Type type,
         Object... args)
   {
      JSObject jsObj = ((DomjnateJSObjectAccess)obj).__DomjnateGetJSObjectFromProxy();
      return (T)DomjnateFx.wrapJsReturnType(jsObj.call(methodName, args), type, this);
   }

   @Override
   public <T> T getMember(Object scope, String member, Type type)
   {
      JSObject jsObj = ((DomjnateJSObjectAccess)scope).__DomjnateGetJSObjectFromProxy();
      return (T)DomjnateFx.wrapJsReturnType(jsObj.getMember(member), type, this);
   }

   @Override
   public <T> void setMember(Object scope, String member, T val)
   {
      JSObject jsObj = ((DomjnateJSObjectAccess)scope).__DomjnateGetJSObjectFromProxy();
      jsObj.setMember(member, DomjnateFx.unwrapObject(val, this));
   }
   
   @Override
   public <T> T getIndex(Object obj, int idx, Type type)
   {
      JSObject jsObj = ((DomjnateJSObjectAccess)obj).__DomjnateGetJSObjectFromProxy();
      return (T)DomjnateFx.wrapJsReturnType(jsObj.getSlot(idx), type, this);
   }
   
   @Override
   public <T> void setIndex(Object obj, int idx, T val)
   {
      JSObject jsObj = ((DomjnateJSObjectAccess)obj).__DomjnateGetJSObjectFromProxy();
      jsObj.setSlot(idx, DomjnateFx.unwrapObject(val, this));
   }
   
   @Override
   public <T> T cast(Object obj, Type type)
   {
      JSObject jsObj = ((DomjnateJSObjectAccess)obj).__DomjnateGetJSObjectFromProxy();
      if (type instanceof Class)
         return DomjnateFx.createJsBridgeProxy((Class<T>)type, jsObj, this);
      else
         throw new IllegalArgumentException("Expecting Class");
   }
   
   @Override
   public Function lambdaAsFunction(Object lambda)
   {
      Class<?> objClass = lambda.getClass();
      if (objClass.getInterfaces().length > 0 &&
                  objClass.getInterfaces()[0].isAnnotationPresent(JsFunction.class))
      {
         return DomjnateFx.wrapJsReturnType(DomjnateFx.wrapLambdaWithJsFunction(lambda, this), Function.class, this);
      }
      throw new IllegalArgumentException("Expecting a lambda with a @JsFunction annotation");

   }
}
