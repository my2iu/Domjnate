package com.user00.domjnate.api.webgl;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="WebGLRenderbuffer")
public interface WebGLRenderbuffer extends WebGLObject
{
@JsOverlay
public static WebGLRenderbuffer getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "WebGLRenderbuffer", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", WebGLRenderbuffer.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, WebGLRenderbuffer val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "WebGLRenderbuffer", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static WebGLRenderbuffer _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "WebGLRenderbuffer");
  return com.user00.domjnate.util.Js.construct(_win, constructor, WebGLRenderbuffer.class);
}
}
