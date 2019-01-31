package com.user00.domjnate.api.webrtc;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="RTCErrorEvent")
public interface RTCErrorEvent extends com.user00.domjnate.api.dom.Event
{
@JsProperty(name="error")
RTCError getError();
@JsOverlay
public static RTCErrorEvent getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "RTCErrorEvent", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", RTCErrorEvent.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, RTCErrorEvent val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "RTCErrorEvent", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static RTCErrorEvent _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, String type, RTCErrorEventInit eventInitDict) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "RTCErrorEvent");
  return com.user00.domjnate.util.Js.construct(_win, constructor, RTCErrorEvent.class, type, eventInitDict);
}
}
