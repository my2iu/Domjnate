package com.user00.domjnate.util;

public class Js
{
   // TODO: This only works for globally accessible classes for now
   public static Object getConstructor(Object scope, String className)
   {
      if (scope instanceof JsThunkAccess)
      {
         JsThunk thunk = ((JsThunkAccess)scope).__DomjnateGetJsThunk();
         return thunk.getConstructor(className);
      }
      throw new IllegalArgumentException("Cannot find JavaScript context to access JS object");
   }

   public static <T> T construct(Object scope, Object constructor, Class<T> type, Object...args)
   {
      if (scope instanceof JsThunkAccess)
      {
         JsThunk thunk = ((JsThunkAccess)scope).__DomjnateGetJsThunk();
         return thunk.construct(constructor, type, args);
      }
      throw new IllegalArgumentException("Cannot find JavaScript context to access JS object");
   }
   
   public static <T> T callStaticMethod(Object scope, String className, String methodName, Class<T> type, Object...args)
   {
      if (scope instanceof JsThunkAccess)
      {
         JsThunk thunk = ((JsThunkAccess)scope).__DomjnateGetJsThunk();
         com.user00.domjnate.util.EmptyInterface classObj = thunk.getMember(scope, className, com.user00.domjnate.util.EmptyInterface.class);
         return thunk.callMethod(classObj, methodName, type, args);
      }
      throw new IllegalArgumentException("Cannot find JavaScript context to access JS object");
   }

   public static <T> T callMethod(Object parent, String memberName, Class<T> type, Object...args)
   {
      if (parent instanceof JsThunkAccess)
      {
         JsThunk thunk = ((JsThunkAccess)parent).__DomjnateGetJsThunk();
         return thunk.callMethod(parent, memberName, type, args);
      }
      throw new IllegalArgumentException("Cannot find JavaScript context to access JS object");
   }

   public static <T> T _new(Object scope, String className, Class<T> type)
   {
      if (scope instanceof JsThunkAccess)
      {
         JsThunk thunk = ((JsThunkAccess)scope).__DomjnateGetJsThunk();
         Object constructor = thunk.getConstructor(className);
         return thunk.construct(constructor, type);
      }
      throw new IllegalArgumentException("Cannot find JavaScript context where new JS objects should be constructed");
   }

   // TODO: Should it be an int for idx?
   public static <T> T getIndex(Object obj, double idx, Class<T> type)
   {
      if (obj instanceof JsThunkAccess)
      {
         JsThunk thunk = ((JsThunkAccess)obj).__DomjnateGetJsThunk();
         return thunk.getIndex(obj, (int)idx, type);
      }
      throw new IllegalArgumentException("Cannot find JavaScript context to access JS object");
   }

   // TODO: Should it be an int for idx?
   public static <T> void setIndex(Object obj, double idx, T val)
   {
      if (obj instanceof JsThunkAccess)
      {
         JsThunk thunk = ((JsThunkAccess)obj).__DomjnateGetJsThunk();
         thunk.setIndex(obj, (int)idx, val);
      }
      throw new IllegalArgumentException("Cannot find JavaScript context to access JS object");
   }

   public static <T> T getMember(Object scope, String member, Class<T> type)
   {
      if (scope instanceof JsThunkAccess)
      {
         JsThunk thunk = ((JsThunkAccess)scope).__DomjnateGetJsThunk();
         T obj = thunk.getMember(scope, member, type);
         return obj;
      }
      throw new IllegalArgumentException("Cannot find JavaScript context to access JS object");
   }

   public static <T> void setMember(Object scope, String member, T val)
   {
      if (scope instanceof JsThunkAccess)
      {
         JsThunk thunk = ((JsThunkAccess)scope).__DomjnateGetJsThunk();
         thunk.setMember(scope, member, val);
      }
   }
   
   public static <T> T cast(Object obj, Class<T> type)
   {
      if (obj instanceof JsThunkAccess)
      {
         JsThunk thunk = ((JsThunkAccess)obj).__DomjnateGetJsThunk();
         return thunk.cast(obj, type);
      }
      return (T)obj;
      
   }
}
