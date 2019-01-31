package com.user00.domjnate.api;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="RangeError")
public interface RangeError extends Error
{
@JsOverlay
public static RangeError getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "RangeError", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", RangeError.class);
}
@JsOverlay
public static RangeError call(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  return com.user00.domjnate.util.Js.callMethod(_win, "RangeError", RangeError.class);
}
@JsOverlay
public static RangeError call(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, String message) {
  return com.user00.domjnate.util.Js.callMethod(_win, "RangeError", RangeError.class, message);
}
@JsOverlay
public static RangeError _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "RangeError");
  return com.user00.domjnate.util.Js.construct(_win, constructor, RangeError.class);
}
@JsOverlay
public static RangeError _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, String message) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "RangeError");
  return com.user00.domjnate.util.Js.construct(_win, constructor, RangeError.class, message);
}
}
