package com.user00.domjnate.api.webrtc;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="RTCRtpSender")
public interface RTCRtpSender
{
@JsProperty(name="dtmf")
RTCDTMFSender getDtmf();
@JsProperty(name="rtcpTransport")
RTCDtlsTransport getRtcpTransport();
@JsProperty(name="track")
com.user00.domjnate.api.mediastream.MediaStreamTrack getTrack();
@JsProperty(name="transport")
RTCDtlsTransport getTransport();
@JsMethod(name="getParameters")
RTCRtpSendParameters getParameters();
@JsMethod(name="getStats")
com.user00.domjnate.api.Promise<RTCStatsReport> getStats();
@JsMethod(name="replaceTrack")
com.user00.domjnate.api.Promise<Void> replaceTrack(com.user00.domjnate.api.mediastream.MediaStreamTrack withTrack);
@JsMethod(name="setParameters")
com.user00.domjnate.api.Promise<Void> setParameters(RTCRtpSendParameters parameters);
@JsMethod(name="setStreams")
void setStreams(com.user00.domjnate.api.mediastream.MediaStream... streams);
@JsOverlay
public static RTCRtpSender getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "RTCRtpSender", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", RTCRtpSender.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, RTCRtpSender val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "RTCRtpSender", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static RTCRtpCapabilities getCapabilities(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, String kind) {
  return com.user00.domjnate.util.Js.callStaticMethod(_win, "RTCRtpSender", "getCapabilities", RTCRtpCapabilities.class, kind);
}
@JsOverlay
public static RTCRtpSender _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "RTCRtpSender");
  return com.user00.domjnate.util.Js.construct(_win, constructor, RTCRtpSender.class);
}
}
