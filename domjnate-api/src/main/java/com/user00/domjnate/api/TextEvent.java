package com.user00.domjnate.api;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="TextEvent")
public interface TextEvent extends UIEvent
{
@JsProperty(name="data")
String getData();
@JsProperty(name="DOM_INPUT_METHOD_DROP")
double DOM_INPUT_METHOD_DROP();
@JsProperty(name="DOM_INPUT_METHOD_HANDWRITING")
double DOM_INPUT_METHOD_HANDWRITING();
@JsProperty(name="DOM_INPUT_METHOD_IME")
double DOM_INPUT_METHOD_IME();
@JsProperty(name="DOM_INPUT_METHOD_KEYBOARD")
double DOM_INPUT_METHOD_KEYBOARD();
@JsProperty(name="DOM_INPUT_METHOD_MULTIMODAL")
double DOM_INPUT_METHOD_MULTIMODAL();
@JsProperty(name="DOM_INPUT_METHOD_OPTION")
double DOM_INPUT_METHOD_OPTION();
@JsProperty(name="DOM_INPUT_METHOD_PASTE")
double DOM_INPUT_METHOD_PASTE();
@JsProperty(name="DOM_INPUT_METHOD_SCRIPT")
double DOM_INPUT_METHOD_SCRIPT();
@JsProperty(name="DOM_INPUT_METHOD_UNKNOWN")
double DOM_INPUT_METHOD_UNKNOWN();
@JsProperty(name="DOM_INPUT_METHOD_VOICE")
double DOM_INPUT_METHOD_VOICE();
@JsMethod(name="initTextEvent")
void initTextEvent(String typeArg, boolean canBubbleArg, boolean cancelableArg, Window viewArg, String dataArg, double inputMethod, String locale);
@JsOverlay
public static TextEvent getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "TextEvent", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", TextEvent.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, TextEvent val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "TextEvent", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static double DOM_INPUT_METHOD_DROP(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "TextEvent", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "DOM_INPUT_METHOD_DROP", double.class);
}
@JsOverlay
public static double DOM_INPUT_METHOD_HANDWRITING(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "TextEvent", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "DOM_INPUT_METHOD_HANDWRITING", double.class);
}
@JsOverlay
public static double DOM_INPUT_METHOD_IME(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "TextEvent", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "DOM_INPUT_METHOD_IME", double.class);
}
@JsOverlay
public static double DOM_INPUT_METHOD_KEYBOARD(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "TextEvent", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "DOM_INPUT_METHOD_KEYBOARD", double.class);
}
@JsOverlay
public static double DOM_INPUT_METHOD_MULTIMODAL(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "TextEvent", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "DOM_INPUT_METHOD_MULTIMODAL", double.class);
}
@JsOverlay
public static double DOM_INPUT_METHOD_OPTION(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "TextEvent", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "DOM_INPUT_METHOD_OPTION", double.class);
}
@JsOverlay
public static double DOM_INPUT_METHOD_PASTE(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "TextEvent", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "DOM_INPUT_METHOD_PASTE", double.class);
}
@JsOverlay
public static double DOM_INPUT_METHOD_SCRIPT(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "TextEvent", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "DOM_INPUT_METHOD_SCRIPT", double.class);
}
@JsOverlay
public static double DOM_INPUT_METHOD_UNKNOWN(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "TextEvent", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "DOM_INPUT_METHOD_UNKNOWN", double.class);
}
@JsOverlay
public static double DOM_INPUT_METHOD_VOICE(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "TextEvent", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "DOM_INPUT_METHOD_VOICE", double.class);
}
@JsOverlay
public static TextEvent _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "TextEvent");
  return com.user00.domjnate.util.Js.construct(_win, constructor, TextEvent.class);
}
}
