package com.user00.domjnate.api;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="AnimationPlaybackEvent")
public interface AnimationPlaybackEvent extends com.user00.domjnate.api.dom.Event
{
@JsProperty(name="currentTime")
Double getCurrentTime();
@JsProperty(name="timelineTime")
Double getTimelineTime();
@JsOverlay
public static AnimationPlaybackEvent getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "AnimationPlaybackEvent", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", AnimationPlaybackEvent.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, AnimationPlaybackEvent val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "AnimationPlaybackEvent", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static AnimationPlaybackEvent _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, String type) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "AnimationPlaybackEvent");
  return com.user00.domjnate.util.Js.construct(_win, constructor, AnimationPlaybackEvent.class, type);
}
@JsOverlay
public static AnimationPlaybackEvent _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, String type, AnimationPlaybackEventInit eventInitDict) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "AnimationPlaybackEvent");
  return com.user00.domjnate.util.Js.construct(_win, constructor, AnimationPlaybackEvent.class, type, eventInitDict);
}
}
