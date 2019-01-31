package com.user00.domjnate.api.svg;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="SVGStringList")
public interface SVGStringList
{
@JsProperty(name="length")
double getLength();
@JsProperty(name="numberOfItems")
double getNumberOfItems();
@JsMethod(name="appendItem")
String appendItem(String newItem);
@JsMethod(name="clear")
void clear();
@JsMethod(name="getItem")
String getItem(double index);
@JsMethod(name="initialize")
String initialize(String newItem);
@JsMethod(name="insertItemBefore")
String insertItemBefore(String newItem, double index);
@JsMethod(name="removeItem")
String removeItem(double index);
@JsMethod(name="replaceItem")
String replaceItem(String newItem, double index);
@JsOverlay
public default String get(double index) {
  return (String)com.user00.domjnate.util.Js.getIndex(this, index, String.class);
}
@JsOverlay
public default void set(double index, String val) {
  com.user00.domjnate.util.Js.setIndex(this, index, val);
}
@JsOverlay
public static SVGStringList getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "SVGStringList", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", SVGStringList.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, SVGStringList val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "SVGStringList", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static SVGStringList _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "SVGStringList");
  return com.user00.domjnate.util.Js.construct(_win, constructor, SVGStringList.class);
}
}
