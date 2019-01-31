package com.user00.domjnate.api;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="MimeTypeArray")
public interface MimeTypeArray
{
@JsProperty(name="length")
double getLength();
@JsMethod(name="item")
Plugin item(double index);
@JsMethod(name="namedItem")
Plugin namedItem(String type);
@JsOverlay
public default Plugin get(double index) {
  return (Plugin)com.user00.domjnate.util.Js.getIndex(this, index, Plugin.class);
}
@JsOverlay
public default void set(double index, Plugin val) {
  com.user00.domjnate.util.Js.setIndex(this, index, val);
}
@JsOverlay
public static MimeTypeArray getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "MimeTypeArray", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", MimeTypeArray.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, MimeTypeArray val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "MimeTypeArray", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static MimeTypeArray _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "MimeTypeArray");
  return com.user00.domjnate.util.Js.construct(_win, constructor, MimeTypeArray.class);
}
}
