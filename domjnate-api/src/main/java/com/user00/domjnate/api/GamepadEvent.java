package com.user00.domjnate.api;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="GamepadEvent")
public interface GamepadEvent extends com.user00.domjnate.api.dom.Event
{
@JsProperty(name="gamepad")
Gamepad getGamepad();
@JsOverlay
public static GamepadEvent getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "GamepadEvent", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", GamepadEvent.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, GamepadEvent val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "GamepadEvent", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static GamepadEvent _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, String typeArg) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "GamepadEvent");
  return com.user00.domjnate.util.Js.construct(_win, constructor, GamepadEvent.class, typeArg);
}
@JsOverlay
public static GamepadEvent _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, String typeArg, GamepadEventInit eventInitDict) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "GamepadEvent");
  return com.user00.domjnate.util.Js.construct(_win, constructor, GamepadEvent.class, typeArg, eventInitDict);
}
}
