package com.user00.domjnate.api.webrtc;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="RTCDtlsTransportStateChangedEvent")
public interface RTCDtlsTransportStateChangedEvent extends com.user00.domjnate.api.dom.Event
{
@JsProperty(name="state")
String getState();
@JsOverlay
public static RTCDtlsTransportStateChangedEvent getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "RTCDtlsTransportStateChangedEvent", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", RTCDtlsTransportStateChangedEvent.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, RTCDtlsTransportStateChangedEvent val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "RTCDtlsTransportStateChangedEvent", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static RTCDtlsTransportStateChangedEvent _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "RTCDtlsTransportStateChangedEvent");
  return com.user00.domjnate.util.Js.construct(_win, constructor, RTCDtlsTransportStateChangedEvent.class);
}
}
