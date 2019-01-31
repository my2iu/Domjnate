package com.user00.domjnate.api.webrtc;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="RTCCertificate")
public interface RTCCertificate
{
@JsProperty(name="expires")
double getExpires();
@JsMethod(name="getFingerprints")
com.user00.domjnate.api.Array<RTCDtlsFingerprint> getFingerprints();
@JsOverlay
public static RTCCertificate getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "RTCCertificate", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", RTCCertificate.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, RTCCertificate val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "RTCCertificate", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static com.user00.domjnate.api.Array<java.lang.Object> getSupportedAlgorithms(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  return com.user00.domjnate.util.Js.callStaticMethod(_win, "RTCCertificate", "getSupportedAlgorithms", com.user00.domjnate.api.Array.class);
}
@JsOverlay
public static RTCCertificate _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "RTCCertificate");
  return com.user00.domjnate.util.Js.construct(_win, constructor, RTCCertificate.class);
}
}
