package com.user00.domjnate.api;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="Gamepad")
public interface Gamepad
{
@JsProperty(name="axes")
Array<Double> getAxes();
@JsProperty(name="buttons")
Array<GamepadButton> getButtons();
@JsProperty(name="connected")
boolean getConnected();
@JsProperty(name="displayId")
double getDisplayId();
@JsProperty(name="hand")
String getHand();
@JsProperty(name="hapticActuators")
Array<GamepadHapticActuator> getHapticActuators();
@JsProperty(name="id")
String getId();
@JsProperty(name="index")
double getIndex();
@JsProperty(name="mapping")
String getMapping();
@JsProperty(name="pose")
GamepadPose getPose();
@JsProperty(name="timestamp")
double getTimestamp();
@JsOverlay
public static Gamepad getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "Gamepad", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", Gamepad.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, Gamepad val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "Gamepad", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static Gamepad _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "Gamepad");
  return com.user00.domjnate.util.Js.construct(_win, constructor, Gamepad.class);
}
}
