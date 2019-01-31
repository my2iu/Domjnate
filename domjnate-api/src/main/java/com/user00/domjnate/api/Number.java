package com.user00.domjnate.api;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="Number")
public interface Number
{
@JsMethod(name="toLocaleString")
String toLocaleString();
@JsMethod(name="toLocaleString")
String toLocaleString(Array<String> locales);
@JsMethod(name="toLocaleString")
String toLocaleString(String locales);
@JsMethod(name="toLocaleString")
String toLocaleString(Array<String> locales, com.user00.domjnate.api.intl.NumberFormatOptions options);
@JsMethod(name="toLocaleString")
String toLocaleString(String locales, com.user00.domjnate.api.intl.NumberFormatOptions options);
@JsOverlay
public static Number getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "Number", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", Number.class);
}
@JsOverlay
public static double MAX_VALUE(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "Number", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "MAX_VALUE", double.class);
}
@JsOverlay
public static double MIN_VALUE(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "Number", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "MIN_VALUE", double.class);
}
@JsOverlay
public static double getNaN(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "Number", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "NaN", double.class);
}
@JsOverlay
public static double NEGATIVE_INFINITY(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "Number", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "NEGATIVE_INFINITY", double.class);
}
@JsOverlay
public static double POSITIVE_INFINITY(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "Number", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "POSITIVE_INFINITY", double.class);
}
@JsOverlay
public static double call(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  return com.user00.domjnate.util.Js.callMethod(_win, "Number", double.class);
}
@JsOverlay
public static double call(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, java.lang.Object value) {
  return com.user00.domjnate.util.Js.callMethod(_win, "Number", double.class, value);
}
@JsOverlay
public static Number _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "Number");
  return com.user00.domjnate.util.Js.construct(_win, constructor, Number.class);
}
@JsOverlay
public static Number _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, java.lang.Object value) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "Number");
  return com.user00.domjnate.util.Js.construct(_win, constructor, Number.class, value);
}
}
