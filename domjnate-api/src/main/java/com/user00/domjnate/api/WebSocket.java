package com.user00.domjnate.api;

import jsinterop.annotations.JsFunction;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="WebSocket")
public interface WebSocket extends com.user00.domjnate.api.dom.EventTarget
{
@JsProperty(name="binaryType")
String getBinaryType();
@JsProperty(name="binaryType")
void setBinaryType(String val);
@JsProperty(name="bufferedAmount")
double getBufferedAmount();
@JsProperty(name="extensions")
String getExtensions();
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
@JsProperty(name="protocol")
String getProtocol();
@JsProperty(name="readyState")
double getReadyState();
@JsProperty(name="url")
String getUrl();
@JsProperty(name="CLOSED")
double CLOSED();
@JsProperty(name="CLOSING")
double CLOSING();
@JsProperty(name="CONNECTING")
double CONNECTING();
@JsProperty(name="OPEN")
double OPEN();
@JsMethod(name="close")
void close();
@JsMethod(name="close")
void close(double code);
@JsMethod(name="close")
void close(double code, String reason);
@JsMethod(name="send")
void send(ArrayBufferView data);
@JsMethod(name="send")
void send(Blob data);
@JsMethod(name="send")
void send(java.lang.Object data);
@JsMethod(name="send")
void send(String data);
// TODO: Suppressing generic keyof type parameter for addEventListener
@JsMethod(name="addEventListener")
void addEventListener(String type, EventListener listener);
@JsMethod(name="addEventListener")
void addEventListener(String type, EventListener listener, AddEventListenerOptions options);
@JsMethod(name="addEventListener")
void addEventListener(String type, EventListener listener, boolean options);
// TODO: Suppressing generic keyof type parameter for removeEventListener
@JsMethod(name="removeEventListener")
void removeEventListener(String type, EventListener listener);
@JsMethod(name="removeEventListener")
void removeEventListener(String type, EventListener listener, EventListenerOptions options);
@JsMethod(name="removeEventListener")
void removeEventListener(String type, EventListener listener, boolean options);
@JsFunction public static interface OnerrorCallback
{
java.lang.Object apply(com.user00.domjnate.api.dom.Event ev);
}
@JsFunction public static interface OncloseCallback
{
java.lang.Object apply(CloseEvent ev);
}
@JsFunction public static interface OnmessageCallback
{
java.lang.Object apply(MessageEvent ev);
}
@JsFunction public static interface OnopenCallback
{
java.lang.Object apply(com.user00.domjnate.api.dom.Event ev);
}
@JsOverlay
public static WebSocket getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "WebSocket", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", WebSocket.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, WebSocket val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "WebSocket", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static double CLOSED(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "WebSocket", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "CLOSED", double.class);
}
@JsOverlay
public static double CLOSING(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "WebSocket", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "CLOSING", double.class);
}
@JsOverlay
public static double CONNECTING(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "WebSocket", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "CONNECTING", double.class);
}
@JsOverlay
public static double OPEN(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "WebSocket", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "OPEN", double.class);
}
@JsOverlay
public static WebSocket _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, String url) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "WebSocket");
  return com.user00.domjnate.util.Js.construct(_win, constructor, WebSocket.class, url);
}
@JsOverlay
public static WebSocket _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, String url, Array<String> protocols) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "WebSocket");
  return com.user00.domjnate.util.Js.construct(_win, constructor, WebSocket.class, url, protocols);
}
@JsOverlay
public static WebSocket _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, String url, String protocols) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "WebSocket");
  return com.user00.domjnate.util.Js.construct(_win, constructor, WebSocket.class, url, protocols);
}
}
