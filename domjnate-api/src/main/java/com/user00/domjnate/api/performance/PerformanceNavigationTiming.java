package com.user00.domjnate.api.performance;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="PerformanceNavigationTiming")
public interface PerformanceNavigationTiming extends PerformanceResourceTiming
{
@JsProperty(name="domComplete")
double getDomComplete();
@JsProperty(name="domContentLoadedEventEnd")
double getDomContentLoadedEventEnd();
@JsProperty(name="domContentLoadedEventStart")
double getDomContentLoadedEventStart();
@JsProperty(name="domInteractive")
double getDomInteractive();
@JsProperty(name="loadEventEnd")
double getLoadEventEnd();
@JsProperty(name="loadEventStart")
double getLoadEventStart();
@JsProperty(name="redirectCount")
double getRedirectCount();
@JsProperty(name="type")
String getType();
@JsProperty(name="unloadEventEnd")
double getUnloadEventEnd();
@JsProperty(name="unloadEventStart")
double getUnloadEventStart();
@JsMethod(name="toJSON")
java.lang.Object toJSON();
@JsOverlay
public static PerformanceNavigationTiming getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "PerformanceNavigationTiming", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", PerformanceNavigationTiming.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, PerformanceNavigationTiming val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "PerformanceNavigationTiming", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static PerformanceNavigationTiming _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "PerformanceNavigationTiming");
  return com.user00.domjnate.util.Js.construct(_win, constructor, PerformanceNavigationTiming.class);
}
}
