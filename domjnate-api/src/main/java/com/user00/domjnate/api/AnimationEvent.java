package com.user00.domjnate.api;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="AnimationEvent")
public interface AnimationEvent extends com.user00.domjnate.api.dom.Event
{
@JsProperty(name="animationName")
String getAnimationName();
@JsProperty(name="elapsedTime")
double getElapsedTime();
@JsProperty(name="pseudoElement")
String getPseudoElement();
@JsOverlay
public static AnimationEvent getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "AnimationEvent", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", AnimationEvent.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, AnimationEvent val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "AnimationEvent", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static AnimationEvent _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, String type) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "AnimationEvent");
  return com.user00.domjnate.util.Js.construct(_win, constructor, AnimationEvent.class, type);
}
@JsOverlay
public static AnimationEvent _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, String type, AnimationEventInit animationEventInitDict) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "AnimationEvent");
  return com.user00.domjnate.util.Js.construct(_win, constructor, AnimationEvent.class, type, animationEventInitDict);
}
}
