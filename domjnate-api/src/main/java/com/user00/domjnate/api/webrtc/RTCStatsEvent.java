package com.user00.domjnate.api.webrtc;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="RTCStatsEvent")
public interface RTCStatsEvent extends com.user00.domjnate.api.dom.Event
{
@JsProperty(name="report")
RTCStatsReport getReport();
@JsOverlay
public static RTCStatsEvent getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "RTCStatsEvent", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", RTCStatsEvent.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, RTCStatsEvent val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "RTCStatsEvent", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static RTCStatsEvent _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, String type, RTCStatsEventInit eventInitDict) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "RTCStatsEvent");
  return com.user00.domjnate.util.Js.construct(_win, constructor, RTCStatsEvent.class, type, eventInitDict);
}
}
