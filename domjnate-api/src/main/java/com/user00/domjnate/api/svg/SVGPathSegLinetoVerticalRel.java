package com.user00.domjnate.api.svg;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="SVGPathSegLinetoVerticalRel")
public interface SVGPathSegLinetoVerticalRel extends SVGPathSeg
{
@JsProperty(name="y")
double getY();
@JsProperty(name="y")
void setY(double val);
@JsOverlay
public static SVGPathSegLinetoVerticalRel getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "SVGPathSegLinetoVerticalRel", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", SVGPathSegLinetoVerticalRel.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, SVGPathSegLinetoVerticalRel val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "SVGPathSegLinetoVerticalRel", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static SVGPathSegLinetoVerticalRel _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "SVGPathSegLinetoVerticalRel");
  return com.user00.domjnate.util.Js.construct(_win, constructor, SVGPathSegLinetoVerticalRel.class);
}
}
