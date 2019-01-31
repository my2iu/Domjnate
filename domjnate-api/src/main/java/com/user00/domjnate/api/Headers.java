package com.user00.domjnate.api;

import jsinterop.annotations.JsFunction;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="Headers")
public interface Headers
{
@JsMethod(name="append")
void append(String name, String value);
@JsMethod(name="delete")
void delete(String name);
@JsMethod(name="get")
String get(String name);
@JsMethod(name="has")
boolean has(String name);
@JsMethod(name="set")
void set(String name, String value);
@JsMethod(name="forEach")
void forEach(ForEachCallback0 callbackfn);
@JsMethod(name="forEach")
void forEach(ForEachCallback0 callbackfn, java.lang.Object thisArg);
@JsFunction public static interface ForEachCallback0
{
void apply(String value, String key, Headers parent);
}
@JsOverlay
public static Headers getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "Headers", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", Headers.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, Headers val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "Headers", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static Headers _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "Headers");
  return com.user00.domjnate.util.Js.construct(_win, constructor, Headers.class);
}
@JsOverlay
public static Headers _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, java.lang.Object init) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "Headers");
  return com.user00.domjnate.util.Js.construct(_win, constructor, Headers.class, init);
}
@JsOverlay
public static Headers _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, Array<Array<String>> init) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "Headers");
  return com.user00.domjnate.util.Js.construct(_win, constructor, Headers.class, init);
}
@JsOverlay
public static Headers _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, Headers init) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "Headers");
  return com.user00.domjnate.util.Js.construct(_win, constructor, Headers.class, init);
}
}
