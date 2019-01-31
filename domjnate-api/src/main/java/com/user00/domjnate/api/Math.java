package com.user00.domjnate.api;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="Math")
public interface Math
{
@JsOverlay
public static double E(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "Math", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "E", double.class);
}
@JsOverlay
public static double LN10(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "Math", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "LN10", double.class);
}
@JsOverlay
public static double LN2(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "Math", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "LN2", double.class);
}
@JsOverlay
public static double LOG2E(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "Math", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "LOG2E", double.class);
}
@JsOverlay
public static double LOG10E(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "Math", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "LOG10E", double.class);
}
@JsOverlay
public static double PI(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "Math", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "PI", double.class);
}
@JsOverlay
public static double SQRT1_2(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "Math", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "SQRT1_2", double.class);
}
@JsOverlay
public static double SQRT2(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "Math", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "SQRT2", double.class);
}
@JsOverlay
public static double abs(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, double x) {
  return com.user00.domjnate.util.Js.callStaticMethod(_win, "Math", "abs", double.class, x);
}
@JsOverlay
public static double acos(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, double x) {
  return com.user00.domjnate.util.Js.callStaticMethod(_win, "Math", "acos", double.class, x);
}
@JsOverlay
public static double asin(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, double x) {
  return com.user00.domjnate.util.Js.callStaticMethod(_win, "Math", "asin", double.class, x);
}
@JsOverlay
public static double atan(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, double x) {
  return com.user00.domjnate.util.Js.callStaticMethod(_win, "Math", "atan", double.class, x);
}
@JsOverlay
public static double atan2(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, double y, double x) {
  return com.user00.domjnate.util.Js.callStaticMethod(_win, "Math", "atan2", double.class, y, x);
}
@JsOverlay
public static double ceil(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, double x) {
  return com.user00.domjnate.util.Js.callStaticMethod(_win, "Math", "ceil", double.class, x);
}
@JsOverlay
public static double cos(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, double x) {
  return com.user00.domjnate.util.Js.callStaticMethod(_win, "Math", "cos", double.class, x);
}
@JsOverlay
public static double exp(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, double x) {
  return com.user00.domjnate.util.Js.callStaticMethod(_win, "Math", "exp", double.class, x);
}
@JsOverlay
public static double floor(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, double x) {
  return com.user00.domjnate.util.Js.callStaticMethod(_win, "Math", "floor", double.class, x);
}
@JsOverlay
public static double log(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, double x) {
  return com.user00.domjnate.util.Js.callStaticMethod(_win, "Math", "log", double.class, x);
}
@JsOverlay
public static double max(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, double... values) {
  return com.user00.domjnate.util.Js.callStaticMethod(_win, "Math", "max", double.class, values);
}
@JsOverlay
public static double min(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, double... values) {
  return com.user00.domjnate.util.Js.callStaticMethod(_win, "Math", "min", double.class, values);
}
@JsOverlay
public static double pow(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, double x, double y) {
  return com.user00.domjnate.util.Js.callStaticMethod(_win, "Math", "pow", double.class, x, y);
}
@JsOverlay
public static double random(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  return com.user00.domjnate.util.Js.callStaticMethod(_win, "Math", "random", double.class);
}
@JsOverlay
public static double round(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, double x) {
  return com.user00.domjnate.util.Js.callStaticMethod(_win, "Math", "round", double.class, x);
}
@JsOverlay
public static double sin(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, double x) {
  return com.user00.domjnate.util.Js.callStaticMethod(_win, "Math", "sin", double.class, x);
}
@JsOverlay
public static double sqrt(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, double x) {
  return com.user00.domjnate.util.Js.callStaticMethod(_win, "Math", "sqrt", double.class, x);
}
@JsOverlay
public static double tan(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, double x) {
  return com.user00.domjnate.util.Js.callStaticMethod(_win, "Math", "tan", double.class, x);
}
}
