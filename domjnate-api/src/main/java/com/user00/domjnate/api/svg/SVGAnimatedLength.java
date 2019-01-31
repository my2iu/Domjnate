package com.user00.domjnate.api.svg;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="SVGAnimatedLength")
public interface SVGAnimatedLength
{
@JsProperty(name="animVal")
SVGLength getAnimVal();
@JsProperty(name="baseVal")
SVGLength getBaseVal();
@JsOverlay
public static SVGAnimatedLength getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "SVGAnimatedLength", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", SVGAnimatedLength.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, SVGAnimatedLength val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "SVGAnimatedLength", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static SVGAnimatedLength _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "SVGAnimatedLength");
  return com.user00.domjnate.util.Js.construct(_win, constructor, SVGAnimatedLength.class);
}
}
