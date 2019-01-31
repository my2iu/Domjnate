package com.user00.domjnate.api.webrtc;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="RTCPeerConnectionIceErrorEvent")
public interface RTCPeerConnectionIceErrorEvent extends com.user00.domjnate.api.dom.Event
{
@JsProperty(name="errorCode")
double getErrorCode();
@JsProperty(name="errorText")
String getErrorText();
@JsProperty(name="hostCandidate")
String getHostCandidate();
@JsProperty(name="url")
String getUrl();
@JsOverlay
public static RTCPeerConnectionIceErrorEvent getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "RTCPeerConnectionIceErrorEvent", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", RTCPeerConnectionIceErrorEvent.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, RTCPeerConnectionIceErrorEvent val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "RTCPeerConnectionIceErrorEvent", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static RTCPeerConnectionIceErrorEvent _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, String type, RTCPeerConnectionIceErrorEventInit eventInitDict) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "RTCPeerConnectionIceErrorEvent");
  return com.user00.domjnate.util.Js.construct(_win, constructor, RTCPeerConnectionIceErrorEvent.class, type, eventInitDict);
}
}
