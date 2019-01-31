package com.user00.domjnate.api.webgl;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="WebGLFramebuffer")
public interface WebGLFramebuffer extends WebGLObject
{
@JsOverlay
public static WebGLFramebuffer getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "WebGLFramebuffer", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", WebGLFramebuffer.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, WebGLFramebuffer val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "WebGLFramebuffer", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static WebGLFramebuffer _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "WebGLFramebuffer");
  return com.user00.domjnate.util.Js.construct(_win, constructor, WebGLFramebuffer.class);
}
}
