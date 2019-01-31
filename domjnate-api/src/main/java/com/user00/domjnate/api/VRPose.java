package com.user00.domjnate.api;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="VRPose")
public interface VRPose
{
@JsProperty(name="angularAcceleration")
Float32Array getAngularAcceleration();
@JsProperty(name="angularVelocity")
Float32Array getAngularVelocity();
@JsProperty(name="linearAcceleration")
Float32Array getLinearAcceleration();
@JsProperty(name="linearVelocity")
Float32Array getLinearVelocity();
@JsProperty(name="orientation")
Float32Array getOrientation();
@JsProperty(name="position")
Float32Array getPosition();
@JsProperty(name="timestamp")
double getTimestamp();
@JsOverlay
public static VRPose getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "VRPose", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", VRPose.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, VRPose val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "VRPose", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static VRPose _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "VRPose");
  return com.user00.domjnate.util.Js.construct(_win, constructor, VRPose.class);
}
}
