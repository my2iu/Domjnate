package com.user00.domjnate.api;

import jsinterop.annotations.JsFunction;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="XMLHttpRequest")
public interface XMLHttpRequest extends XMLHttpRequestEventTarget
{
@JsProperty(name="onreadystatechange")
OnreadystatechangeCallback getOnreadystatechange();
@JsProperty(name="onreadystatechange")
void setOnreadystatechange(OnreadystatechangeCallback val);
@JsProperty(name="readyState")
double getReadyState();
@JsProperty(name="response")
java.lang.Object getResponse();
@JsProperty(name="responseText")
String getResponseText();
@JsProperty(name="responseType")
String getResponseType();
@JsProperty(name="responseType")
void setResponseType(String val);
@JsProperty(name="responseURL")
String getResponseURL();
@JsProperty(name="responseXML")
com.user00.domjnate.api.dom.Document getResponseXML();
@JsProperty(name="status")
double getStatus();
@JsProperty(name="statusText")
String getStatusText();
@JsProperty(name="timeout")
double getTimeout();
@JsProperty(name="timeout")
void setTimeout(double val);
@JsProperty(name="upload")
XMLHttpRequestUpload getUpload();
@JsProperty(name="withCredentials")
boolean getWithCredentials();
@JsProperty(name="withCredentials")
void setWithCredentials(boolean val);
@JsProperty(name="DONE")
double DONE();
@JsProperty(name="HEADERS_RECEIVED")
double HEADERS_RECEIVED();
@JsProperty(name="LOADING")
double LOADING();
@JsProperty(name="OPENED")
double OPENED();
@JsProperty(name="UNSENT")
double UNSENT();
@JsMethod(name="abort")
void abort();
@JsMethod(name="getAllResponseHeaders")
String getAllResponseHeaders();
@JsMethod(name="getResponseHeader")
String getResponseHeader(String name);
@JsMethod(name="open")
void open(String method, String url);
@JsMethod(name="open")
void open(String method, String url, boolean async);
@JsMethod(name="open")
void open(String method, String url, boolean async, String username);
@JsMethod(name="open")
void open(String method, String url, boolean async, String username, String password);
@JsMethod(name="overrideMimeType")
void overrideMimeType(String mime);
@JsMethod(name="send")
void send();
@JsMethod(name="send")
void send(String body);
@JsMethod(name="send")
void send(com.user00.domjnate.api.stream.ReadableStream<Uint8Array> body);
@JsMethod(name="send")
void send(URLSearchParams body);
@JsMethod(name="send")
void send(FormData body);
@JsMethod(name="send")
void send(ArrayBuffer body);
@JsMethod(name="send")
void send(ArrayBufferView body);
@JsMethod(name="send")
void send(Blob body);
@JsMethod(name="send")
void send(com.user00.domjnate.api.dom.Document body);
@JsMethod(name="setRequestHeader")
void setRequestHeader(String name, String value);
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
@JsFunction public static interface OnreadystatechangeCallback
{
java.lang.Object apply(com.user00.domjnate.api.dom.Event ev);
}
@JsOverlay
public static XMLHttpRequest getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "XMLHttpRequest", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", XMLHttpRequest.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, XMLHttpRequest val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "XMLHttpRequest", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static double DONE(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "XMLHttpRequest", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "DONE", double.class);
}
@JsOverlay
public static double HEADERS_RECEIVED(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "XMLHttpRequest", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "HEADERS_RECEIVED", double.class);
}
@JsOverlay
public static double LOADING(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "XMLHttpRequest", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "LOADING", double.class);
}
@JsOverlay
public static double OPENED(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "XMLHttpRequest", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "OPENED", double.class);
}
@JsOverlay
public static double UNSENT(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "XMLHttpRequest", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "UNSENT", double.class);
}
@JsOverlay
public static XMLHttpRequest _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "XMLHttpRequest");
  return com.user00.domjnate.util.Js.construct(_win, constructor, XMLHttpRequest.class);
}
}
