package com.user00.domjnate.api.webrtc;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="RTCDataChannelEvent")
public interface RTCDataChannelEvent extends com.user00.domjnate.api.dom.Event
{
@JsProperty(name="channel")
RTCDataChannel getChannel();
@JsOverlay
public static RTCDataChannelEvent getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "RTCDataChannelEvent", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", RTCDataChannelEvent.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, RTCDataChannelEvent val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "RTCDataChannelEvent", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static RTCDataChannelEvent _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, String type, RTCDataChannelEventInit eventInitDict) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "RTCDataChannelEvent");
  return com.user00.domjnate.util.Js.construct(_win, constructor, RTCDataChannelEvent.class, type, eventInitDict);
}
}
