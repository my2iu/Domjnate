package com.user00.domjnate.api.svg;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="SVGPathSegLinetoAbs")
public interface SVGPathSegLinetoAbs extends SVGPathSeg
{
@JsProperty(name="x")
double getX();
@JsProperty(name="x")
void setX(double val);
@JsProperty(name="y")
double getY();
@JsProperty(name="y")
void setY(double val);
@JsOverlay
public static SVGPathSegLinetoAbs getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "SVGPathSegLinetoAbs", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", SVGPathSegLinetoAbs.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, SVGPathSegLinetoAbs val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "SVGPathSegLinetoAbs", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static SVGPathSegLinetoAbs _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "SVGPathSegLinetoAbs");
  return com.user00.domjnate.util.Js.construct(_win, constructor, SVGPathSegLinetoAbs.class);
}
}
