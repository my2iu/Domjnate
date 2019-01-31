package com.user00.domjnate.api;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="Storage")
public interface Storage
{
@JsProperty(name="length")
double getLength();
@JsMethod(name="clear")
void clear();
@JsMethod(name="getItem")
String getItem(String key);
@JsMethod(name="key")
String key(double index);
@JsMethod(name="removeItem")
void removeItem(String key);
@JsMethod(name="setItem")
void setItem(String key, String value);
@JsOverlay
public default java.lang.Object get(String name) {
  return (java.lang.Object)com.user00.domjnate.util.Js.getMember(this, name, java.lang.Object.class);
}
@JsOverlay
public default void set(String name, java.lang.Object val) {
  com.user00.domjnate.util.Js.setMember(this, name, val);
}
@JsOverlay
public static Storage getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "Storage", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", Storage.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, Storage val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "Storage", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static Storage _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "Storage");
  return com.user00.domjnate.util.Js.construct(_win, constructor, Storage.class);
}
}
