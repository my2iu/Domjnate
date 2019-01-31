package com.user00.domjnate.api.performance;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="PerformanceObserverEntryList")
public interface PerformanceObserverEntryList
{
@JsMethod(name="getEntries")
com.user00.domjnate.api.Array<PerformanceEntry> getEntries();
@JsMethod(name="getEntriesByName")
com.user00.domjnate.api.Array<PerformanceEntry> getEntriesByName(String name);
@JsMethod(name="getEntriesByName")
com.user00.domjnate.api.Array<PerformanceEntry> getEntriesByName(String name, String type);
@JsMethod(name="getEntriesByType")
com.user00.domjnate.api.Array<PerformanceEntry> getEntriesByType(String type);
@JsOverlay
public static PerformanceObserverEntryList getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "PerformanceObserverEntryList", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", PerformanceObserverEntryList.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, PerformanceObserverEntryList val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "PerformanceObserverEntryList", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static PerformanceObserverEntryList _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "PerformanceObserverEntryList");
  return com.user00.domjnate.util.Js.construct(_win, constructor, PerformanceObserverEntryList.class);
}
}
