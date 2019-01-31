package com.user00.domjnate.api;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="VRDisplayCapabilities")
public interface VRDisplayCapabilities
{
@JsProperty(name="canPresent")
boolean getCanPresent();
@JsProperty(name="hasExternalDisplay")
boolean getHasExternalDisplay();
@JsProperty(name="hasOrientation")
boolean getHasOrientation();
@JsProperty(name="hasPosition")
boolean getHasPosition();
@JsProperty(name="maxLayers")
double getMaxLayers();
@JsOverlay
public static VRDisplayCapabilities getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "VRDisplayCapabilities", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", VRDisplayCapabilities.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, VRDisplayCapabilities val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "VRDisplayCapabilities", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static VRDisplayCapabilities _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "VRDisplayCapabilities");
  return com.user00.domjnate.util.Js.construct(_win, constructor, VRDisplayCapabilities.class);
}
}
