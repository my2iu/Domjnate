package com.user00.domjnate.api.webgl;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="WebGLTexture")
public interface WebGLTexture extends WebGLObject
{
@JsOverlay
public static WebGLTexture getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "WebGLTexture", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", WebGLTexture.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, WebGLTexture val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "WebGLTexture", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static WebGLTexture _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "WebGLTexture");
  return com.user00.domjnate.util.Js.construct(_win, constructor, WebGLTexture.class);
}
}
