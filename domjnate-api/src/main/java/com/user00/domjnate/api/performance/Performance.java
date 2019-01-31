package com.user00.domjnate.api.performance;

import jsinterop.annotations.JsFunction;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="Performance")
public interface Performance extends com.user00.domjnate.api.dom.EventTarget
{
@JsProperty(name="navigation")
PerformanceNavigation getNavigation();
@JsProperty(name="onresourcetimingbufferfull")
OnresourcetimingbufferfullCallback getOnresourcetimingbufferfull();
@JsProperty(name="onresourcetimingbufferfull")
void setOnresourcetimingbufferfull(OnresourcetimingbufferfullCallback val);
@JsProperty(name="timeOrigin")
double getTimeOrigin();
@JsProperty(name="timing")
PerformanceTiming getTiming();
@JsMethod(name="clearMarks")
void clearMarks();
@JsMethod(name="clearMarks")
void clearMarks(String markName);
@JsMethod(name="clearMeasures")
void clearMeasures();
@JsMethod(name="clearMeasures")
void clearMeasures(String measureName);
@JsMethod(name="clearResourceTimings")
void clearResourceTimings();
@JsMethod(name="getEntries")
com.user00.domjnate.api.Array<PerformanceEntry> getEntries();
@JsMethod(name="getEntriesByName")
com.user00.domjnate.api.Array<PerformanceEntry> getEntriesByName(String name);
@JsMethod(name="getEntriesByName")
com.user00.domjnate.api.Array<PerformanceEntry> getEntriesByName(String name, String type);
@JsMethod(name="getEntriesByType")
com.user00.domjnate.api.Array<PerformanceEntry> getEntriesByType(String type);
@JsMethod(name="mark")
void mark(String markName);
@JsMethod(name="measure")
void measure(String measureName);
@JsMethod(name="measure")
void measure(String measureName, String startMark);
@JsMethod(name="measure")
void measure(String measureName, String startMark, String endMark);
@JsMethod(name="now")
double now();
@JsMethod(name="setResourceTimingBufferSize")
void setResourceTimingBufferSize(double maxSize);
@JsMethod(name="toJSON")
java.lang.Object toJSON();
// TODO: Suppressing generic keyof type parameter for addEventListener
@JsMethod(name="addEventListener")
void addEventListener(String type, com.user00.domjnate.api.EventListener listener);
@JsMethod(name="addEventListener")
void addEventListener(String type, com.user00.domjnate.api.EventListener listener, com.user00.domjnate.api.AddEventListenerOptions options);
@JsMethod(name="addEventListener")
void addEventListener(String type, com.user00.domjnate.api.EventListener listener, boolean options);
// TODO: Suppressing generic keyof type parameter for removeEventListener
@JsMethod(name="removeEventListener")
void removeEventListener(String type, com.user00.domjnate.api.EventListener listener);
@JsMethod(name="removeEventListener")
void removeEventListener(String type, com.user00.domjnate.api.EventListener listener, com.user00.domjnate.api.EventListenerOptions options);
@JsMethod(name="removeEventListener")
void removeEventListener(String type, com.user00.domjnate.api.EventListener listener, boolean options);
@JsFunction public static interface OnresourcetimingbufferfullCallback
{
java.lang.Object apply(com.user00.domjnate.api.dom.Event ev);
}
@JsOverlay
public static Performance getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "Performance", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", Performance.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, Performance val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "Performance", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static Performance _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "Performance");
  return com.user00.domjnate.util.Js.construct(_win, constructor, Performance.class);
}
}
