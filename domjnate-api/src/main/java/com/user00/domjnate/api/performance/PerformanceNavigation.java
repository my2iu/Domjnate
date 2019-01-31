package com.user00.domjnate.api.performance;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="PerformanceNavigation")
public interface PerformanceNavigation
{
@JsProperty(name="redirectCount")
double getRedirectCount();
@JsProperty(name="type")
double getType();
@JsProperty(name="TYPE_BACK_FORWARD")
double TYPE_BACK_FORWARD();
@JsProperty(name="TYPE_NAVIGATE")
double TYPE_NAVIGATE();
@JsProperty(name="TYPE_RELOAD")
double TYPE_RELOAD();
@JsProperty(name="TYPE_RESERVED")
double TYPE_RESERVED();
@JsMethod(name="toJSON")
java.lang.Object toJSON();
@JsOverlay
public static PerformanceNavigation getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "PerformanceNavigation", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", PerformanceNavigation.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, PerformanceNavigation val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "PerformanceNavigation", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static double TYPE_BACK_FORWARD(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "PerformanceNavigation", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "TYPE_BACK_FORWARD", double.class);
}
@JsOverlay
public static double TYPE_NAVIGATE(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "PerformanceNavigation", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "TYPE_NAVIGATE", double.class);
}
@JsOverlay
public static double TYPE_RELOAD(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "PerformanceNavigation", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "TYPE_RELOAD", double.class);
}
@JsOverlay
public static double TYPE_RESERVED(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "PerformanceNavigation", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "TYPE_RESERVED", double.class);
}
@JsOverlay
public static PerformanceNavigation _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "PerformanceNavigation");
  return com.user00.domjnate.util.Js.construct(_win, constructor, PerformanceNavigation.class);
}
}
