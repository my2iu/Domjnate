package com.user00.domjnate.api.webgl;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="WebGLShaderPrecisionFormat")
public interface WebGLShaderPrecisionFormat
{
@JsProperty(name="precision")
double getPrecision();
@JsProperty(name="rangeMax")
double getRangeMax();
@JsProperty(name="rangeMin")
double getRangeMin();
@JsOverlay
public static WebGLShaderPrecisionFormat getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "WebGLShaderPrecisionFormat", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", WebGLShaderPrecisionFormat.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, WebGLShaderPrecisionFormat val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "WebGLShaderPrecisionFormat", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static WebGLShaderPrecisionFormat _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "WebGLShaderPrecisionFormat");
  return com.user00.domjnate.util.Js.construct(_win, constructor, WebGLShaderPrecisionFormat.class);
}
}
