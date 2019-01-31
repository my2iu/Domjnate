package com.user00.domjnate.api;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="TextEncoder")
public interface TextEncoder
{
@JsProperty(name="encoding")
String getEncoding();
@JsMethod(name="encode")
Uint8Array encode();
@JsMethod(name="encode")
Uint8Array encode(String input);
@JsOverlay
public static TextEncoder getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "TextEncoder", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", TextEncoder.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, TextEncoder val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "TextEncoder", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static TextEncoder _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "TextEncoder");
  return com.user00.domjnate.util.Js.construct(_win, constructor, TextEncoder.class);
}
}
