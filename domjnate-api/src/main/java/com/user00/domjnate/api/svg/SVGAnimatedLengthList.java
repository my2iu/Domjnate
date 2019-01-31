package com.user00.domjnate.api.svg;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="SVGAnimatedLengthList")
public interface SVGAnimatedLengthList
{
@JsProperty(name="animVal")
SVGLengthList getAnimVal();
@JsProperty(name="baseVal")
SVGLengthList getBaseVal();
@JsOverlay
public static SVGAnimatedLengthList getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "SVGAnimatedLengthList", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", SVGAnimatedLengthList.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, SVGAnimatedLengthList val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "SVGAnimatedLengthList", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static SVGAnimatedLengthList _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "SVGAnimatedLengthList");
  return com.user00.domjnate.util.Js.construct(_win, constructor, SVGAnimatedLengthList.class);
}
}
