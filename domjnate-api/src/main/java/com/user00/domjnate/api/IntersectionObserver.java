package com.user00.domjnate.api;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="IntersectionObserver")
public interface IntersectionObserver
{
@JsProperty(name="root")
com.user00.domjnate.api.dom.Element getRoot();
@JsProperty(name="rootMargin")
String getRootMargin();
@JsProperty(name="thresholds")
Array<Double> getThresholds();
@JsMethod(name="disconnect")
void disconnect();
@JsMethod(name="observe")
void observe(com.user00.domjnate.api.dom.Element target);
@JsMethod(name="takeRecords")
Array<IntersectionObserverEntry> takeRecords();
@JsMethod(name="unobserve")
void unobserve(com.user00.domjnate.api.dom.Element target);
@JsOverlay
public static IntersectionObserver getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "IntersectionObserver", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", IntersectionObserver.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, IntersectionObserver val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "IntersectionObserver", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static IntersectionObserver _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, IntersectionObserverCallback callback) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "IntersectionObserver");
  return com.user00.domjnate.util.Js.construct(_win, constructor, IntersectionObserver.class, callback);
}
@JsOverlay
public static IntersectionObserver _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, IntersectionObserverCallback callback, IntersectionObserverInit options) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "IntersectionObserver");
  return com.user00.domjnate.util.Js.construct(_win, constructor, IntersectionObserver.class, callback, options);
}
}
