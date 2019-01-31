package com.user00.domjnate.api.svg;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="SVGAnimatedEnumeration")
public interface SVGAnimatedEnumeration
{
@JsProperty(name="animVal")
double getAnimVal();
@JsProperty(name="baseVal")
double getBaseVal();
@JsProperty(name="baseVal")
void setBaseVal(double val);
@JsOverlay
public static SVGAnimatedEnumeration getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "SVGAnimatedEnumeration", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", SVGAnimatedEnumeration.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, SVGAnimatedEnumeration val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "SVGAnimatedEnumeration", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static SVGAnimatedEnumeration _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "SVGAnimatedEnumeration");
  return com.user00.domjnate.util.Js.construct(_win, constructor, SVGAnimatedEnumeration.class);
}
}
