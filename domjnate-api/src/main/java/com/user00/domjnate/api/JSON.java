package com.user00.domjnate.api;

import jsinterop.annotations.JsFunction;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="JSON")
public interface JSON
{
@JsOverlay
public static java.lang.Object parse(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, String text) {
  return com.user00.domjnate.util.Js.callStaticMethod(_win, "JSON", "parse", java.lang.Object.class, text);
}
@JsOverlay
public static java.lang.Object parse(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, String text, ParseCallback reviver) {
  return com.user00.domjnate.util.Js.callStaticMethod(_win, "JSON", "parse", java.lang.Object.class, text, reviver);
}
@JsOverlay
public static String stringify(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, java.lang.Object value, StringifyCallback replacer) {
  return com.user00.domjnate.util.Js.callStaticMethod(_win, "JSON", "stringify", String.class, value, replacer);
}
@JsOverlay
public static String stringify(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, java.lang.Object value, StringifyCallback replacer, double space) {
  return com.user00.domjnate.util.Js.callStaticMethod(_win, "JSON", "stringify", String.class, value, replacer, space);
}
@JsOverlay
public static String stringify(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, java.lang.Object value, StringifyCallback replacer, String space) {
  return com.user00.domjnate.util.Js.callStaticMethod(_win, "JSON", "stringify", String.class, value, replacer, space);
}
@JsOverlay
public static String stringify(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, java.lang.Object value, Array<String> replacer) {
  return com.user00.domjnate.util.Js.callStaticMethod(_win, "JSON", "stringify", String.class, value, replacer);
}
@JsOverlay
public static String stringify(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, java.lang.Object value, Array<String> replacer, double space) {
  return com.user00.domjnate.util.Js.callStaticMethod(_win, "JSON", "stringify", String.class, value, replacer, space);
}
@JsOverlay
public static String stringify(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, java.lang.Object value, Array<String> replacer, String space) {
  return com.user00.domjnate.util.Js.callStaticMethod(_win, "JSON", "stringify", String.class, value, replacer, space);
}
@JsOverlay
public static String stringify(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, java.lang.Object value) {
  return com.user00.domjnate.util.Js.callStaticMethod(_win, "JSON", "stringify", String.class, value);
}
@JsFunction public static interface ParseCallback
{
java.lang.Object apply(java.lang.Object key, java.lang.Object value);
}
@JsFunction public static interface StringifyCallback
{
java.lang.Object apply(String key, java.lang.Object value);
}
}
