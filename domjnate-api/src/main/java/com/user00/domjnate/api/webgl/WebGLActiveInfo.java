package com.user00.domjnate.api.webgl;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="WebGLActiveInfo")
public interface WebGLActiveInfo
{
@JsProperty(name="name")
String getName();
@JsProperty(name="size")
double getSize();
@JsProperty(name="type")
double getType();
@JsOverlay
public static WebGLActiveInfo getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "WebGLActiveInfo", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", WebGLActiveInfo.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, WebGLActiveInfo val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "WebGLActiveInfo", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static WebGLActiveInfo _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "WebGLActiveInfo");
  return com.user00.domjnate.util.Js.construct(_win, constructor, WebGLActiveInfo.class);
}
}
