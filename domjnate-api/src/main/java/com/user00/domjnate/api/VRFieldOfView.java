package com.user00.domjnate.api;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="VRFieldOfView")
public interface VRFieldOfView
{
@JsProperty(name="downDegrees")
double getDownDegrees();
@JsProperty(name="leftDegrees")
double getLeftDegrees();
@JsProperty(name="rightDegrees")
double getRightDegrees();
@JsProperty(name="upDegrees")
double getUpDegrees();
@JsOverlay
public static VRFieldOfView getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "VRFieldOfView", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", VRFieldOfView.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, VRFieldOfView val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "VRFieldOfView", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static VRFieldOfView _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "VRFieldOfView");
  return com.user00.domjnate.util.Js.construct(_win, constructor, VRFieldOfView.class);
}
}
