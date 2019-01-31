package com.user00.domjnate.api;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="PointerEvent")
public interface PointerEvent extends MouseEvent
{
@JsProperty(name="height")
double getHeight();
@JsProperty(name="isPrimary")
boolean getIsPrimary();
@JsProperty(name="pointerId")
double getPointerId();
@JsProperty(name="pointerType")
String getPointerType();
@JsProperty(name="pressure")
double getPressure();
@JsProperty(name="tangentialPressure")
double getTangentialPressure();
@JsProperty(name="tiltX")
double getTiltX();
@JsProperty(name="tiltY")
double getTiltY();
@JsProperty(name="twist")
double getTwist();
@JsProperty(name="width")
double getWidth();
@JsOverlay
public static PointerEvent getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "PointerEvent", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", PointerEvent.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, PointerEvent val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "PointerEvent", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static PointerEvent _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, String type) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "PointerEvent");
  return com.user00.domjnate.util.Js.construct(_win, constructor, PointerEvent.class, type);
}
@JsOverlay
public static PointerEvent _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, String type, PointerEventInit eventInitDict) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "PointerEvent");
  return com.user00.domjnate.util.Js.construct(_win, constructor, PointerEvent.class, type, eventInitDict);
}
}
