package com.user00.domjnate.api.webrtc;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="RTCSessionDescription")
public interface RTCSessionDescription
{
@JsProperty(name="sdp")
String getSdp();
@JsProperty(name="type")
String getType();
@JsMethod(name="toJSON")
java.lang.Object toJSON();
@JsOverlay
public static RTCSessionDescription getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "RTCSessionDescription", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", RTCSessionDescription.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, RTCSessionDescription val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "RTCSessionDescription", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static RTCSessionDescription _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, RTCSessionDescriptionInit descriptionInitDict) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "RTCSessionDescription");
  return com.user00.domjnate.util.Js.construct(_win, constructor, RTCSessionDescription.class, descriptionInitDict);
}
}
