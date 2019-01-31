package com.user00.domjnate.api;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="TrackEvent")
public interface TrackEvent extends com.user00.domjnate.api.dom.Event
{
@JsProperty(name="track")
java.lang.Object getTrack();
@JsOverlay
public static TrackEvent getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "TrackEvent", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", TrackEvent.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, TrackEvent val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "TrackEvent", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static TrackEvent _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, String typeArg) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "TrackEvent");
  return com.user00.domjnate.util.Js.construct(_win, constructor, TrackEvent.class, typeArg);
}
@JsOverlay
public static TrackEvent _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, String typeArg, TrackEventInit eventInitDict) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "TrackEvent");
  return com.user00.domjnate.util.Js.construct(_win, constructor, TrackEvent.class, typeArg, eventInitDict);
}
}
