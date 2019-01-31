package com.user00.domjnate.api.svg;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="SVGPathSeg")
public interface SVGPathSeg
{
@JsProperty(name="pathSegType")
double getPathSegType();
@JsProperty(name="pathSegTypeAsLetter")
String getPathSegTypeAsLetter();
@JsProperty(name="PATHSEG_ARC_ABS")
double PATHSEG_ARC_ABS();
@JsProperty(name="PATHSEG_ARC_REL")
double PATHSEG_ARC_REL();
@JsProperty(name="PATHSEG_CLOSEPATH")
double PATHSEG_CLOSEPATH();
@JsProperty(name="PATHSEG_CURVETO_CUBIC_ABS")
double PATHSEG_CURVETO_CUBIC_ABS();
@JsProperty(name="PATHSEG_CURVETO_CUBIC_REL")
double PATHSEG_CURVETO_CUBIC_REL();
@JsProperty(name="PATHSEG_CURVETO_CUBIC_SMOOTH_ABS")
double PATHSEG_CURVETO_CUBIC_SMOOTH_ABS();
@JsProperty(name="PATHSEG_CURVETO_CUBIC_SMOOTH_REL")
double PATHSEG_CURVETO_CUBIC_SMOOTH_REL();
@JsProperty(name="PATHSEG_CURVETO_QUADRATIC_ABS")
double PATHSEG_CURVETO_QUADRATIC_ABS();
@JsProperty(name="PATHSEG_CURVETO_QUADRATIC_REL")
double PATHSEG_CURVETO_QUADRATIC_REL();
@JsProperty(name="PATHSEG_CURVETO_QUADRATIC_SMOOTH_ABS")
double PATHSEG_CURVETO_QUADRATIC_SMOOTH_ABS();
@JsProperty(name="PATHSEG_CURVETO_QUADRATIC_SMOOTH_REL")
double PATHSEG_CURVETO_QUADRATIC_SMOOTH_REL();
@JsProperty(name="PATHSEG_LINETO_ABS")
double PATHSEG_LINETO_ABS();
@JsProperty(name="PATHSEG_LINETO_HORIZONTAL_ABS")
double PATHSEG_LINETO_HORIZONTAL_ABS();
@JsProperty(name="PATHSEG_LINETO_HORIZONTAL_REL")
double PATHSEG_LINETO_HORIZONTAL_REL();
@JsProperty(name="PATHSEG_LINETO_REL")
double PATHSEG_LINETO_REL();
@JsProperty(name="PATHSEG_LINETO_VERTICAL_ABS")
double PATHSEG_LINETO_VERTICAL_ABS();
@JsProperty(name="PATHSEG_LINETO_VERTICAL_REL")
double PATHSEG_LINETO_VERTICAL_REL();
@JsProperty(name="PATHSEG_MOVETO_ABS")
double PATHSEG_MOVETO_ABS();
@JsProperty(name="PATHSEG_MOVETO_REL")
double PATHSEG_MOVETO_REL();
@JsProperty(name="PATHSEG_UNKNOWN")
double PATHSEG_UNKNOWN();
@JsOverlay
public static SVGPathSeg getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "SVGPathSeg", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", SVGPathSeg.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, SVGPathSeg val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "SVGPathSeg", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static double PATHSEG_ARC_ABS(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "SVGPathSeg", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "PATHSEG_ARC_ABS", double.class);
}
@JsOverlay
public static double PATHSEG_ARC_REL(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "SVGPathSeg", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "PATHSEG_ARC_REL", double.class);
}
@JsOverlay
public static double PATHSEG_CLOSEPATH(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "SVGPathSeg", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "PATHSEG_CLOSEPATH", double.class);
}
@JsOverlay
public static double PATHSEG_CURVETO_CUBIC_ABS(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "SVGPathSeg", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "PATHSEG_CURVETO_CUBIC_ABS", double.class);
}
@JsOverlay
public static double PATHSEG_CURVETO_CUBIC_REL(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "SVGPathSeg", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "PATHSEG_CURVETO_CUBIC_REL", double.class);
}
@JsOverlay
public static double PATHSEG_CURVETO_CUBIC_SMOOTH_ABS(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "SVGPathSeg", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "PATHSEG_CURVETO_CUBIC_SMOOTH_ABS", double.class);
}
@JsOverlay
public static double PATHSEG_CURVETO_CUBIC_SMOOTH_REL(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "SVGPathSeg", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "PATHSEG_CURVETO_CUBIC_SMOOTH_REL", double.class);
}
@JsOverlay
public static double PATHSEG_CURVETO_QUADRATIC_ABS(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "SVGPathSeg", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "PATHSEG_CURVETO_QUADRATIC_ABS", double.class);
}
@JsOverlay
public static double PATHSEG_CURVETO_QUADRATIC_REL(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "SVGPathSeg", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "PATHSEG_CURVETO_QUADRATIC_REL", double.class);
}
@JsOverlay
public static double PATHSEG_CURVETO_QUADRATIC_SMOOTH_ABS(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "SVGPathSeg", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "PATHSEG_CURVETO_QUADRATIC_SMOOTH_ABS", double.class);
}
@JsOverlay
public static double PATHSEG_CURVETO_QUADRATIC_SMOOTH_REL(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "SVGPathSeg", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "PATHSEG_CURVETO_QUADRATIC_SMOOTH_REL", double.class);
}
@JsOverlay
public static double PATHSEG_LINETO_ABS(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "SVGPathSeg", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "PATHSEG_LINETO_ABS", double.class);
}
@JsOverlay
public static double PATHSEG_LINETO_HORIZONTAL_ABS(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "SVGPathSeg", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "PATHSEG_LINETO_HORIZONTAL_ABS", double.class);
}
@JsOverlay
public static double PATHSEG_LINETO_HORIZONTAL_REL(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "SVGPathSeg", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "PATHSEG_LINETO_HORIZONTAL_REL", double.class);
}
@JsOverlay
public static double PATHSEG_LINETO_REL(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "SVGPathSeg", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "PATHSEG_LINETO_REL", double.class);
}
@JsOverlay
public static double PATHSEG_LINETO_VERTICAL_ABS(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "SVGPathSeg", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "PATHSEG_LINETO_VERTICAL_ABS", double.class);
}
@JsOverlay
public static double PATHSEG_LINETO_VERTICAL_REL(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "SVGPathSeg", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "PATHSEG_LINETO_VERTICAL_REL", double.class);
}
@JsOverlay
public static double PATHSEG_MOVETO_ABS(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "SVGPathSeg", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "PATHSEG_MOVETO_ABS", double.class);
}
@JsOverlay
public static double PATHSEG_MOVETO_REL(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "SVGPathSeg", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "PATHSEG_MOVETO_REL", double.class);
}
@JsOverlay
public static double PATHSEG_UNKNOWN(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "SVGPathSeg", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "PATHSEG_UNKNOWN", double.class);
}
@JsOverlay
public static SVGPathSeg _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "SVGPathSeg");
  return com.user00.domjnate.util.Js.construct(_win, constructor, SVGPathSeg.class);
}
}
