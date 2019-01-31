package com.user00.domjnate.api;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="AnimationTimeline")
public interface AnimationTimeline
{
@JsProperty(name="currentTime")
Double getCurrentTime();
@JsOverlay
public static AnimationTimeline getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "AnimationTimeline", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", AnimationTimeline.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, AnimationTimeline val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "AnimationTimeline", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static AnimationTimeline _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "AnimationTimeline");
  return com.user00.domjnate.util.Js.construct(_win, constructor, AnimationTimeline.class);
}
}
