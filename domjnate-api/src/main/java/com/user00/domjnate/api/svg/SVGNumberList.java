package com.user00.domjnate.api.svg;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="SVGNumberList")
public interface SVGNumberList
{
@JsProperty(name="length")
double getLength();
@JsProperty(name="numberOfItems")
double getNumberOfItems();
@JsMethod(name="appendItem")
SVGNumber appendItem(SVGNumber newItem);
@JsMethod(name="clear")
void clear();
@JsMethod(name="getItem")
SVGNumber getItem(double index);
@JsMethod(name="initialize")
SVGNumber initialize(SVGNumber newItem);
@JsMethod(name="insertItemBefore")
SVGNumber insertItemBefore(SVGNumber newItem, double index);
@JsMethod(name="removeItem")
SVGNumber removeItem(double index);
@JsMethod(name="replaceItem")
SVGNumber replaceItem(SVGNumber newItem, double index);
@JsOverlay
public default SVGNumber get(double index) {
  return (SVGNumber)com.user00.domjnate.util.Js.getIndex(this, index, SVGNumber.class);
}
@JsOverlay
public default void set(double index, SVGNumber val) {
  com.user00.domjnate.util.Js.setIndex(this, index, val);
}
@JsOverlay
public static SVGNumberList getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "SVGNumberList", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", SVGNumberList.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, SVGNumberList val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "SVGNumberList", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static SVGNumberList _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "SVGNumberList");
  return com.user00.domjnate.util.Js.construct(_win, constructor, SVGNumberList.class);
}
}
