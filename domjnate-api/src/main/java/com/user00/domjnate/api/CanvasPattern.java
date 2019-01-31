package com.user00.domjnate.api;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="CanvasPattern")
public interface CanvasPattern
{
@JsMethod(name="setTransform")
void setTransform();
@JsMethod(name="setTransform")
void setTransform(DOMMatrix2DInit transform);
@JsOverlay
public static CanvasPattern getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "CanvasPattern", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", CanvasPattern.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, CanvasPattern val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "CanvasPattern", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static CanvasPattern _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "CanvasPattern");
  return com.user00.domjnate.util.Js.construct(_win, constructor, CanvasPattern.class);
}
}
