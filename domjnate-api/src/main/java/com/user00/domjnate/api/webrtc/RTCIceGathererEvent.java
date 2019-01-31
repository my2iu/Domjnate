package com.user00.domjnate.api.webrtc;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="RTCIceGathererEvent")
public interface RTCIceGathererEvent extends com.user00.domjnate.api.dom.Event
{
@JsProperty(name="candidate")
java.lang.Object getCandidate();
@JsOverlay
public static RTCIceGathererEvent getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "RTCIceGathererEvent", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", RTCIceGathererEvent.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, RTCIceGathererEvent val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "RTCIceGathererEvent", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static RTCIceGathererEvent _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "RTCIceGathererEvent");
  return com.user00.domjnate.util.Js.construct(_win, constructor, RTCIceGathererEvent.class);
}
}
