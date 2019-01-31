package com.user00.domjnate.api.webgl;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="WebGLUniformLocation")
public interface WebGLUniformLocation
{
@JsOverlay
public static WebGLUniformLocation getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "WebGLUniformLocation", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", WebGLUniformLocation.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, WebGLUniformLocation val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "WebGLUniformLocation", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static WebGLUniformLocation _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "WebGLUniformLocation");
  return com.user00.domjnate.util.Js.construct(_win, constructor, WebGLUniformLocation.class);
}
}
