package com.user00.domjnate.api.performance;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="PerformanceMeasure")
public interface PerformanceMeasure extends PerformanceEntry
{
@JsOverlay
public static PerformanceMeasure getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "PerformanceMeasure", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", PerformanceMeasure.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, PerformanceMeasure val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "PerformanceMeasure", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static PerformanceMeasure _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "PerformanceMeasure");
  return com.user00.domjnate.util.Js.construct(_win, constructor, PerformanceMeasure.class);
}
}
