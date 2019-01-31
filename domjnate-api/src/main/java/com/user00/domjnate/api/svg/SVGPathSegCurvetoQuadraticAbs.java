package com.user00.domjnate.api.svg;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="SVGPathSegCurvetoQuadraticAbs")
public interface SVGPathSegCurvetoQuadraticAbs extends SVGPathSeg
{
@JsProperty(name="x")
double getX();
@JsProperty(name="x")
void setX(double val);
@JsProperty(name="x1")
double getX1();
@JsProperty(name="x1")
void setX1(double val);
@JsProperty(name="y")
double getY();
@JsProperty(name="y")
void setY(double val);
@JsProperty(name="y1")
double getY1();
@JsProperty(name="y1")
void setY1(double val);
@JsOverlay
public static SVGPathSegCurvetoQuadraticAbs getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "SVGPathSegCurvetoQuadraticAbs", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", SVGPathSegCurvetoQuadraticAbs.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, SVGPathSegCurvetoQuadraticAbs val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "SVGPathSegCurvetoQuadraticAbs", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static SVGPathSegCurvetoQuadraticAbs _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "SVGPathSegCurvetoQuadraticAbs");
  return com.user00.domjnate.util.Js.construct(_win, constructor, SVGPathSegCurvetoQuadraticAbs.class);
}
}
