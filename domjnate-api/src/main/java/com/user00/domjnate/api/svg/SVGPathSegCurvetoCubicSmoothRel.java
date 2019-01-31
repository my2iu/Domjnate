package com.user00.domjnate.api.svg;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="SVGPathSegCurvetoCubicSmoothRel")
public interface SVGPathSegCurvetoCubicSmoothRel extends SVGPathSeg
{
@JsProperty(name="x")
double getX();
@JsProperty(name="x")
void setX(double val);
@JsProperty(name="x2")
double getX2();
@JsProperty(name="x2")
void setX2(double val);
@JsProperty(name="y")
double getY();
@JsProperty(name="y")
void setY(double val);
@JsProperty(name="y2")
double getY2();
@JsProperty(name="y2")
void setY2(double val);
@JsOverlay
public static SVGPathSegCurvetoCubicSmoothRel getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "SVGPathSegCurvetoCubicSmoothRel", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", SVGPathSegCurvetoCubicSmoothRel.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, SVGPathSegCurvetoCubicSmoothRel val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "SVGPathSegCurvetoCubicSmoothRel", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static SVGPathSegCurvetoCubicSmoothRel _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "SVGPathSegCurvetoCubicSmoothRel");
  return com.user00.domjnate.util.Js.construct(_win, constructor, SVGPathSegCurvetoCubicSmoothRel.class);
}
}
