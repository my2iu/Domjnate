package com.user00.domjnate.api.dom;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="TimeRanges")
public interface TimeRanges
{
@JsProperty(name="length")
double getLength();
@JsMethod(name="end")
double end(double index);
@JsMethod(name="start")
double start(double index);
@JsOverlay
public static TimeRanges getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "TimeRanges", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", TimeRanges.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, TimeRanges val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "TimeRanges", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static TimeRanges _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "TimeRanges");
  return com.user00.domjnate.util.Js.construct(_win, constructor, TimeRanges.class);
}
}
