package com.user00.domjnate.api;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="TouchEvent")
public interface TouchEvent extends UIEvent
{
@JsProperty(name="altKey")
boolean getAltKey();
@JsProperty(name="changedTouches")
TouchList getChangedTouches();
@JsProperty(name="ctrlKey")
boolean getCtrlKey();
@JsProperty(name="metaKey")
boolean getMetaKey();
@JsProperty(name="shiftKey")
boolean getShiftKey();
@JsProperty(name="targetTouches")
TouchList getTargetTouches();
@JsProperty(name="touches")
TouchList getTouches();
@JsOverlay
public static TouchEvent getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "TouchEvent", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", TouchEvent.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, TouchEvent val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "TouchEvent", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static TouchEvent _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, String type) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "TouchEvent");
  return com.user00.domjnate.util.Js.construct(_win, constructor, TouchEvent.class, type);
}
@JsOverlay
public static TouchEvent _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, String type, TouchEventInit eventInitDict) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "TouchEvent");
  return com.user00.domjnate.util.Js.construct(_win, constructor, TouchEvent.class, type, eventInitDict);
}
}
