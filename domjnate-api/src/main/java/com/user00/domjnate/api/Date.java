package com.user00.domjnate.api;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="Date")
public interface Date
{
@JsMethod(name="toLocaleString")
String toLocaleString();
@JsMethod(name="toLocaleString")
String toLocaleString(Array<String> locales);
@JsMethod(name="toLocaleString")
String toLocaleString(String locales);
@JsMethod(name="toLocaleString")
String toLocaleString(Array<String> locales, com.user00.domjnate.api.intl.DateTimeFormatOptions options);
@JsMethod(name="toLocaleString")
String toLocaleString(String locales, com.user00.domjnate.api.intl.DateTimeFormatOptions options);
@JsMethod(name="toLocaleDateString")
String toLocaleDateString();
@JsMethod(name="toLocaleDateString")
String toLocaleDateString(Array<String> locales);
@JsMethod(name="toLocaleDateString")
String toLocaleDateString(String locales);
@JsMethod(name="toLocaleDateString")
String toLocaleDateString(Array<String> locales, com.user00.domjnate.api.intl.DateTimeFormatOptions options);
@JsMethod(name="toLocaleDateString")
String toLocaleDateString(String locales, com.user00.domjnate.api.intl.DateTimeFormatOptions options);
@JsMethod(name="toLocaleTimeString")
String toLocaleTimeString();
@JsMethod(name="toLocaleTimeString")
String toLocaleTimeString(Array<String> locales);
@JsMethod(name="toLocaleTimeString")
String toLocaleTimeString(String locales);
@JsMethod(name="toLocaleTimeString")
String toLocaleTimeString(Array<String> locales, com.user00.domjnate.api.intl.DateTimeFormatOptions options);
@JsMethod(name="toLocaleTimeString")
String toLocaleTimeString(String locales, com.user00.domjnate.api.intl.DateTimeFormatOptions options);
@JsOverlay
public static Date getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "Date", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", Date.class);
}
@JsOverlay
public static double parse(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, String s) {
  return com.user00.domjnate.util.Js.callStaticMethod(_win, "Date", "parse", double.class, s);
}
@JsOverlay
public static double UTC(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, double year, double month) {
  return com.user00.domjnate.util.Js.callStaticMethod(_win, "Date", "UTC", double.class, year, month);
}
@JsOverlay
public static double UTC(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, double year, double month, double date) {
  return com.user00.domjnate.util.Js.callStaticMethod(_win, "Date", "UTC", double.class, year, month, date);
}
@JsOverlay
public static double UTC(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, double year, double month, double date, double hours) {
  return com.user00.domjnate.util.Js.callStaticMethod(_win, "Date", "UTC", double.class, year, month, date, hours);
}
@JsOverlay
public static double UTC(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, double year, double month, double date, double hours, double minutes) {
  return com.user00.domjnate.util.Js.callStaticMethod(_win, "Date", "UTC", double.class, year, month, date, hours, minutes);
}
@JsOverlay
public static double UTC(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, double year, double month, double date, double hours, double minutes, double seconds) {
  return com.user00.domjnate.util.Js.callStaticMethod(_win, "Date", "UTC", double.class, year, month, date, hours, minutes, seconds);
}
@JsOverlay
public static double UTC(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, double year, double month, double date, double hours, double minutes, double seconds, double ms) {
  return com.user00.domjnate.util.Js.callStaticMethod(_win, "Date", "UTC", double.class, year, month, date, hours, minutes, seconds, ms);
}
@JsOverlay
public static double now(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  return com.user00.domjnate.util.Js.callStaticMethod(_win, "Date", "now", double.class);
}
@JsOverlay
public static String call(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  return com.user00.domjnate.util.Js.callMethod(_win, "Date", String.class);
}
@JsOverlay
public static Date _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "Date");
  return com.user00.domjnate.util.Js.construct(_win, constructor, Date.class);
}
@JsOverlay
public static Date _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, String value) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "Date");
  return com.user00.domjnate.util.Js.construct(_win, constructor, Date.class, value);
}
@JsOverlay
public static Date _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, double value) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "Date");
  return com.user00.domjnate.util.Js.construct(_win, constructor, Date.class, value);
}
@JsOverlay
public static Date _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, double year, double month) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "Date");
  return com.user00.domjnate.util.Js.construct(_win, constructor, Date.class, year, month);
}
@JsOverlay
public static Date _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, double year, double month, double date) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "Date");
  return com.user00.domjnate.util.Js.construct(_win, constructor, Date.class, year, month, date);
}
@JsOverlay
public static Date _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, double year, double month, double date, double hours) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "Date");
  return com.user00.domjnate.util.Js.construct(_win, constructor, Date.class, year, month, date, hours);
}
@JsOverlay
public static Date _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, double year, double month, double date, double hours, double minutes) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "Date");
  return com.user00.domjnate.util.Js.construct(_win, constructor, Date.class, year, month, date, hours, minutes);
}
@JsOverlay
public static Date _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, double year, double month, double date, double hours, double minutes, double seconds) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "Date");
  return com.user00.domjnate.util.Js.construct(_win, constructor, Date.class, year, month, date, hours, minutes, seconds);
}
@JsOverlay
public static Date _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, double year, double month, double date, double hours, double minutes, double seconds, double ms) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "Date");
  return com.user00.domjnate.util.Js.construct(_win, constructor, Date.class, year, month, date, hours, minutes, seconds, ms);
}
}
