package com.user00.domjnate.api.performance;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="PerformanceObserver")
public interface PerformanceObserver
{
@JsMethod(name="disconnect")
void disconnect();
@JsMethod(name="observe")
void observe(PerformanceObserverInit options);
@JsMethod(name="takeRecords")
com.user00.domjnate.api.Array<PerformanceEntry> takeRecords();
@JsOverlay
public static PerformanceObserver getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "PerformanceObserver", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", PerformanceObserver.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, PerformanceObserver val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "PerformanceObserver", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static PerformanceObserver _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, PerformanceObserverCallback callback) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "PerformanceObserver");
  return com.user00.domjnate.util.Js.construct(_win, constructor, PerformanceObserver.class, callback);
}
}
