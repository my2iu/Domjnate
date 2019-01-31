package com.user00.domjnate.api.performance;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="PerformanceEntry")
public interface PerformanceEntry
{
@JsProperty(name="duration")
double getDuration();
@JsProperty(name="entryType")
String getEntryType();
@JsProperty(name="name")
String getName();
@JsProperty(name="startTime")
double getStartTime();
@JsMethod(name="toJSON")
java.lang.Object toJSON();
@JsOverlay
public static PerformanceEntry getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "PerformanceEntry", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", PerformanceEntry.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, PerformanceEntry val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "PerformanceEntry", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static PerformanceEntry _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "PerformanceEntry");
  return com.user00.domjnate.util.Js.construct(_win, constructor, PerformanceEntry.class);
}
}
