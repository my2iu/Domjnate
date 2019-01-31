package com.user00.domjnate.api;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="TransitionEvent")
public interface TransitionEvent extends com.user00.domjnate.api.dom.Event
{
@JsProperty(name="elapsedTime")
double getElapsedTime();
@JsProperty(name="propertyName")
String getPropertyName();
@JsProperty(name="pseudoElement")
String getPseudoElement();
@JsOverlay
public static TransitionEvent getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "TransitionEvent", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", TransitionEvent.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, TransitionEvent val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "TransitionEvent", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static TransitionEvent _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, String type) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "TransitionEvent");
  return com.user00.domjnate.util.Js.construct(_win, constructor, TransitionEvent.class, type);
}
@JsOverlay
public static TransitionEvent _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, String type, TransitionEventInit transitionEventInitDict) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "TransitionEvent");
  return com.user00.domjnate.util.Js.construct(_win, constructor, TransitionEvent.class, type, transitionEventInitDict);
}
}
