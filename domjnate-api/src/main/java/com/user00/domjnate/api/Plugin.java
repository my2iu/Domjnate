package com.user00.domjnate.api;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="Plugin")
public interface Plugin
{
@JsProperty(name="description")
String getDescription();
@JsProperty(name="filename")
String getFilename();
@JsProperty(name="length")
double getLength();
@JsProperty(name="name")
String getName();
@JsProperty(name="version")
String getVersion();
@JsMethod(name="item")
MimeType item(double index);
@JsMethod(name="namedItem")
MimeType namedItem(String type);
@JsOverlay
public default MimeType get(double index) {
  return (MimeType)com.user00.domjnate.util.Js.getIndex(this, index, MimeType.class);
}
@JsOverlay
public default void set(double index, MimeType val) {
  com.user00.domjnate.util.Js.setIndex(this, index, val);
}
@JsOverlay
public static Plugin getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "Plugin", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", Plugin.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, Plugin val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "Plugin", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static Plugin _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "Plugin");
  return com.user00.domjnate.util.Js.construct(_win, constructor, Plugin.class);
}
}
