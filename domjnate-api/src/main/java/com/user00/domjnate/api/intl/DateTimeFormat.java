package com.user00.domjnate.api.intl;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="DateTimeFormat")
public interface DateTimeFormat
{
@JsMethod(name="format")
String format();
@JsMethod(name="format")
String format(double date);
@JsMethod(name="format")
String format(com.user00.domjnate.api.Date date);
@JsMethod(name="resolvedOptions")
ResolvedDateTimeFormatOptions resolvedOptions();
@JsOverlay
public static com.user00.domjnate.api.Array<String> supportedLocalesOf(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, com.user00.domjnate.api.Array<String> locales) {
  return com.user00.domjnate.util.Js.callStaticMethod(_win, "DateTimeFormat", "supportedLocalesOf", com.user00.domjnate.api.Array.class, locales);
}
@JsOverlay
public static com.user00.domjnate.api.Array<String> supportedLocalesOf(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, String locales) {
  return com.user00.domjnate.util.Js.callStaticMethod(_win, "DateTimeFormat", "supportedLocalesOf", com.user00.domjnate.api.Array.class, locales);
}
@JsOverlay
public static com.user00.domjnate.api.Array<String> supportedLocalesOf(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, com.user00.domjnate.api.Array<String> locales, DateTimeFormatOptions options) {
  return com.user00.domjnate.util.Js.callStaticMethod(_win, "DateTimeFormat", "supportedLocalesOf", com.user00.domjnate.api.Array.class, locales, options);
}
@JsOverlay
public static com.user00.domjnate.api.Array<String> supportedLocalesOf(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, String locales, DateTimeFormatOptions options) {
  return com.user00.domjnate.util.Js.callStaticMethod(_win, "DateTimeFormat", "supportedLocalesOf", com.user00.domjnate.api.Array.class, locales, options);
}
@JsOverlay
public static DateTimeFormat call(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  return com.user00.domjnate.util.Js.callMethod(_win, "DateTimeFormat", DateTimeFormat.class);
}
@JsOverlay
public static DateTimeFormat call(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, com.user00.domjnate.api.Array<String> locales) {
  return com.user00.domjnate.util.Js.callMethod(_win, "DateTimeFormat", DateTimeFormat.class, locales);
}
@JsOverlay
public static DateTimeFormat call(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, String locales) {
  return com.user00.domjnate.util.Js.callMethod(_win, "DateTimeFormat", DateTimeFormat.class, locales);
}
@JsOverlay
public static DateTimeFormat call(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, com.user00.domjnate.api.Array<String> locales, DateTimeFormatOptions options) {
  return com.user00.domjnate.util.Js.callMethod(_win, "DateTimeFormat", DateTimeFormat.class, locales, options);
}
@JsOverlay
public static DateTimeFormat call(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, String locales, DateTimeFormatOptions options) {
  return com.user00.domjnate.util.Js.callMethod(_win, "DateTimeFormat", DateTimeFormat.class, locales, options);
}
@JsOverlay
public static DateTimeFormat _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "DateTimeFormat");
  return com.user00.domjnate.util.Js.construct(_win, constructor, DateTimeFormat.class);
}
@JsOverlay
public static DateTimeFormat _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, com.user00.domjnate.api.Array<String> locales) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "DateTimeFormat");
  return com.user00.domjnate.util.Js.construct(_win, constructor, DateTimeFormat.class, locales);
}
@JsOverlay
public static DateTimeFormat _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, String locales) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "DateTimeFormat");
  return com.user00.domjnate.util.Js.construct(_win, constructor, DateTimeFormat.class, locales);
}
@JsOverlay
public static DateTimeFormat _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, com.user00.domjnate.api.Array<String> locales, DateTimeFormatOptions options) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "DateTimeFormat");
  return com.user00.domjnate.util.Js.construct(_win, constructor, DateTimeFormat.class, locales, options);
}
@JsOverlay
public static DateTimeFormat _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, String locales, DateTimeFormatOptions options) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "DateTimeFormat");
  return com.user00.domjnate.util.Js.construct(_win, constructor, DateTimeFormat.class, locales, options);
}
}
