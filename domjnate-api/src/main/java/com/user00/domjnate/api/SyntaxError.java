package com.user00.domjnate.api;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="SyntaxError")
public interface SyntaxError extends Error
{
@JsOverlay
public static SyntaxError getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "SyntaxError", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", SyntaxError.class);
}
@JsOverlay
public static SyntaxError call(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  return com.user00.domjnate.util.Js.callMethod(_win, "SyntaxError", SyntaxError.class);
}
@JsOverlay
public static SyntaxError call(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, String message) {
  return com.user00.domjnate.util.Js.callMethod(_win, "SyntaxError", SyntaxError.class, message);
}
@JsOverlay
public static SyntaxError _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "SyntaxError");
  return com.user00.domjnate.util.Js.construct(_win, constructor, SyntaxError.class);
}
@JsOverlay
public static SyntaxError _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, String message) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "SyntaxError");
  return com.user00.domjnate.util.Js.construct(_win, constructor, SyntaxError.class, message);
}
}
