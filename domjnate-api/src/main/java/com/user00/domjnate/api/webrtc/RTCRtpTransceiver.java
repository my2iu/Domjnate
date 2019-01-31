package com.user00.domjnate.api.webrtc;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="RTCRtpTransceiver")
public interface RTCRtpTransceiver
{
@JsProperty(name="currentDirection")
String getCurrentDirection();
@JsProperty(name="direction")
String getDirection();
@JsProperty(name="direction")
void setDirection(String val);
@JsProperty(name="mid")
String getMid();
@JsProperty(name="receiver")
RTCRtpReceiver getReceiver();
@JsProperty(name="sender")
RTCRtpSender getSender();
@JsProperty(name="stopped")
boolean getStopped();
@JsMethod(name="setCodecPreferences")
void setCodecPreferences(com.user00.domjnate.api.Array<RTCRtpCodecCapability> codecs);
@JsMethod(name="stop")
void stop();
@JsOverlay
public static RTCRtpTransceiver getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "RTCRtpTransceiver", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", RTCRtpTransceiver.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, RTCRtpTransceiver val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "RTCRtpTransceiver", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static RTCRtpTransceiver _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "RTCRtpTransceiver");
  return com.user00.domjnate.util.Js.construct(_win, constructor, RTCRtpTransceiver.class);
}
}
