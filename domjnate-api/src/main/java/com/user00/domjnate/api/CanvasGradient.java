package com.user00.domjnate.api;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="CanvasGradient")
public interface CanvasGradient
{
@JsMethod(name="addColorStop")
void addColorStop(double offset, String color);
@JsOverlay
public static CanvasGradient getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "CanvasGradient", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", CanvasGradient.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, CanvasGradient val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "CanvasGradient", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static CanvasGradient _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "CanvasGradient");
  return com.user00.domjnate.util.Js.construct(_win, constructor, CanvasGradient.class);
}
}
