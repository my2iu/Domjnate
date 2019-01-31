package com.user00.domjnate.api;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="Response")
public interface Response extends Body
{
@JsProperty(name="headers")
Headers getHeaders();
@JsProperty(name="ok")
boolean getOk();
@JsProperty(name="redirected")
boolean getRedirected();
@JsProperty(name="status")
double getStatus();
@JsProperty(name="statusText")
String getStatusText();
@JsProperty(name="trailer")
Promise<Headers> getTrailer();
@JsProperty(name="type")
String getType();
@JsProperty(name="url")
String getUrl();
@JsMethod(name="clone")
Response clone();
@JsOverlay
public static Response getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "Response", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", Response.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, Response val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "Response", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static Response error(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  return com.user00.domjnate.util.Js.callStaticMethod(_win, "Response", "error", Response.class);
}
@JsOverlay
public static Response redirect(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, String url) {
  return com.user00.domjnate.util.Js.callStaticMethod(_win, "Response", "redirect", Response.class, url);
}
@JsOverlay
public static Response redirect(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, String url, double status) {
  return com.user00.domjnate.util.Js.callStaticMethod(_win, "Response", "redirect", Response.class, url, status);
}
@JsOverlay
public static Response _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "Response");
  return com.user00.domjnate.util.Js.construct(_win, constructor, Response.class);
}
@JsOverlay
public static Response _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, String body) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "Response");
  return com.user00.domjnate.util.Js.construct(_win, constructor, Response.class, body);
}
@JsOverlay
public static Response _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, com.user00.domjnate.api.stream.ReadableStream<Uint8Array> body) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "Response");
  return com.user00.domjnate.util.Js.construct(_win, constructor, Response.class, body);
}
@JsOverlay
public static Response _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, URLSearchParams body) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "Response");
  return com.user00.domjnate.util.Js.construct(_win, constructor, Response.class, body);
}
@JsOverlay
public static Response _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, FormData body) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "Response");
  return com.user00.domjnate.util.Js.construct(_win, constructor, Response.class, body);
}
@JsOverlay
public static Response _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, ArrayBuffer body) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "Response");
  return com.user00.domjnate.util.Js.construct(_win, constructor, Response.class, body);
}
@JsOverlay
public static Response _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, ArrayBufferView body) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "Response");
  return com.user00.domjnate.util.Js.construct(_win, constructor, Response.class, body);
}
@JsOverlay
public static Response _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, Blob body) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "Response");
  return com.user00.domjnate.util.Js.construct(_win, constructor, Response.class, body);
}
@JsOverlay
public static Response _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, String body, ResponseInit init) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "Response");
  return com.user00.domjnate.util.Js.construct(_win, constructor, Response.class, body, init);
}
@JsOverlay
public static Response _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, com.user00.domjnate.api.stream.ReadableStream<Uint8Array> body, ResponseInit init) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "Response");
  return com.user00.domjnate.util.Js.construct(_win, constructor, Response.class, body, init);
}
@JsOverlay
public static Response _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, URLSearchParams body, ResponseInit init) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "Response");
  return com.user00.domjnate.util.Js.construct(_win, constructor, Response.class, body, init);
}
@JsOverlay
public static Response _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, FormData body, ResponseInit init) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "Response");
  return com.user00.domjnate.util.Js.construct(_win, constructor, Response.class, body, init);
}
@JsOverlay
public static Response _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, ArrayBuffer body, ResponseInit init) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "Response");
  return com.user00.domjnate.util.Js.construct(_win, constructor, Response.class, body, init);
}
@JsOverlay
public static Response _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, ArrayBufferView body, ResponseInit init) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "Response");
  return com.user00.domjnate.util.Js.construct(_win, constructor, Response.class, body, init);
}
@JsOverlay
public static Response _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, Blob body, ResponseInit init) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "Response");
  return com.user00.domjnate.util.Js.construct(_win, constructor, Response.class, body, init);
}
}
