package com.user00.domjnate.api.svg;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="SVGTransform")
public interface SVGTransform
{
@JsProperty(name="angle")
double getAngle();
@JsProperty(name="matrix")
com.user00.domjnate.api.DOMMatrix getMatrix();
@JsProperty(name="type")
double getType();
@JsProperty(name="SVG_TRANSFORM_MATRIX")
double SVG_TRANSFORM_MATRIX();
@JsProperty(name="SVG_TRANSFORM_ROTATE")
double SVG_TRANSFORM_ROTATE();
@JsProperty(name="SVG_TRANSFORM_SCALE")
double SVG_TRANSFORM_SCALE();
@JsProperty(name="SVG_TRANSFORM_SKEWX")
double SVG_TRANSFORM_SKEWX();
@JsProperty(name="SVG_TRANSFORM_SKEWY")
double SVG_TRANSFORM_SKEWY();
@JsProperty(name="SVG_TRANSFORM_TRANSLATE")
double SVG_TRANSFORM_TRANSLATE();
@JsProperty(name="SVG_TRANSFORM_UNKNOWN")
double SVG_TRANSFORM_UNKNOWN();
@JsMethod(name="setMatrix")
void setMatrix(com.user00.domjnate.api.DOMMatrix matrix);
@JsMethod(name="setRotate")
void setRotate(double angle, double cx, double cy);
@JsMethod(name="setScale")
void setScale(double sx, double sy);
@JsMethod(name="setSkewX")
void setSkewX(double angle);
@JsMethod(name="setSkewY")
void setSkewY(double angle);
@JsMethod(name="setTranslate")
void setTranslate(double tx, double ty);
@JsOverlay
public static SVGTransform getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "SVGTransform", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", SVGTransform.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, SVGTransform val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "SVGTransform", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static double SVG_TRANSFORM_MATRIX(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "SVGTransform", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "SVG_TRANSFORM_MATRIX", double.class);
}
@JsOverlay
public static double SVG_TRANSFORM_ROTATE(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "SVGTransform", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "SVG_TRANSFORM_ROTATE", double.class);
}
@JsOverlay
public static double SVG_TRANSFORM_SCALE(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "SVGTransform", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "SVG_TRANSFORM_SCALE", double.class);
}
@JsOverlay
public static double SVG_TRANSFORM_SKEWX(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "SVGTransform", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "SVG_TRANSFORM_SKEWX", double.class);
}
@JsOverlay
public static double SVG_TRANSFORM_SKEWY(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "SVGTransform", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "SVG_TRANSFORM_SKEWY", double.class);
}
@JsOverlay
public static double SVG_TRANSFORM_TRANSLATE(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "SVGTransform", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "SVG_TRANSFORM_TRANSLATE", double.class);
}
@JsOverlay
public static double SVG_TRANSFORM_UNKNOWN(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "SVGTransform", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "SVG_TRANSFORM_UNKNOWN", double.class);
}
@JsOverlay
public static SVGTransform _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "SVGTransform");
  return com.user00.domjnate.util.Js.construct(_win, constructor, SVGTransform.class);
}
}
