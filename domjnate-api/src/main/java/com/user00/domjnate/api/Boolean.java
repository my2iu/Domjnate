package com.user00.domjnate.api;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="Boolean")
public interface Boolean
{
@JsMethod(name="valueOf")
boolean valueOf();
@JsOverlay
public static Boolean getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "Boolean", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", Boolean.class);
}
@JsOverlay
public static boolean call(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  return com.user00.domjnate.util.Js.callMethod(_win, "Boolean", boolean.class);
}
@JsOverlay
public static boolean call(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, java.lang.Object value) {
  return com.user00.domjnate.util.Js.callMethod(_win, "Boolean", boolean.class, value);
}
@JsOverlay
public static Boolean _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "Boolean");
  return com.user00.domjnate.util.Js.construct(_win, constructor, Boolean.class);
}
@JsOverlay
public static Boolean _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, java.lang.Object value) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "Boolean");
  return com.user00.domjnate.util.Js.construct(_win, constructor, Boolean.class, value);
}
}
