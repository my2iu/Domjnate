package com.user00.domjnate.api.webrtc;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="RTCIceCandidate")
public interface RTCIceCandidate
{
@JsProperty(name="candidate")
String getCandidate();
@JsProperty(name="component")
String getComponent();
@JsProperty(name="foundation")
String getFoundation();
@JsProperty(name="ip")
String getIp();
@JsProperty(name="port")
Double getPort();
@JsProperty(name="priority")
Double getPriority();
@JsProperty(name="protocol")
String getProtocol();
@JsProperty(name="relatedAddress")
String getRelatedAddress();
@JsProperty(name="relatedPort")
Double getRelatedPort();
@JsProperty(name="sdpMLineIndex")
Double getSdpMLineIndex();
@JsProperty(name="sdpMid")
String getSdpMid();
@JsProperty(name="tcpType")
String getTcpType();
@JsProperty(name="type")
String getType();
@JsProperty(name="usernameFragment")
String getUsernameFragment();
@JsMethod(name="toJSON")
RTCIceCandidateInit toJSON();
@JsOverlay
public static RTCIceCandidate getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "RTCIceCandidate", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", RTCIceCandidate.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, RTCIceCandidate val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "RTCIceCandidate", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static RTCIceCandidate _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "RTCIceCandidate");
  return com.user00.domjnate.util.Js.construct(_win, constructor, RTCIceCandidate.class);
}
@JsOverlay
public static RTCIceCandidate _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, RTCIceCandidateInit candidateInitDict) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "RTCIceCandidate");
  return com.user00.domjnate.util.Js.construct(_win, constructor, RTCIceCandidate.class, candidateInitDict);
}
}
