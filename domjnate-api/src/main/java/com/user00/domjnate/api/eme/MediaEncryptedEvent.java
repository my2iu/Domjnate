package com.user00.domjnate.api.eme;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="MediaEncryptedEvent")
public interface MediaEncryptedEvent extends com.user00.domjnate.api.dom.Event
{
@JsProperty(name="initData")
com.user00.domjnate.api.ArrayBuffer getInitData();
@JsProperty(name="initDataType")
String getInitDataType();
@JsOverlay
public static MediaEncryptedEvent getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "MediaEncryptedEvent", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", MediaEncryptedEvent.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, MediaEncryptedEvent val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "MediaEncryptedEvent", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static MediaEncryptedEvent _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, String type) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "MediaEncryptedEvent");
  return com.user00.domjnate.util.Js.construct(_win, constructor, MediaEncryptedEvent.class, type);
}
@JsOverlay
public static MediaEncryptedEvent _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, String type, MediaEncryptedEventInit eventInitDict) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "MediaEncryptedEvent");
  return com.user00.domjnate.util.Js.construct(_win, constructor, MediaEncryptedEvent.class, type, eventInitDict);
}
}
