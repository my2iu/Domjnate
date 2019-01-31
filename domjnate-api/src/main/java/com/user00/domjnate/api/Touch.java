package com.user00.domjnate.api;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="Touch")
public interface Touch
{
@JsProperty(name="altitudeAngle")
double getAltitudeAngle();
@JsProperty(name="azimuthAngle")
double getAzimuthAngle();
@JsProperty(name="clientX")
double getClientX();
@JsProperty(name="clientY")
double getClientY();
@JsProperty(name="force")
double getForce();
@JsProperty(name="identifier")
double getIdentifier();
@JsProperty(name="pageX")
double getPageX();
@JsProperty(name="pageY")
double getPageY();
@JsProperty(name="radiusX")
double getRadiusX();
@JsProperty(name="radiusY")
double getRadiusY();
@JsProperty(name="rotationAngle")
double getRotationAngle();
@JsProperty(name="screenX")
double getScreenX();
@JsProperty(name="screenY")
double getScreenY();
@JsProperty(name="target")
com.user00.domjnate.api.dom.EventTarget getTarget();
@JsProperty(name="touchType")
String getTouchType();
@JsOverlay
public static Touch getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "Touch", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", Touch.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, Touch val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "Touch", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static Touch _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, TouchInit touchInitDict) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "Touch");
  return com.user00.domjnate.util.Js.construct(_win, constructor, Touch.class, touchInitDict);
}
}
