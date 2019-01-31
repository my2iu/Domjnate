package com.user00.domjnate.api;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="GamepadButton")
public interface GamepadButton
{
@JsProperty(name="pressed")
boolean getPressed();
@JsProperty(name="touched")
boolean getTouched();
@JsProperty(name="value")
double getValue();
@JsOverlay
public static GamepadButton getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "GamepadButton", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", GamepadButton.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, GamepadButton val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "GamepadButton", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static GamepadButton _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "GamepadButton");
  return com.user00.domjnate.util.Js.construct(_win, constructor, GamepadButton.class);
}
}
