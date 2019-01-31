package com.user00.domjnate.api;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="CloseEvent")
public interface CloseEvent extends com.user00.domjnate.api.dom.Event
{
@JsProperty(name="code")
double getCode();
@JsProperty(name="reason")
String getReason();
@JsProperty(name="wasClean")
boolean getWasClean();
@JsMethod(name="initCloseEvent")
void initCloseEvent(String typeArg, boolean canBubbleArg, boolean cancelableArg, boolean wasCleanArg, double codeArg, String reasonArg);
@JsOverlay
public static CloseEvent getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "CloseEvent", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", CloseEvent.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, CloseEvent val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "CloseEvent", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static CloseEvent _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, String type) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "CloseEvent");
  return com.user00.domjnate.util.Js.construct(_win, constructor, CloseEvent.class, type);
}
@JsOverlay
public static CloseEvent _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, String type, CloseEventInit eventInitDict) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "CloseEvent");
  return com.user00.domjnate.util.Js.construct(_win, constructor, CloseEvent.class, type, eventInitDict);
}
}
