package com.user00.domjnate.api;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="TextDecoder")
public interface TextDecoder
{
@JsProperty(name="encoding")
String getEncoding();
@JsProperty(name="fatal")
boolean getFatal();
@JsProperty(name="ignoreBOM")
boolean getIgnoreBOM();
@JsMethod(name="decode")
String decode();
@JsMethod(name="decode")
String decode(ArrayBuffer input);
@JsMethod(name="decode")
String decode(ArrayBufferView input);
@JsMethod(name="decode")
String decode(ArrayBuffer input, TextDecodeOptions options);
@JsMethod(name="decode")
String decode(ArrayBufferView input, TextDecodeOptions options);
@JsOverlay
public static TextDecoder getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "TextDecoder", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", TextDecoder.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, TextDecoder val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "TextDecoder", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static TextDecoder _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "TextDecoder");
  return com.user00.domjnate.util.Js.construct(_win, constructor, TextDecoder.class);
}
@JsOverlay
public static TextDecoder _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, String label) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "TextDecoder");
  return com.user00.domjnate.util.Js.construct(_win, constructor, TextDecoder.class, label);
}
@JsOverlay
public static TextDecoder _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, String label, TextDecoderOptions options) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "TextDecoder");
  return com.user00.domjnate.util.Js.construct(_win, constructor, TextDecoder.class, label, options);
}
}
