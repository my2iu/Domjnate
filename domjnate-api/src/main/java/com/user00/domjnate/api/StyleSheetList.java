package com.user00.domjnate.api;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="StyleSheetList")
public interface StyleSheetList
{
@JsProperty(name="length")
double getLength();
@JsMethod(name="item")
StyleSheet item(double index);
@JsOverlay
public default StyleSheet get(double index) {
  return (StyleSheet)com.user00.domjnate.util.Js.getIndex(this, index, StyleSheet.class);
}
@JsOverlay
public default void set(double index, StyleSheet val) {
  com.user00.domjnate.util.Js.setIndex(this, index, val);
}
@JsOverlay
public static StyleSheetList getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "StyleSheetList", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", StyleSheetList.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, StyleSheetList val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "StyleSheetList", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static StyleSheetList _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "StyleSheetList");
  return com.user00.domjnate.util.Js.construct(_win, constructor, StyleSheetList.class);
}
}
