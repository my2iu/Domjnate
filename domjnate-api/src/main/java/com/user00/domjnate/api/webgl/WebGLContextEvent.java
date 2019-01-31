package com.user00.domjnate.api.webgl;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="WebGLContextEvent")
public interface WebGLContextEvent extends com.user00.domjnate.api.dom.Event
{
@JsProperty(name="statusMessage")
String getStatusMessage();
@JsOverlay
public static WebGLContextEvent getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "WebGLContextEvent", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", WebGLContextEvent.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, WebGLContextEvent val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "WebGLContextEvent", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static WebGLContextEvent _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, String type) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "WebGLContextEvent");
  return com.user00.domjnate.util.Js.construct(_win, constructor, WebGLContextEvent.class, type);
}
@JsOverlay
public static WebGLContextEvent _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, String type, WebGLContextEventInit eventInit) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "WebGLContextEvent");
  return com.user00.domjnate.util.Js.construct(_win, constructor, WebGLContextEvent.class, type, eventInit);
}
}
