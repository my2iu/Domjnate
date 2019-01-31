package com.user00.domjnate.api;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="MediaError")
public interface MediaError
{
@JsProperty(name="code")
double getCode();
@JsProperty(name="message")
String getMessage();
@JsProperty(name="msExtendedCode")
double getMsExtendedCode();
@JsProperty(name="MEDIA_ERR_ABORTED")
double MEDIA_ERR_ABORTED();
@JsProperty(name="MEDIA_ERR_DECODE")
double MEDIA_ERR_DECODE();
@JsProperty(name="MEDIA_ERR_NETWORK")
double MEDIA_ERR_NETWORK();
@JsProperty(name="MEDIA_ERR_SRC_NOT_SUPPORTED")
double MEDIA_ERR_SRC_NOT_SUPPORTED();
@JsProperty(name="MS_MEDIA_ERR_ENCRYPTED")
double MS_MEDIA_ERR_ENCRYPTED();
@JsOverlay
public static MediaError getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "MediaError", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", MediaError.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, MediaError val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "MediaError", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static double MEDIA_ERR_ABORTED(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "MediaError", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "MEDIA_ERR_ABORTED", double.class);
}
@JsOverlay
public static double MEDIA_ERR_DECODE(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "MediaError", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "MEDIA_ERR_DECODE", double.class);
}
@JsOverlay
public static double MEDIA_ERR_NETWORK(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "MediaError", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "MEDIA_ERR_NETWORK", double.class);
}
@JsOverlay
public static double MEDIA_ERR_SRC_NOT_SUPPORTED(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "MediaError", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "MEDIA_ERR_SRC_NOT_SUPPORTED", double.class);
}
@JsOverlay
public static double MS_MEDIA_ERR_ENCRYPTED(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "MediaError", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "MS_MEDIA_ERR_ENCRYPTED", double.class);
}
@JsOverlay
public static MediaError _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "MediaError");
  return com.user00.domjnate.util.Js.construct(_win, constructor, MediaError.class);
}
}
