package com.user00.domjnate.api;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="HashChangeEvent")
public interface HashChangeEvent extends com.user00.domjnate.api.dom.Event
{
@JsProperty(name="newURL")
String getNewURL();
@JsProperty(name="oldURL")
String getOldURL();
@JsOverlay
public static HashChangeEvent getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "HashChangeEvent", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", HashChangeEvent.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, HashChangeEvent val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "HashChangeEvent", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static HashChangeEvent _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, String type) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "HashChangeEvent");
  return com.user00.domjnate.util.Js.construct(_win, constructor, HashChangeEvent.class, type);
}
@JsOverlay
public static HashChangeEvent _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, String type, HashChangeEventInit eventInitDict) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "HashChangeEvent");
  return com.user00.domjnate.util.Js.construct(_win, constructor, HashChangeEvent.class, type, eventInitDict);
}
}
