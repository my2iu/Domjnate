package com.user00.domjnate.api;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="Object")
public interface Object
{
@JsProperty(name="constructor")
Function getConstructor();
@JsProperty(name="constructor")
void setConstructor(Function val);
@JsMethod(name="toString")
String toString();
@JsMethod(name="toLocaleString")
String toLocaleString();
@JsMethod(name="valueOf")
Object valueOf();
@JsMethod(name="hasOwnProperty")
boolean hasOwnProperty(com.user00.domjnate.api.Symbol v);
@JsMethod(name="hasOwnProperty")
boolean hasOwnProperty(double v);
@JsMethod(name="hasOwnProperty")
boolean hasOwnProperty(String v);
@JsMethod(name="isPrototypeOf")
boolean isPrototypeOf(Object v);
@JsMethod(name="propertyIsEnumerable")
boolean propertyIsEnumerable(com.user00.domjnate.api.Symbol v);
@JsMethod(name="propertyIsEnumerable")
boolean propertyIsEnumerable(double v);
@JsMethod(name="propertyIsEnumerable")
boolean propertyIsEnumerable(String v);
@JsOverlay
public static Object getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "Object", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", Object.class);
}
@JsOverlay
public static java.lang.Object getPrototypeOf(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, java.lang.Object o) {
  return com.user00.domjnate.util.Js.callStaticMethod(_win, "Object", "getPrototypeOf", java.lang.Object.class, o);
}
@JsOverlay
public static java.lang.Object getOwnPropertyDescriptor(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, java.lang.Object o, com.user00.domjnate.api.Symbol p) {
  return com.user00.domjnate.util.Js.callStaticMethod(_win, "Object", "getOwnPropertyDescriptor", java.lang.Object.class, o, p);
}
@JsOverlay
public static java.lang.Object getOwnPropertyDescriptor(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, java.lang.Object o, double p) {
  return com.user00.domjnate.util.Js.callStaticMethod(_win, "Object", "getOwnPropertyDescriptor", java.lang.Object.class, o, p);
}
@JsOverlay
public static java.lang.Object getOwnPropertyDescriptor(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, java.lang.Object o, String p) {
  return com.user00.domjnate.util.Js.callStaticMethod(_win, "Object", "getOwnPropertyDescriptor", java.lang.Object.class, o, p);
}
@JsOverlay
public static Array<String> getOwnPropertyNames(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, java.lang.Object o) {
  return com.user00.domjnate.util.Js.callStaticMethod(_win, "Object", "getOwnPropertyNames", Array.class, o);
}
@JsOverlay
public static java.lang.Object create(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, java.lang.Object o) {
  return com.user00.domjnate.util.Js.callStaticMethod(_win, "Object", "create", java.lang.Object.class, o);
}
@JsOverlay
public static java.lang.Object create(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, java.lang.Object o, java.lang.Object properties) {
  return com.user00.domjnate.util.Js.callStaticMethod(_win, "Object", "create", java.lang.Object.class, o, properties);
}
@JsOverlay
public static java.lang.Object defineProperty(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, java.lang.Object o, com.user00.domjnate.api.Symbol p, java.lang.Object attributes) {
  return com.user00.domjnate.util.Js.callStaticMethod(_win, "Object", "defineProperty", java.lang.Object.class, o, p, attributes);
}
@JsOverlay
public static java.lang.Object defineProperty(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, java.lang.Object o, double p, java.lang.Object attributes) {
  return com.user00.domjnate.util.Js.callStaticMethod(_win, "Object", "defineProperty", java.lang.Object.class, o, p, attributes);
}
@JsOverlay
public static java.lang.Object defineProperty(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, java.lang.Object o, String p, java.lang.Object attributes) {
  return com.user00.domjnate.util.Js.callStaticMethod(_win, "Object", "defineProperty", java.lang.Object.class, o, p, attributes);
}
@JsOverlay
public static java.lang.Object defineProperties(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, java.lang.Object o, java.lang.Object properties) {
  return com.user00.domjnate.util.Js.callStaticMethod(_win, "Object", "defineProperties", java.lang.Object.class, o, properties);
}
@JsOverlay
public static <T> T seal(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, Class<T> _type, T o) {
  return com.user00.domjnate.util.Js.callStaticMethod(_win, "Object", "seal", _type, o);
}
@JsOverlay
public static <T> ReadonlyArray<T> freeze(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, Array<T> a) {
  return com.user00.domjnate.util.Js.callStaticMethod(_win, "Object", "freeze", ReadonlyArray.class, a);
}
@JsOverlay
public static <T extends Function> T freeze(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, Class<T> _type, T f) {
  return com.user00.domjnate.util.Js.callStaticMethod(_win, "Object", "freeze", _type, f);
}
@JsOverlay
public static <T> java.lang.Object freeze(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, T o) {
  return com.user00.domjnate.util.Js.callStaticMethod(_win, "Object", "freeze", java.lang.Object.class, o);
}
@JsOverlay
public static <T> T preventExtensions(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, Class<T> _type, T o) {
  return com.user00.domjnate.util.Js.callStaticMethod(_win, "Object", "preventExtensions", _type, o);
}
@JsOverlay
public static boolean isSealed(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, java.lang.Object o) {
  return com.user00.domjnate.util.Js.callStaticMethod(_win, "Object", "isSealed", boolean.class, o);
}
@JsOverlay
public static boolean isFrozen(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, java.lang.Object o) {
  return com.user00.domjnate.util.Js.callStaticMethod(_win, "Object", "isFrozen", boolean.class, o);
}
@JsOverlay
public static boolean isExtensible(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, java.lang.Object o) {
  return com.user00.domjnate.util.Js.callStaticMethod(_win, "Object", "isExtensible", boolean.class, o);
}
@JsOverlay
public static Array<String> keys(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, java.lang.Object o) {
  return com.user00.domjnate.util.Js.callStaticMethod(_win, "Object", "keys", Array.class, o);
}
@JsOverlay
public static java.lang.Object call(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  return com.user00.domjnate.util.Js.callMethod(_win, "Object", java.lang.Object.class);
}
@JsOverlay
public static java.lang.Object call(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, java.lang.Object value) {
  return com.user00.domjnate.util.Js.callMethod(_win, "Object", java.lang.Object.class, value);
}
@JsOverlay
public static Object _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "Object");
  return com.user00.domjnate.util.Js.construct(_win, constructor, Object.class);
}
@JsOverlay
public static Object _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, java.lang.Object value) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "Object");
  return com.user00.domjnate.util.Js.construct(_win, constructor, Object.class, value);
}
}
