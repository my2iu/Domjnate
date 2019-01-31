package com.user00.domjnate.api.svg;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="SVGPathSegArcAbs")
public interface SVGPathSegArcAbs extends SVGPathSeg
{
@JsProperty(name="angle")
double getAngle();
@JsProperty(name="angle")
void setAngle(double val);
@JsProperty(name="largeArcFlag")
boolean getLargeArcFlag();
@JsProperty(name="largeArcFlag")
void setLargeArcFlag(boolean val);
@JsProperty(name="r1")
double getR1();
@JsProperty(name="r1")
void setR1(double val);
@JsProperty(name="r2")
double getR2();
@JsProperty(name="r2")
void setR2(double val);
@JsProperty(name="sweepFlag")
boolean getSweepFlag();
@JsProperty(name="sweepFlag")
void setSweepFlag(boolean val);
@JsProperty(name="x")
double getX();
@JsProperty(name="x")
void setX(double val);
@JsProperty(name="y")
double getY();
@JsProperty(name="y")
void setY(double val);
@JsOverlay
public static SVGPathSegArcAbs getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "SVGPathSegArcAbs", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", SVGPathSegArcAbs.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, SVGPathSegArcAbs val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "SVGPathSegArcAbs", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static SVGPathSegArcAbs _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "SVGPathSegArcAbs");
  return com.user00.domjnate.util.Js.construct(_win, constructor, SVGPathSegArcAbs.class);
}
}
