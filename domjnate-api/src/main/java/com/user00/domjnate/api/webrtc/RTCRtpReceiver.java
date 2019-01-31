package com.user00.domjnate.api.webrtc;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="RTCRtpReceiver")
public interface RTCRtpReceiver
{
@JsProperty(name="rtcpTransport")
RTCDtlsTransport getRtcpTransport();
@JsProperty(name="track")
com.user00.domjnate.api.mediastream.MediaStreamTrack getTrack();
@JsProperty(name="transport")
RTCDtlsTransport getTransport();
@JsMethod(name="getContributingSources")
com.user00.domjnate.api.Array<RTCRtpContributingSource> getContributingSources();
@JsMethod(name="getParameters")
RTCRtpReceiveParameters getParameters();
@JsMethod(name="getStats")
com.user00.domjnate.api.Promise<RTCStatsReport> getStats();
@JsMethod(name="getSynchronizationSources")
com.user00.domjnate.api.Array<RTCRtpSynchronizationSource> getSynchronizationSources();
@JsOverlay
public static RTCRtpReceiver getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "RTCRtpReceiver", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", RTCRtpReceiver.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, RTCRtpReceiver val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "RTCRtpReceiver", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static RTCRtpCapabilities getCapabilities(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, String kind) {
  return com.user00.domjnate.util.Js.callStaticMethod(_win, "RTCRtpReceiver", "getCapabilities", RTCRtpCapabilities.class, kind);
}
@JsOverlay
public static RTCRtpReceiver _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "RTCRtpReceiver");
  return com.user00.domjnate.util.Js.construct(_win, constructor, RTCRtpReceiver.class);
}
}
