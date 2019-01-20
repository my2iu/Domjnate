package com.user00.domjnate.util;

public class Js
{
   // TODO: This only works for globally accessible classes for now
   public static native Object getConstructor(Object scope, String className) /*-{
      return scope[className];
    }-*/;

   
   public static native <T> T construct(Object scope, Object constructor, Class<T> type, Object...args) /*-{
      // TODO: This is wrong
      return constructor.call(scope, args); 
    }-*/;
   
   public static native <T> T callStaticMethod(Object scope, String className, String methodName, Class<T> type, Object...args)/*-{
      var cls = scope[className]; 
      return cls[methodName].call(cls, args);
    }-*/;

   public static native <T> T callMethod(Object parent, String memberName, Class<T> type, Object...args) /*-{
      return parent[memberName].call(parent, args); 
    }-*/;

   public static native <T> T _new(Object scope, String className, Class<T> type) /*-{
      return new scope[className]();
    }-*/;   

   // TODO: Should it be an int for idx?
   public static native <T> T getIndex(Object obj, double idx, Class<T> type) /*-{
      return obj[idx];
    }-*/;

   // TODO: Should it be an int for idx?
   public static native <T> void setIndex(Object obj, double idx, T val) /*-{
      obj[idx] = val;
    }-*/;

   public static native <T> T getMember(Object scope, String member, Class<T> type) /*-{
      return scope[member];
    }-*/;

   public static native <T> void setMember(Object scope, String member, T val) /*-{
      scope[member] = val;
    }-*/;
   
   public static native <T> T cast(Object obj, Class<T> type) /*-{
      return obj;
    }-*/;
}
