package com.user00.domjnate.api;

import jsinterop.annotations.JsFunction;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="FormData")
public interface FormData
{
@JsMethod(name="append")
void append(String name, Blob value);
@JsMethod(name="append")
void append(String name, String value);
@JsMethod(name="append")
void append(String name, Blob value, String fileName);
@JsMethod(name="append")
void append(String name, String value, String fileName);
@JsMethod(name="delete")
void delete(String name);
@JsMethod(name="get")
java.lang.Object get(String name);
@JsMethod(name="getAll")
Array<java.lang.Object> getAll(String name);
@JsMethod(name="has")
boolean has(String name);
@JsMethod(name="set")
void set(String name, Blob value);
@JsMethod(name="set")
void set(String name, String value);
@JsMethod(name="set")
void set(String name, Blob value, String fileName);
@JsMethod(name="set")
void set(String name, String value, String fileName);
@JsMethod(name="forEach")
void forEach(ForEachCallback0 callbackfn);
@JsMethod(name="forEach")
void forEach(ForEachCallback0 callbackfn, java.lang.Object thisArg);
@JsFunction public static interface ForEachCallback0
{
void apply(java.lang.Object value, String key, FormData parent);
}
@JsOverlay
public static FormData getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "FormData", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", FormData.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, FormData val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "FormData", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static FormData _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "FormData");
  return com.user00.domjnate.util.Js.construct(_win, constructor, FormData.class);
}
@JsOverlay
public static FormData _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, com.user00.domjnate.api.html.HTMLFormElement form) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "FormData");
  return com.user00.domjnate.util.Js.construct(_win, constructor, FormData.class, form);
}
}
