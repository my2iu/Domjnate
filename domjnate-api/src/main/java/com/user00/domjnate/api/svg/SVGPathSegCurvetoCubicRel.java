package com.user00.domjnate.api.svg;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="SVGPathSegCurvetoCubicRel")
public interface SVGPathSegCurvetoCubicRel extends SVGPathSeg
{
@JsProperty(name="x")
double getX();
@JsProperty(name="x")
void setX(double val);
@JsProperty(name="x1")
double getX1();
@JsProperty(name="x1")
void setX1(double val);
@JsProperty(name="x2")
double getX2();
@JsProperty(name="x2")
void setX2(double val);
@JsProperty(name="y")
double getY();
@JsProperty(name="y")
void setY(double val);
@JsProperty(name="y1")
double getY1();
@JsProperty(name="y1")
void setY1(double val);
@JsProperty(name="y2")
double getY2();
@JsProperty(name="y2")
void setY2(double val);
@JsOverlay
public static SVGPathSegCurvetoCubicRel getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "SVGPathSegCurvetoCubicRel", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", SVGPathSegCurvetoCubicRel.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, SVGPathSegCurvetoCubicRel val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "SVGPathSegCurvetoCubicRel", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static SVGPathSegCurvetoCubicRel _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "SVGPathSegCurvetoCubicRel");
  return com.user00.domjnate.util.Js.construct(_win, constructor, SVGPathSegCurvetoCubicRel.class);
}
}
