package com.user00.domjnate.api.dom;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="DOMStringList")
public interface DOMStringList
{
@JsProperty(name="length")
double getLength();
@JsMethod(name="contains")
boolean contains(String string);
@JsMethod(name="item")
String item(double index);
@JsOverlay
public default String get(double index) {
  return (String)com.user00.domjnate.util.Js.getIndex(this, index, String.class);
}
@JsOverlay
public default void set(double index, String val) {
  com.user00.domjnate.util.Js.setIndex(this, index, val);
}
@JsOverlay
public static DOMStringList getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "DOMStringList", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", DOMStringList.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, DOMStringList val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "DOMStringList", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static DOMStringList _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "DOMStringList");
  return com.user00.domjnate.util.Js.construct(_win, constructor, DOMStringList.class);
}
}
