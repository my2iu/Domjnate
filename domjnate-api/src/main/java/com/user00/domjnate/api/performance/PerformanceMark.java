package com.user00.domjnate.api.performance;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="PerformanceMark")
public interface PerformanceMark extends PerformanceEntry
{
@JsOverlay
public static PerformanceMark getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "PerformanceMark", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", PerformanceMark.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, PerformanceMark val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "PerformanceMark", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static PerformanceMark _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "PerformanceMark");
  return com.user00.domjnate.util.Js.construct(_win, constructor, PerformanceMark.class);
}
}
