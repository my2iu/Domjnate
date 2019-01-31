package com.user00.domjnate.api.webrtc;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="RTCPeerConnectionIceEvent")
public interface RTCPeerConnectionIceEvent extends com.user00.domjnate.api.dom.Event
{
@JsProperty(name="candidate")
RTCIceCandidate getCandidate();
@JsProperty(name="url")
String getUrl();
@JsOverlay
public static RTCPeerConnectionIceEvent getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "RTCPeerConnectionIceEvent", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", RTCPeerConnectionIceEvent.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, RTCPeerConnectionIceEvent val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "RTCPeerConnectionIceEvent", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static RTCPeerConnectionIceEvent _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, String type) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "RTCPeerConnectionIceEvent");
  return com.user00.domjnate.util.Js.construct(_win, constructor, RTCPeerConnectionIceEvent.class, type);
}
@JsOverlay
public static RTCPeerConnectionIceEvent _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, String type, RTCPeerConnectionIceEventInit eventInitDict) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "RTCPeerConnectionIceEvent");
  return com.user00.domjnate.util.Js.construct(_win, constructor, RTCPeerConnectionIceEvent.class, type, eventInitDict);
}
}
