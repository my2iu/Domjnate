package com.user00.domjnate.api.svg;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="SVGPathSegLinetoHorizontalAbs")
public interface SVGPathSegLinetoHorizontalAbs extends SVGPathSeg
{
@JsProperty(name="x")
double getX();
@JsProperty(name="x")
void setX(double val);
@JsOverlay
public static SVGPathSegLinetoHorizontalAbs getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "SVGPathSegLinetoHorizontalAbs", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", SVGPathSegLinetoHorizontalAbs.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, SVGPathSegLinetoHorizontalAbs val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "SVGPathSegLinetoHorizontalAbs", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static SVGPathSegLinetoHorizontalAbs _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "SVGPathSegLinetoHorizontalAbs");
  return com.user00.domjnate.util.Js.construct(_win, constructor, SVGPathSegLinetoHorizontalAbs.class);
}
}
