package com.user00.domjnate.util;

import java.lang.reflect.Type;

public class Js
{
   // TODO: This only works for globally accessible classes for now
   public static native Object getConstructor(Object scope, String className) /*-{
      return scope[className];
    }-*/;

   
   public static native <T> T construct(Object scope, Object constructor, Type type, Object...args) /*-{
      var ctor = Function.bind.apply(constructor, [constructor].concat(args));
      return new ctor();
    }-*/;
   
   public static native <T> T callStaticMethod(Object scope, String className, String methodName, Type type, Object...args)/*-{
      var cls = scope[className]; 
      return cls[methodName].call(cls, args);
    }-*/;

   public static native <T> T callMethod(Object parent, String memberName, Type type, Object...args) /*-{
      return parent[memberName].call(parent, args); 
    }-*/;

   public static native <T> T _new(Object scope, String className, Type type) /*-{
      return new scope[className]();
    }-*/;   

   // TODO: Should it be an int for idx?
   public static native <T> T getIndex(Object obj, double idx, Type type) /*-{
      return obj[idx];
    }-*/;

   // TODO: Should it be an int for idx?
   public static native <T> void setIndex(Object obj, double idx, T val) /*-{
      obj[idx] = val;
    }-*/;

   public static native <T> T getMember(Object scope, String member, Type type) /*-{
      return scope[member];
    }-*/;

   public static native <T> void setMember(Object scope, String member, T val) /*-{
      scope[member] = val;
    }-*/;
   
   public static native <T> T cast(Object obj, Type type) /*-{
      return obj;
    }-*/;
}
