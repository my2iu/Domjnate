package com.user00.domjnate.api.svg;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="SVGTransformList")
public interface SVGTransformList
{
@JsProperty(name="numberOfItems")
double getNumberOfItems();
@JsMethod(name="appendItem")
SVGTransform appendItem(SVGTransform newItem);
@JsMethod(name="clear")
void clear();
@JsMethod(name="consolidate")
SVGTransform consolidate();
@JsMethod(name="createSVGTransformFromMatrix")
SVGTransform createSVGTransformFromMatrix(com.user00.domjnate.api.DOMMatrix matrix);
@JsMethod(name="getItem")
SVGTransform getItem(double index);
@JsMethod(name="initialize")
SVGTransform initialize(SVGTransform newItem);
@JsMethod(name="insertItemBefore")
SVGTransform insertItemBefore(SVGTransform newItem, double index);
@JsMethod(name="removeItem")
SVGTransform removeItem(double index);
@JsMethod(name="replaceItem")
SVGTransform replaceItem(SVGTransform newItem, double index);
@JsOverlay
public static SVGTransformList getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "SVGTransformList", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", SVGTransformList.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, SVGTransformList val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "SVGTransformList", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static SVGTransformList _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "SVGTransformList");
  return com.user00.domjnate.util.Js.construct(_win, constructor, SVGTransformList.class);
}
}
