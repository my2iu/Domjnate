package com.user00.domjnate.api.webrtc;

import jsinterop.annotations.JsFunction;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="RTCDataChannel")
public interface RTCDataChannel extends com.user00.domjnate.api.dom.EventTarget
{
@JsProperty(name="binaryType")
String getBinaryType();
@JsProperty(name="binaryType")
void setBinaryType(String val);
@JsProperty(name="bufferedAmount")
double getBufferedAmount();
@JsProperty(name="bufferedAmountLowThreshold")
double getBufferedAmountLowThreshold();
@JsProperty(name="bufferedAmountLowThreshold")
void setBufferedAmountLowThreshold(double val);
@JsProperty(name="id")
Double getId();
@JsProperty(name="label")
String getLabel();
@JsProperty(name="maxPacketLifeTime")
Double getMaxPacketLifeTime();
@JsProperty(name="maxRetransmits")
Double getMaxRetransmits();
@JsProperty(name="negotiated")
boolean getNegotiated();
@JsProperty(name="onbufferedamountlow")
OnbufferedamountlowCallback getOnbufferedamountlow();
@JsProperty(name="onbufferedamountlow")
void setOnbufferedamountlow(OnbufferedamountlowCallback val);
@JsProperty(name="onclose")
OncloseCallback getOnclose();
@JsProperty(name="onclose")
void setOnclose(OncloseCallback val);
@JsProperty(name="onerror")
OnerrorCallback getOnerror();
@JsProperty(name="onerror")
void setOnerror(OnerrorCallback val);
@JsProperty(name="onmessage")
OnmessageCallback getOnmessage();
@JsProperty(name="onmessage")
void setOnmessage(OnmessageCallback val);
@JsProperty(name="onopen")
OnopenCallback getOnopen();
@JsProperty(name="onopen")
void setOnopen(OnopenCallback val);
@JsProperty(name="ordered")
boolean getOrdered();
@JsProperty(name="priority")
String getPriority();
@JsProperty(name="protocol")
String getProtocol();
@JsProperty(name="readyState")
String getReadyState();
@JsMethod(name="close")
void close();
@JsMethod(name="send")
void send(String data);
@JsMethod(name="send")
void send(com.user00.domjnate.api.Blob data);
@JsMethod(name="send")
void send(com.user00.domjnate.api.ArrayBuffer data);
@JsMethod(name="send")
void send(com.user00.domjnate.api.ArrayBufferView data);
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
@JsFunction public static interface OnbufferedamountlowCallback
{
java.lang.Object apply(com.user00.domjnate.api.dom.Event ev);
}
@JsFunction public static interface OnerrorCallback
{
java.lang.Object apply(RTCErrorEvent ev);
}
@JsFunction public static interface OncloseCallback
{
java.lang.Object apply(com.user00.domjnate.api.dom.Event ev);
}
@JsFunction public static interface OnmessageCallback
{
java.lang.Object apply(com.user00.domjnate.api.MessageEvent ev);
}
@JsFunction public static interface OnopenCallback
{
java.lang.Object apply(com.user00.domjnate.api.dom.Event ev);
}
@JsOverlay
public static RTCDataChannel getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "RTCDataChannel", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", RTCDataChannel.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, RTCDataChannel val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "RTCDataChannel", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static RTCDataChannel _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "RTCDataChannel");
  return com.user00.domjnate.util.Js.construct(_win, constructor, RTCDataChannel.class);
}
}
