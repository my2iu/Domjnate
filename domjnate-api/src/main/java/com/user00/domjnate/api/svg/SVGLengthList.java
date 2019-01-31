package com.user00.domjnate.api.svg;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="SVGLengthList")
public interface SVGLengthList
{
@JsProperty(name="length")
double getLength();
@JsProperty(name="numberOfItems")
double getNumberOfItems();
@JsMethod(name="appendItem")
SVGLength appendItem(SVGLength newItem);
@JsMethod(name="clear")
void clear();
@JsMethod(name="getItem")
SVGLength getItem(double index);
@JsMethod(name="initialize")
SVGLength initialize(SVGLength newItem);
@JsMethod(name="insertItemBefore")
SVGLength insertItemBefore(SVGLength newItem, double index);
@JsMethod(name="removeItem")
SVGLength removeItem(double index);
@JsMethod(name="replaceItem")
SVGLength replaceItem(SVGLength newItem, double index);
@JsOverlay
public default SVGLength get(double index) {
  return (SVGLength)com.user00.domjnate.util.Js.getIndex(this, index, SVGLength.class);
}
@JsOverlay
public default void set(double index, SVGLength val) {
  com.user00.domjnate.util.Js.setIndex(this, index, val);
}
@JsOverlay
public static SVGLengthList getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "SVGLengthList", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", SVGLengthList.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, SVGLengthList val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "SVGLengthList", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static SVGLengthList _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "SVGLengthList");
  return com.user00.domjnate.util.Js.construct(_win, constructor, SVGLengthList.class);
}
}
