package com.user00.domjnate.api;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="EvalError")
public interface EvalError extends Error
{
@JsOverlay
public static EvalError getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "EvalError", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", EvalError.class);
}
@JsOverlay
public static EvalError call(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  return com.user00.domjnate.util.Js.callMethod(_win, "EvalError", EvalError.class);
}
@JsOverlay
public static EvalError call(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, String message) {
  return com.user00.domjnate.util.Js.callMethod(_win, "EvalError", EvalError.class, message);
}
@JsOverlay
public static EvalError _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "EvalError");
  return com.user00.domjnate.util.Js.construct(_win, constructor, EvalError.class);
}
@JsOverlay
public static EvalError _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, String message) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "EvalError");
  return com.user00.domjnate.util.Js.construct(_win, constructor, EvalError.class, message);
}
}
