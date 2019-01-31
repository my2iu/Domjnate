package com.user00.domjnate.api.webrtc;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="RTCError")
public interface RTCError extends com.user00.domjnate.api.Error
{
@JsProperty(name="errorDetail")
String getErrorDetail();
@JsProperty(name="errorDetail")
void setErrorDetail(String val);
@JsProperty(name="httpRequestStatusCode")
double getHttpRequestStatusCode();
@JsProperty(name="httpRequestStatusCode")
void setHttpRequestStatusCode(double val);
@JsProperty(name="message")
String getMessage();
@JsProperty(name="message")
void setMessage(String val);
@JsProperty(name="name")
String getName();
@JsProperty(name="name")
void setName(String val);
@JsProperty(name="receivedAlert")
Double getReceivedAlert();
@JsProperty(name="receivedAlert")
void setReceivedAlert(Double val);
@JsProperty(name="sctpCauseCode")
double getSctpCauseCode();
@JsProperty(name="sctpCauseCode")
void setSctpCauseCode(double val);
@JsProperty(name="sdpLineNumber")
double getSdpLineNumber();
@JsProperty(name="sdpLineNumber")
void setSdpLineNumber(double val);
@JsProperty(name="sentAlert")
Double getSentAlert();
@JsProperty(name="sentAlert")
void setSentAlert(Double val);
@JsOverlay
public static RTCError getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "RTCError", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", RTCError.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, RTCError val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "RTCError", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static RTCError _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "RTCError");
  return com.user00.domjnate.util.Js.construct(_win, constructor, RTCError.class);
}
@JsOverlay
public static RTCError _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, String errorDetail) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "RTCError");
  return com.user00.domjnate.util.Js.construct(_win, constructor, RTCError.class, errorDetail);
}
@JsOverlay
public static RTCError _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, String errorDetail, String message) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "RTCError");
  return com.user00.domjnate.util.Js.construct(_win, constructor, RTCError.class, errorDetail, message);
}
}
