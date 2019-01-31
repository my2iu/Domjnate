package com.user00.domjnate.api;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="TypeError")
public interface TypeError extends Error
{
@JsOverlay
public static TypeError getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "TypeError", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", TypeError.class);
}
@JsOverlay
public static TypeError call(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  return com.user00.domjnate.util.Js.callMethod(_win, "TypeError", TypeError.class);
}
@JsOverlay
public static TypeError call(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, String message) {
  return com.user00.domjnate.util.Js.callMethod(_win, "TypeError", TypeError.class, message);
}
@JsOverlay
public static TypeError _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "TypeError");
  return com.user00.domjnate.util.Js.construct(_win, constructor, TypeError.class);
}
@JsOverlay
public static TypeError _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, String message) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "TypeError");
  return com.user00.domjnate.util.Js.construct(_win, constructor, TypeError.class, message);
}
}
