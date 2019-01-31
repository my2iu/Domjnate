package com.user00.domjnate.api;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="IntersectionObserverEntry")
public interface IntersectionObserverEntry
{
@JsProperty(name="boundingClientRect")
java.lang.Object getBoundingClientRect();
@JsProperty(name="intersectionRatio")
double getIntersectionRatio();
@JsProperty(name="intersectionRect")
java.lang.Object getIntersectionRect();
@JsProperty(name="isIntersecting")
boolean getIsIntersecting();
@JsProperty(name="rootBounds")
java.lang.Object getRootBounds();
@JsProperty(name="target")
com.user00.domjnate.api.dom.Element getTarget();
@JsProperty(name="time")
double getTime();
@JsOverlay
public static IntersectionObserverEntry getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "IntersectionObserverEntry", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", IntersectionObserverEntry.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, IntersectionObserverEntry val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "IntersectionObserverEntry", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static IntersectionObserverEntry _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, IntersectionObserverEntryInit intersectionObserverEntryInit) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "IntersectionObserverEntry");
  return com.user00.domjnate.util.Js.construct(_win, constructor, IntersectionObserverEntry.class, intersectionObserverEntryInit);
}
}
