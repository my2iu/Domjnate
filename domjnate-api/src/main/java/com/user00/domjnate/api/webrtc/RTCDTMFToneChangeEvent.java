package com.user00.domjnate.api.webrtc;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="RTCDTMFToneChangeEvent")
public interface RTCDTMFToneChangeEvent extends com.user00.domjnate.api.dom.Event
{
@JsProperty(name="tone")
String getTone();
@JsOverlay
public static RTCDTMFToneChangeEvent getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "RTCDTMFToneChangeEvent", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", RTCDTMFToneChangeEvent.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, RTCDTMFToneChangeEvent val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "RTCDTMFToneChangeEvent", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static RTCDTMFToneChangeEvent _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, String type, RTCDTMFToneChangeEventInit eventInitDict) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "RTCDTMFToneChangeEvent");
  return com.user00.domjnate.util.Js.construct(_win, constructor, RTCDTMFToneChangeEvent.class, type, eventInitDict);
}
}
