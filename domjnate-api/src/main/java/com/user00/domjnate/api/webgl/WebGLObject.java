package com.user00.domjnate.api.webgl;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="WebGLObject")
public interface WebGLObject
{
@JsOverlay
public static WebGLObject getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "WebGLObject", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", WebGLObject.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, WebGLObject val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "WebGLObject", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static WebGLObject _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "WebGLObject");
  return com.user00.domjnate.util.Js.construct(_win, constructor, WebGLObject.class);
}
}
