package com.user00.domjnate.api;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="GamepadPose")
public interface GamepadPose
{
@JsProperty(name="angularAcceleration")
Float32Array getAngularAcceleration();
@JsProperty(name="angularVelocity")
Float32Array getAngularVelocity();
@JsProperty(name="hasOrientation")
boolean getHasOrientation();
@JsProperty(name="hasPosition")
boolean getHasPosition();
@JsProperty(name="linearAcceleration")
Float32Array getLinearAcceleration();
@JsProperty(name="linearVelocity")
Float32Array getLinearVelocity();
@JsProperty(name="orientation")
Float32Array getOrientation();
@JsProperty(name="position")
Float32Array getPosition();
@JsOverlay
public static GamepadPose getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "GamepadPose", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", GamepadPose.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, GamepadPose val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "GamepadPose", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static GamepadPose _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "GamepadPose");
  return com.user00.domjnate.util.Js.construct(_win, constructor, GamepadPose.class);
}
}
