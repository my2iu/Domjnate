package com.user00.domjnate.api.svg;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="SVGAnimatedTransformList")
public interface SVGAnimatedTransformList
{
@JsProperty(name="animVal")
SVGTransformList getAnimVal();
@JsProperty(name="baseVal")
SVGTransformList getBaseVal();
@JsOverlay
public static SVGAnimatedTransformList getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "SVGAnimatedTransformList", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", SVGAnimatedTransformList.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, SVGAnimatedTransformList val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "SVGAnimatedTransformList", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static SVGAnimatedTransformList _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "SVGAnimatedTransformList");
  return com.user00.domjnate.util.Js.construct(_win, constructor, SVGAnimatedTransformList.class);
}
}
