package com.user00.domjnate.api.webrtc;

import jsinterop.annotations.JsFunction;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="RTCDtlsTransport")
public interface RTCDtlsTransport extends com.user00.domjnate.api.dom.EventTarget
{
@JsProperty(name="onerror")
OnerrorCallback getOnerror();
@JsProperty(name="onerror")
void setOnerror(OnerrorCallback val);
@JsProperty(name="onstatechange")
OnstatechangeCallback getOnstatechange();
@JsProperty(name="onstatechange")
void setOnstatechange(OnstatechangeCallback val);
@JsProperty(name="state")
String getState();
@JsProperty(name="transport")
RTCIceTransport getTransport();
@JsMethod(name="getRemoteCertificates")
com.user00.domjnate.api.Array<com.user00.domjnate.api.ArrayBuffer> getRemoteCertificates();
// TODO: Suppressing generic keyof type parameter for addEventListener
@JsMethod(name="addEventListener")
void addEventListener(String type, com.user00.domjnate.api.EventListener listener);
@JsMethod(name="addEventListener")
void addEventListener(String type, com.user00.domjnate.api.EventListener listener, com.user00.domjnate.api.AddEventListenerOptions options);
@JsMethod(name="addEventListener")
void addEventListener(String type, com.user00.domjnate.api.EventListener listener, boolean options);
// TODO: Suppressing generic keyof type parameter for removeEventListener
@JsMethod(name="removeEventListener")
void removeEventListener(String type, com.user00.domjnate.api.EventListener listener);
@JsMethod(name="removeEventListener")
void removeEventListener(String type, com.user00.domjnate.api.EventListener listener, com.user00.domjnate.api.EventListenerOptions options);
@JsMethod(name="removeEventListener")
void removeEventListener(String type, com.user00.domjnate.api.EventListener listener, boolean options);
@JsFunction public static interface OnerrorCallback
{
java.lang.Object apply(RTCErrorEvent ev);
}
@JsFunction public static interface OnstatechangeCallback
{
java.lang.Object apply(com.user00.domjnate.api.dom.Event ev);
}
@JsOverlay
public static RTCDtlsTransport getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "RTCDtlsTransport", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", RTCDtlsTransport.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, RTCDtlsTransport val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "RTCDtlsTransport", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static RTCDtlsTransport _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "RTCDtlsTransport");
  return com.user00.domjnate.util.Js.construct(_win, constructor, RTCDtlsTransport.class);
}
}
