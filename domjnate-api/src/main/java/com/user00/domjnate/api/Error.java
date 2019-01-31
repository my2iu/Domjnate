package com.user00.domjnate.api;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="Error")
public interface Error
{
@JsProperty(name="name")
String getName();
@JsProperty(name="name")
void setName(String val);
@JsProperty(name="message")
String getMessage();
@JsProperty(name="message")
void setMessage(String val);
@JsProperty(name="stack")
String getStack();
@JsProperty(name="stack")
void setStack(String val);
@JsOverlay
public static Error getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "Error", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", Error.class);
}
@JsOverlay
public static Error call(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  return com.user00.domjnate.util.Js.callMethod(_win, "Error", Error.class);
}
@JsOverlay
public static Error call(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, String message) {
  return com.user00.domjnate.util.Js.callMethod(_win, "Error", Error.class, message);
}
@JsOverlay
public static Error _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "Error");
  return com.user00.domjnate.util.Js.construct(_win, constructor, Error.class);
}
@JsOverlay
public static Error _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, String message) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "Error");
  return com.user00.domjnate.util.Js.construct(_win, constructor, Error.class, message);
}
}
