package com.user00.domjnate.api;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="ErrorEvent")
public interface ErrorEvent extends com.user00.domjnate.api.dom.Event
{
@JsProperty(name="colno")
double getColno();
@JsProperty(name="error")
java.lang.Object getError();
@JsProperty(name="filename")
String getFilename();
@JsProperty(name="lineno")
double getLineno();
@JsProperty(name="message")
String getMessage();
@JsOverlay
public static ErrorEvent getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "ErrorEvent", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", ErrorEvent.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, ErrorEvent val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "ErrorEvent", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static ErrorEvent _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, String type) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "ErrorEvent");
  return com.user00.domjnate.util.Js.construct(_win, constructor, ErrorEvent.class, type);
}
@JsOverlay
public static ErrorEvent _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, String type, ErrorEventInit eventInitDict) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "ErrorEvent");
  return com.user00.domjnate.util.Js.construct(_win, constructor, ErrorEvent.class, type, eventInitDict);
}
}
