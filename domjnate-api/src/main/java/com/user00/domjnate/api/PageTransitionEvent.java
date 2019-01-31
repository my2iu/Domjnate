package com.user00.domjnate.api;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="PageTransitionEvent")
public interface PageTransitionEvent extends com.user00.domjnate.api.dom.Event
{
@JsProperty(name="persisted")
boolean getPersisted();
@JsOverlay
public static PageTransitionEvent getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "PageTransitionEvent", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", PageTransitionEvent.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, PageTransitionEvent val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "PageTransitionEvent", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static PageTransitionEvent _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "PageTransitionEvent");
  return com.user00.domjnate.util.Js.construct(_win, constructor, PageTransitionEvent.class);
}
}
