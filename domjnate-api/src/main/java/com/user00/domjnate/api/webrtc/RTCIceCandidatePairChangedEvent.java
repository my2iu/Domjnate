package com.user00.domjnate.api.webrtc;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="RTCIceCandidatePairChangedEvent")
public interface RTCIceCandidatePairChangedEvent extends com.user00.domjnate.api.dom.Event
{
@JsProperty(name="pair")
RTCIceCandidatePair getPair();
@JsOverlay
public static RTCIceCandidatePairChangedEvent getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "RTCIceCandidatePairChangedEvent", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", RTCIceCandidatePairChangedEvent.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, RTCIceCandidatePairChangedEvent val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "RTCIceCandidatePairChangedEvent", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static RTCIceCandidatePairChangedEvent _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "RTCIceCandidatePairChangedEvent");
  return com.user00.domjnate.util.Js.construct(_win, constructor, RTCIceCandidatePairChangedEvent.class);
}
}
