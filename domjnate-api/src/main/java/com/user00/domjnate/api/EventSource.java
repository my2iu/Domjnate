package com.user00.domjnate.api;

import jsinterop.annotations.JsFunction;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="EventSource")
public interface EventSource extends com.user00.domjnate.api.dom.EventTarget
{
@JsProperty(name="CLOSED")
double CLOSED();
@JsProperty(name="CONNECTING")
double CONNECTING();
@JsProperty(name="OPEN")
double OPEN();
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
@JsProperty(name="readyState")
double getReadyState();
@JsProperty(name="url")
String getUrl();
@JsProperty(name="withCredentials")
boolean getWithCredentials();
@JsMethod(name="close")
void close();
@JsFunction public static interface OnerrorCallback
{
java.lang.Object apply(MessageEvent evt);
}
@JsFunction public static interface OnmessageCallback
{
java.lang.Object apply(MessageEvent evt);
}
@JsFunction public static interface OnopenCallback
{
java.lang.Object apply(MessageEvent evt);
}
@JsOverlay
public static EventSource getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "EventSource", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", EventSource.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, EventSource val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "EventSource", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static EventSource _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, String url) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "EventSource");
  return com.user00.domjnate.util.Js.construct(_win, constructor, EventSource.class, url);
}
@JsOverlay
public static EventSource _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, String url, EventSourceInit eventSourceInitDict) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "EventSource");
  return com.user00.domjnate.util.Js.construct(_win, constructor, EventSource.class, url, eventSourceInitDict);
}
}
