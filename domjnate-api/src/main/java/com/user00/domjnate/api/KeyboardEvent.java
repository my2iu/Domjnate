package com.user00.domjnate.api;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="KeyboardEvent")
public interface KeyboardEvent extends UIEvent
{
@JsProperty(name="altKey")
boolean getAltKey();
@JsProperty(name="char")
String getChar();
@JsProperty(name="char")
void setChar(String val);
@JsProperty(name="charCode")
double getCharCode();
@JsProperty(name="code")
String getCode();
@JsProperty(name="ctrlKey")
boolean getCtrlKey();
@JsProperty(name="key")
String getKey();
@JsProperty(name="keyCode")
double getKeyCode();
@JsProperty(name="location")
double getLocation();
@JsProperty(name="metaKey")
boolean getMetaKey();
@JsProperty(name="repeat")
boolean getRepeat();
@JsProperty(name="shiftKey")
boolean getShiftKey();
@JsProperty(name="which")
double getWhich();
@JsProperty(name="DOM_KEY_LOCATION_JOYSTICK")
double DOM_KEY_LOCATION_JOYSTICK();
@JsProperty(name="DOM_KEY_LOCATION_LEFT")
double DOM_KEY_LOCATION_LEFT();
@JsProperty(name="DOM_KEY_LOCATION_MOBILE")
double DOM_KEY_LOCATION_MOBILE();
@JsProperty(name="DOM_KEY_LOCATION_NUMPAD")
double DOM_KEY_LOCATION_NUMPAD();
@JsProperty(name="DOM_KEY_LOCATION_RIGHT")
double DOM_KEY_LOCATION_RIGHT();
@JsProperty(name="DOM_KEY_LOCATION_STANDARD")
double DOM_KEY_LOCATION_STANDARD();
@JsMethod(name="getModifierState")
boolean getModifierState(String keyArg);
@JsMethod(name="initKeyboardEvent")
void initKeyboardEvent(String typeArg, boolean canBubbleArg, boolean cancelableArg, Window viewArg, String keyArg, double locationArg, String modifiersListArg, boolean repeat, String locale);
@JsOverlay
public static KeyboardEvent getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "KeyboardEvent", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", KeyboardEvent.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, KeyboardEvent val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "KeyboardEvent", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static double DOM_KEY_LOCATION_JOYSTICK(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "KeyboardEvent", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "DOM_KEY_LOCATION_JOYSTICK", double.class);
}
@JsOverlay
public static double DOM_KEY_LOCATION_LEFT(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "KeyboardEvent", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "DOM_KEY_LOCATION_LEFT", double.class);
}
@JsOverlay
public static double DOM_KEY_LOCATION_MOBILE(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "KeyboardEvent", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "DOM_KEY_LOCATION_MOBILE", double.class);
}
@JsOverlay
public static double DOM_KEY_LOCATION_NUMPAD(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "KeyboardEvent", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "DOM_KEY_LOCATION_NUMPAD", double.class);
}
@JsOverlay
public static double DOM_KEY_LOCATION_RIGHT(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "KeyboardEvent", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "DOM_KEY_LOCATION_RIGHT", double.class);
}
@JsOverlay
public static double DOM_KEY_LOCATION_STANDARD(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "KeyboardEvent", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "DOM_KEY_LOCATION_STANDARD", double.class);
}
@JsOverlay
public static KeyboardEvent _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, String typeArg) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "KeyboardEvent");
  return com.user00.domjnate.util.Js.construct(_win, constructor, KeyboardEvent.class, typeArg);
}
@JsOverlay
public static KeyboardEvent _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, String typeArg, KeyboardEventInit eventInitDict) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "KeyboardEvent");
  return com.user00.domjnate.util.Js.construct(_win, constructor, KeyboardEvent.class, typeArg, eventInitDict);
}
}
