package com.user00.domjnate.api;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="ReferenceError")
public interface ReferenceError extends Error
{
@JsOverlay
public static ReferenceError getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "ReferenceError", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", ReferenceError.class);
}
@JsOverlay
public static ReferenceError call(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  return com.user00.domjnate.util.Js.callMethod(_win, "ReferenceError", ReferenceError.class);
}
@JsOverlay
public static ReferenceError call(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, String message) {
  return com.user00.domjnate.util.Js.callMethod(_win, "ReferenceError", ReferenceError.class, message);
}
@JsOverlay
public static ReferenceError _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "ReferenceError");
  return com.user00.domjnate.util.Js.construct(_win, constructor, ReferenceError.class);
}
@JsOverlay
public static ReferenceError _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, String message) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "ReferenceError");
  return com.user00.domjnate.util.Js.construct(_win, constructor, ReferenceError.class, message);
}
}
