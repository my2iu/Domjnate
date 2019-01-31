package com.user00.domjnate.api;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="MSMediaKeyMessageEvent")
public interface MSMediaKeyMessageEvent extends com.user00.domjnate.api.dom.Event
{
@JsProperty(name="destinationURL")
String getDestinationURL();
@JsProperty(name="message")
Uint8Array getMessage();
@JsOverlay
public static MSMediaKeyMessageEvent getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "MSMediaKeyMessageEvent", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", MSMediaKeyMessageEvent.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, MSMediaKeyMessageEvent val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "MSMediaKeyMessageEvent", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static MSMediaKeyMessageEvent _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "MSMediaKeyMessageEvent");
  return com.user00.domjnate.util.Js.construct(_win, constructor, MSMediaKeyMessageEvent.class);
}
}
