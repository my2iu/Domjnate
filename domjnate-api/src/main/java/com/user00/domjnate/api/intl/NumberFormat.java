package com.user00.domjnate.api.intl;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="NumberFormat")
public interface NumberFormat
{
@JsMethod(name="format")
String format(double value);
@JsMethod(name="resolvedOptions")
ResolvedNumberFormatOptions resolvedOptions();
@JsOverlay
public static com.user00.domjnate.api.Array<String> supportedLocalesOf(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, com.user00.domjnate.api.Array<String> locales) {
  return com.user00.domjnate.util.Js.callStaticMethod(_win, "NumberFormat", "supportedLocalesOf", com.user00.domjnate.api.Array.class, locales);
}
@JsOverlay
public static com.user00.domjnate.api.Array<String> supportedLocalesOf(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, String locales) {
  return com.user00.domjnate.util.Js.callStaticMethod(_win, "NumberFormat", "supportedLocalesOf", com.user00.domjnate.api.Array.class, locales);
}
@JsOverlay
public static com.user00.domjnate.api.Array<String> supportedLocalesOf(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, com.user00.domjnate.api.Array<String> locales, NumberFormatOptions options) {
  return com.user00.domjnate.util.Js.callStaticMethod(_win, "NumberFormat", "supportedLocalesOf", com.user00.domjnate.api.Array.class, locales, options);
}
@JsOverlay
public static com.user00.domjnate.api.Array<String> supportedLocalesOf(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, String locales, NumberFormatOptions options) {
  return com.user00.domjnate.util.Js.callStaticMethod(_win, "NumberFormat", "supportedLocalesOf", com.user00.domjnate.api.Array.class, locales, options);
}
@JsOverlay
public static NumberFormat call(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  return com.user00.domjnate.util.Js.callMethod(_win, "NumberFormat", NumberFormat.class);
}
@JsOverlay
public static NumberFormat call(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, com.user00.domjnate.api.Array<String> locales) {
  return com.user00.domjnate.util.Js.callMethod(_win, "NumberFormat", NumberFormat.class, locales);
}
@JsOverlay
public static NumberFormat call(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, String locales) {
  return com.user00.domjnate.util.Js.callMethod(_win, "NumberFormat", NumberFormat.class, locales);
}
@JsOverlay
public static NumberFormat call(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, com.user00.domjnate.api.Array<String> locales, NumberFormatOptions options) {
  return com.user00.domjnate.util.Js.callMethod(_win, "NumberFormat", NumberFormat.class, locales, options);
}
@JsOverlay
public static NumberFormat call(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, String locales, NumberFormatOptions options) {
  return com.user00.domjnate.util.Js.callMethod(_win, "NumberFormat", NumberFormat.class, locales, options);
}
@JsOverlay
public static NumberFormat _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "NumberFormat");
  return com.user00.domjnate.util.Js.construct(_win, constructor, NumberFormat.class);
}
@JsOverlay
public static NumberFormat _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, com.user00.domjnate.api.Array<String> locales) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "NumberFormat");
  return com.user00.domjnate.util.Js.construct(_win, constructor, NumberFormat.class, locales);
}
@JsOverlay
public static NumberFormat _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, String locales) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "NumberFormat");
  return com.user00.domjnate.util.Js.construct(_win, constructor, NumberFormat.class, locales);
}
@JsOverlay
public static NumberFormat _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, com.user00.domjnate.api.Array<String> locales, NumberFormatOptions options) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "NumberFormat");
  return com.user00.domjnate.util.Js.construct(_win, constructor, NumberFormat.class, locales, options);
}
@JsOverlay
public static NumberFormat _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, String locales, NumberFormatOptions options) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "NumberFormat");
  return com.user00.domjnate.util.Js.construct(_win, constructor, NumberFormat.class, locales, options);
}
}
