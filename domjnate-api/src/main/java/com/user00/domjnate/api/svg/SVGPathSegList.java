package com.user00.domjnate.api.svg;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="SVGPathSegList")
public interface SVGPathSegList
{
@JsProperty(name="numberOfItems")
double getNumberOfItems();
@JsMethod(name="appendItem")
SVGPathSeg appendItem(SVGPathSeg newItem);
@JsMethod(name="clear")
void clear();
@JsMethod(name="getItem")
SVGPathSeg getItem(double index);
@JsMethod(name="initialize")
SVGPathSeg initialize(SVGPathSeg newItem);
@JsMethod(name="insertItemBefore")
SVGPathSeg insertItemBefore(SVGPathSeg newItem, double index);
@JsMethod(name="removeItem")
SVGPathSeg removeItem(double index);
@JsMethod(name="replaceItem")
SVGPathSeg replaceItem(SVGPathSeg newItem, double index);
@JsOverlay
public static SVGPathSegList getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "SVGPathSegList", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", SVGPathSegList.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, SVGPathSegList val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "SVGPathSegList", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static SVGPathSegList _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "SVGPathSegList");
  return com.user00.domjnate.util.Js.construct(_win, constructor, SVGPathSegList.class);
}
}
