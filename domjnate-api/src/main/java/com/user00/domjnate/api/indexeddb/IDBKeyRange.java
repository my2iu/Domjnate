package com.user00.domjnate.api.indexeddb;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="IDBKeyRange")
public interface IDBKeyRange
{
@JsProperty(name="lower")
java.lang.Object getLower();
@JsProperty(name="lowerOpen")
boolean getLowerOpen();
@JsProperty(name="upper")
java.lang.Object getUpper();
@JsProperty(name="upperOpen")
boolean getUpperOpen();
@JsMethod(name="includes")
boolean includes(java.lang.Object key);
@JsOverlay
public static IDBKeyRange getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "IDBKeyRange", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", IDBKeyRange.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, IDBKeyRange val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "IDBKeyRange", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static IDBKeyRange bound(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, java.lang.Object lower, java.lang.Object upper) {
  return com.user00.domjnate.util.Js.callStaticMethod(_win, "IDBKeyRange", "bound", IDBKeyRange.class, lower, upper);
}
@JsOverlay
public static IDBKeyRange bound(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, java.lang.Object lower, java.lang.Object upper, boolean lowerOpen) {
  return com.user00.domjnate.util.Js.callStaticMethod(_win, "IDBKeyRange", "bound", IDBKeyRange.class, lower, upper, lowerOpen);
}
@JsOverlay
public static IDBKeyRange bound(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, java.lang.Object lower, java.lang.Object upper, boolean lowerOpen, boolean upperOpen) {
  return com.user00.domjnate.util.Js.callStaticMethod(_win, "IDBKeyRange", "bound", IDBKeyRange.class, lower, upper, lowerOpen, upperOpen);
}
@JsOverlay
public static IDBKeyRange lowerBound(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, java.lang.Object lower) {
  return com.user00.domjnate.util.Js.callStaticMethod(_win, "IDBKeyRange", "lowerBound", IDBKeyRange.class, lower);
}
@JsOverlay
public static IDBKeyRange lowerBound(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, java.lang.Object lower, boolean open) {
  return com.user00.domjnate.util.Js.callStaticMethod(_win, "IDBKeyRange", "lowerBound", IDBKeyRange.class, lower, open);
}
@JsOverlay
public static IDBKeyRange only(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, java.lang.Object value) {
  return com.user00.domjnate.util.Js.callStaticMethod(_win, "IDBKeyRange", "only", IDBKeyRange.class, value);
}
@JsOverlay
public static IDBKeyRange upperBound(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, java.lang.Object upper) {
  return com.user00.domjnate.util.Js.callStaticMethod(_win, "IDBKeyRange", "upperBound", IDBKeyRange.class, upper);
}
@JsOverlay
public static IDBKeyRange upperBound(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, java.lang.Object upper, boolean open) {
  return com.user00.domjnate.util.Js.callStaticMethod(_win, "IDBKeyRange", "upperBound", IDBKeyRange.class, upper, open);
}
@JsOverlay
public static IDBKeyRange _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "IDBKeyRange");
  return com.user00.domjnate.util.Js.construct(_win, constructor, IDBKeyRange.class);
}
}
