package com.user00.domjnate.api.eme;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="MediaKeyMessageEvent")
public interface MediaKeyMessageEvent extends com.user00.domjnate.api.dom.Event
{
@JsProperty(name="message")
com.user00.domjnate.api.ArrayBuffer getMessage();
@JsProperty(name="messageType")
String getMessageType();
@JsOverlay
public static MediaKeyMessageEvent getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "MediaKeyMessageEvent", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", MediaKeyMessageEvent.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, MediaKeyMessageEvent val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "MediaKeyMessageEvent", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static MediaKeyMessageEvent _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, String type) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "MediaKeyMessageEvent");
  return com.user00.domjnate.util.Js.construct(_win, constructor, MediaKeyMessageEvent.class, type);
}
@JsOverlay
public static MediaKeyMessageEvent _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, String type, MediaKeyMessageEventInit eventInitDict) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "MediaKeyMessageEvent");
  return com.user00.domjnate.util.Js.construct(_win, constructor, MediaKeyMessageEvent.class, type, eventInitDict);
}
}
