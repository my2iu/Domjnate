package com.user00.domjnate.api.svg;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="SVGAnimatedPreserveAspectRatio")
public interface SVGAnimatedPreserveAspectRatio
{
@JsProperty(name="animVal")
SVGPreserveAspectRatio getAnimVal();
@JsProperty(name="baseVal")
SVGPreserveAspectRatio getBaseVal();
@JsOverlay
public static SVGAnimatedPreserveAspectRatio getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "SVGAnimatedPreserveAspectRatio", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", SVGAnimatedPreserveAspectRatio.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, SVGAnimatedPreserveAspectRatio val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "SVGAnimatedPreserveAspectRatio", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static SVGAnimatedPreserveAspectRatio _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "SVGAnimatedPreserveAspectRatio");
  return com.user00.domjnate.util.Js.construct(_win, constructor, SVGAnimatedPreserveAspectRatio.class);
}
}
