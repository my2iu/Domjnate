package com.user00.domjnate.api;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="PopStateEvent")
public interface PopStateEvent extends com.user00.domjnate.api.dom.Event
{
@JsProperty(name="state")
java.lang.Object getState();
@JsOverlay
public static PopStateEvent getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "PopStateEvent", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", PopStateEvent.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, PopStateEvent val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "PopStateEvent", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static PopStateEvent _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, String type) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "PopStateEvent");
  return com.user00.domjnate.util.Js.construct(_win, constructor, PopStateEvent.class, type);
}
@JsOverlay
public static PopStateEvent _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, String type, PopStateEventInit eventInitDict) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "PopStateEvent");
  return com.user00.domjnate.util.Js.construct(_win, constructor, PopStateEvent.class, type, eventInitDict);
}
}
