package com.user00.domjnate.api;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="MediaQueryListEvent")
public interface MediaQueryListEvent extends com.user00.domjnate.api.dom.Event
{
@JsProperty(name="matches")
boolean getMatches();
@JsProperty(name="media")
String getMedia();
@JsOverlay
public static MediaQueryListEvent getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "MediaQueryListEvent", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", MediaQueryListEvent.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, MediaQueryListEvent val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "MediaQueryListEvent", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static MediaQueryListEvent _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, String type) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "MediaQueryListEvent");
  return com.user00.domjnate.util.Js.construct(_win, constructor, MediaQueryListEvent.class, type);
}
@JsOverlay
public static MediaQueryListEvent _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, String type, MediaQueryListEventInit eventInitDict) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "MediaQueryListEvent");
  return com.user00.domjnate.util.Js.construct(_win, constructor, MediaQueryListEvent.class, type, eventInitDict);
}
}
