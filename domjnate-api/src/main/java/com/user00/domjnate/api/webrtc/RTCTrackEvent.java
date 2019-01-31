package com.user00.domjnate.api.webrtc;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="RTCTrackEvent")
public interface RTCTrackEvent extends com.user00.domjnate.api.dom.Event
{
@JsProperty(name="receiver")
RTCRtpReceiver getReceiver();
@JsProperty(name="streams")
com.user00.domjnate.api.ReadonlyArray<com.user00.domjnate.api.mediastream.MediaStream> getStreams();
@JsProperty(name="track")
com.user00.domjnate.api.mediastream.MediaStreamTrack getTrack();
@JsProperty(name="transceiver")
RTCRtpTransceiver getTransceiver();
@JsOverlay
public static RTCTrackEvent getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "RTCTrackEvent", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", RTCTrackEvent.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, RTCTrackEvent val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "RTCTrackEvent", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static RTCTrackEvent _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, String type, RTCTrackEventInit eventInitDict) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "RTCTrackEvent");
  return com.user00.domjnate.util.Js.construct(_win, constructor, RTCTrackEvent.class, type, eventInitDict);
}
}
