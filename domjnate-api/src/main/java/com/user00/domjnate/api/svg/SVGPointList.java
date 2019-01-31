package com.user00.domjnate.api.svg;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="SVGPointList")
public interface SVGPointList
{
@JsProperty(name="numberOfItems")
double getNumberOfItems();
@JsMethod(name="appendItem")
com.user00.domjnate.api.DOMPoint appendItem(com.user00.domjnate.api.DOMPoint newItem);
@JsMethod(name="clear")
void clear();
@JsMethod(name="getItem")
com.user00.domjnate.api.DOMPoint getItem(double index);
@JsMethod(name="initialize")
com.user00.domjnate.api.DOMPoint initialize(com.user00.domjnate.api.DOMPoint newItem);
@JsMethod(name="insertItemBefore")
com.user00.domjnate.api.DOMPoint insertItemBefore(com.user00.domjnate.api.DOMPoint newItem, double index);
@JsMethod(name="removeItem")
com.user00.domjnate.api.DOMPoint removeItem(double index);
@JsMethod(name="replaceItem")
com.user00.domjnate.api.DOMPoint replaceItem(com.user00.domjnate.api.DOMPoint newItem, double index);
@JsOverlay
public static SVGPointList getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "SVGPointList", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", SVGPointList.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, SVGPointList val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "SVGPointList", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static SVGPointList _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "SVGPointList");
  return com.user00.domjnate.util.Js.construct(_win, constructor, SVGPointList.class);
}
}
