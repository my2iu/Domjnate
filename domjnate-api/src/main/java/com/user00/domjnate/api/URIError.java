package com.user00.domjnate.api;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="URIError")
public interface URIError extends Error
{
@JsOverlay
public static URIError getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "URIError", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", URIError.class);
}
@JsOverlay
public static URIError call(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  return com.user00.domjnate.util.Js.callMethod(_win, "URIError", URIError.class);
}
@JsOverlay
public static URIError call(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, String message) {
  return com.user00.domjnate.util.Js.callMethod(_win, "URIError", URIError.class, message);
}
@JsOverlay
public static URIError _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "URIError");
  return com.user00.domjnate.util.Js.construct(_win, constructor, URIError.class);
}
@JsOverlay
public static URIError _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, String message) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "URIError");
  return com.user00.domjnate.util.Js.construct(_win, constructor, URIError.class, message);
}
}
