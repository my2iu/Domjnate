package com.user00.domjnate.api.svg;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="SVGPathElement")
public interface SVGPathElement extends SVGGraphicsElement
{
@JsProperty(name="pathSegList")
SVGPathSegList getPathSegList();
@JsMethod(name="createSVGPathSegArcAbs")
SVGPathSegArcAbs createSVGPathSegArcAbs(double x, double y, double r1, double r2, double angle, boolean largeArcFlag, boolean sweepFlag);
@JsMethod(name="createSVGPathSegArcRel")
SVGPathSegArcRel createSVGPathSegArcRel(double x, double y, double r1, double r2, double angle, boolean largeArcFlag, boolean sweepFlag);
@JsMethod(name="createSVGPathSegClosePath")
SVGPathSegClosePath createSVGPathSegClosePath();
@JsMethod(name="createSVGPathSegCurvetoCubicAbs")
SVGPathSegCurvetoCubicAbs createSVGPathSegCurvetoCubicAbs(double x, double y, double x1, double y1, double x2, double y2);
@JsMethod(name="createSVGPathSegCurvetoCubicRel")
SVGPathSegCurvetoCubicRel createSVGPathSegCurvetoCubicRel(double x, double y, double x1, double y1, double x2, double y2);
@JsMethod(name="createSVGPathSegCurvetoCubicSmoothAbs")
SVGPathSegCurvetoCubicSmoothAbs createSVGPathSegCurvetoCubicSmoothAbs(double x, double y, double x2, double y2);
@JsMethod(name="createSVGPathSegCurvetoCubicSmoothRel")
SVGPathSegCurvetoCubicSmoothRel createSVGPathSegCurvetoCubicSmoothRel(double x, double y, double x2, double y2);
@JsMethod(name="createSVGPathSegCurvetoQuadraticAbs")
SVGPathSegCurvetoQuadraticAbs createSVGPathSegCurvetoQuadraticAbs(double x, double y, double x1, double y1);
@JsMethod(name="createSVGPathSegCurvetoQuadraticRel")
SVGPathSegCurvetoQuadraticRel createSVGPathSegCurvetoQuadraticRel(double x, double y, double x1, double y1);
@JsMethod(name="createSVGPathSegCurvetoQuadraticSmoothAbs")
SVGPathSegCurvetoQuadraticSmoothAbs createSVGPathSegCurvetoQuadraticSmoothAbs(double x, double y);
@JsMethod(name="createSVGPathSegCurvetoQuadraticSmoothRel")
SVGPathSegCurvetoQuadraticSmoothRel createSVGPathSegCurvetoQuadraticSmoothRel(double x, double y);
@JsMethod(name="createSVGPathSegLinetoAbs")
SVGPathSegLinetoAbs createSVGPathSegLinetoAbs(double x, double y);
@JsMethod(name="createSVGPathSegLinetoHorizontalAbs")
SVGPathSegLinetoHorizontalAbs createSVGPathSegLinetoHorizontalAbs(double x);
@JsMethod(name="createSVGPathSegLinetoHorizontalRel")
SVGPathSegLinetoHorizontalRel createSVGPathSegLinetoHorizontalRel(double x);
@JsMethod(name="createSVGPathSegLinetoRel")
SVGPathSegLinetoRel createSVGPathSegLinetoRel(double x, double y);
@JsMethod(name="createSVGPathSegLinetoVerticalAbs")
SVGPathSegLinetoVerticalAbs createSVGPathSegLinetoVerticalAbs(double y);
@JsMethod(name="createSVGPathSegLinetoVerticalRel")
SVGPathSegLinetoVerticalRel createSVGPathSegLinetoVerticalRel(double y);
@JsMethod(name="createSVGPathSegMovetoAbs")
SVGPathSegMovetoAbs createSVGPathSegMovetoAbs(double x, double y);
@JsMethod(name="createSVGPathSegMovetoRel")
SVGPathSegMovetoRel createSVGPathSegMovetoRel(double x, double y);
@JsMethod(name="getPathSegAtLength")
double getPathSegAtLength(double distance);
@JsMethod(name="getPointAtLength")
com.user00.domjnate.api.DOMPoint getPointAtLength(double distance);
@JsMethod(name="getTotalLength")
double getTotalLength();
// TODO: Suppressing generic keyof type parameter for addEventListener
@JsMethod(name="addEventListener")
void addEventListener(String type, com.user00.domjnate.api.EventListener listener);
@JsMethod(name="addEventListener")
void addEventListener(String type, com.user00.domjnate.api.EventListener listener, com.user00.domjnate.api.AddEventListenerOptions options);
@JsMethod(name="addEventListener")
void addEventListener(String type, com.user00.domjnate.api.EventListener listener, boolean options);
// TODO: Suppressing generic keyof type parameter for removeEventListener
@JsMethod(name="removeEventListener")
void removeEventListener(String type, com.user00.domjnate.api.EventListener listener);
@JsMethod(name="removeEventListener")
void removeEventListener(String type, com.user00.domjnate.api.EventListener listener, com.user00.domjnate.api.EventListenerOptions options);
@JsMethod(name="removeEventListener")
void removeEventListener(String type, com.user00.domjnate.api.EventListener listener, boolean options);
@JsOverlay
public static SVGPathElement getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "SVGPathElement", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", SVGPathElement.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, SVGPathElement val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "SVGPathElement", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static SVGPathElement _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "SVGPathElement");
  return com.user00.domjnate.util.Js.construct(_win, constructor, SVGPathElement.class);
}
}
