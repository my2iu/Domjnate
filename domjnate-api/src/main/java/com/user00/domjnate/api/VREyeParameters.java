package com.user00.domjnate.api;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="VREyeParameters")
public interface VREyeParameters
{
@JsProperty(name="fieldOfView")
VRFieldOfView getFieldOfView();
@JsProperty(name="offset")
Float32Array getOffset();
@JsProperty(name="renderHeight")
double getRenderHeight();
@JsProperty(name="renderWidth")
double getRenderWidth();
@JsOverlay
public static VREyeParameters getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "VREyeParameters", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", VREyeParameters.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, VREyeParameters val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "VREyeParameters", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static VREyeParameters _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "VREyeParameters");
  return com.user00.domjnate.util.Js.construct(_win, constructor, VREyeParameters.class);
}
}
