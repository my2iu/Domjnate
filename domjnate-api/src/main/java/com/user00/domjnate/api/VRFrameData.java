package com.user00.domjnate.api;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="VRFrameData")
public interface VRFrameData
{
@JsProperty(name="leftProjectionMatrix")
Float32Array getLeftProjectionMatrix();
@JsProperty(name="leftViewMatrix")
Float32Array getLeftViewMatrix();
@JsProperty(name="pose")
VRPose getPose();
@JsProperty(name="rightProjectionMatrix")
Float32Array getRightProjectionMatrix();
@JsProperty(name="rightViewMatrix")
Float32Array getRightViewMatrix();
@JsProperty(name="timestamp")
double getTimestamp();
@JsOverlay
public static VRFrameData getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "VRFrameData", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", VRFrameData.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, VRFrameData val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "VRFrameData", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static VRFrameData _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "VRFrameData");
  return com.user00.domjnate.util.Js.construct(_win, constructor, VRFrameData.class);
}
}
