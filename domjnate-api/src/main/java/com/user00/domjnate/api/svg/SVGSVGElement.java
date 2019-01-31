package com.user00.domjnate.api.svg;

import jsinterop.annotations.JsFunction;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="SVGSVGElement")
public interface SVGSVGElement extends SVGGraphicsElement, com.user00.domjnate.api.DocumentEvent, SVGFitToViewBox, SVGZoomAndPan
{
@JsProperty(name="contentScriptType")
String getContentScriptType();
@JsProperty(name="contentScriptType")
void setContentScriptType(String val);
@JsProperty(name="contentStyleType")
String getContentStyleType();
@JsProperty(name="contentStyleType")
void setContentStyleType(String val);
@JsProperty(name="currentScale")
double getCurrentScale();
@JsProperty(name="currentScale")
void setCurrentScale(double val);
@JsProperty(name="currentTranslate")
com.user00.domjnate.api.DOMPoint getCurrentTranslate();
@JsProperty(name="height")
SVGAnimatedLength getHeight();
@JsProperty(name="onunload")
OnunloadCallback getOnunload();
@JsProperty(name="onunload")
void setOnunload(OnunloadCallback val);
@JsProperty(name="onzoom")
OnzoomCallback getOnzoom();
@JsProperty(name="onzoom")
void setOnzoom(OnzoomCallback val);
@JsProperty(name="pixelUnitToMillimeterX")
double getPixelUnitToMillimeterX();
@JsProperty(name="pixelUnitToMillimeterY")
double getPixelUnitToMillimeterY();
@JsProperty(name="screenPixelToMillimeterX")
double getScreenPixelToMillimeterX();
@JsProperty(name="screenPixelToMillimeterY")
double getScreenPixelToMillimeterY();
@JsProperty(name="viewport")
com.user00.domjnate.api.DOMRect getViewport();
@JsProperty(name="width")
SVGAnimatedLength getWidth();
@JsProperty(name="x")
SVGAnimatedLength getX();
@JsProperty(name="y")
SVGAnimatedLength getY();
@JsMethod(name="checkEnclosure")
boolean checkEnclosure(SVGElement element, com.user00.domjnate.api.DOMRect rect);
@JsMethod(name="checkIntersection")
boolean checkIntersection(SVGElement element, com.user00.domjnate.api.DOMRect rect);
@JsMethod(name="createSVGAngle")
SVGAngle createSVGAngle();
@JsMethod(name="createSVGLength")
SVGLength createSVGLength();
@JsMethod(name="createSVGMatrix")
com.user00.domjnate.api.DOMMatrix createSVGMatrix();
@JsMethod(name="createSVGNumber")
SVGNumber createSVGNumber();
@JsMethod(name="createSVGPoint")
com.user00.domjnate.api.DOMPoint createSVGPoint();
@JsMethod(name="createSVGRect")
com.user00.domjnate.api.DOMRect createSVGRect();
@JsMethod(name="createSVGTransform")
SVGTransform createSVGTransform();
@JsMethod(name="createSVGTransformFromMatrix")
SVGTransform createSVGTransformFromMatrix(com.user00.domjnate.api.DOMMatrix matrix);
@JsMethod(name="deselectAll")
void deselectAll();
@JsMethod(name="forceRedraw")
void forceRedraw();
@JsMethod(name="getComputedStyle")
com.user00.domjnate.api.CSSStyleDeclaration getComputedStyle(com.user00.domjnate.api.dom.Element elt);
@JsMethod(name="getComputedStyle")
com.user00.domjnate.api.CSSStyleDeclaration getComputedStyle(com.user00.domjnate.api.dom.Element elt, String pseudoElt);
@JsMethod(name="getCurrentTime")
double getCurrentTime();
@JsMethod(name="getElementById")
com.user00.domjnate.api.dom.Element getElementById(String elementId);
@JsMethod(name="getEnclosureList")
com.user00.domjnate.api.dom.NodeListOf<SVGGraphicsElement> getEnclosureList(com.user00.domjnate.api.DOMRect rect, SVGElement referenceElement);
@JsMethod(name="getIntersectionList")
com.user00.domjnate.api.dom.NodeListOf<SVGGraphicsElement> getIntersectionList(com.user00.domjnate.api.DOMRect rect, SVGElement referenceElement);
@JsMethod(name="pauseAnimations")
void pauseAnimations();
@JsMethod(name="setCurrentTime")
void setCurrentTime(double seconds);
@JsMethod(name="suspendRedraw")
double suspendRedraw(double maxWaitMilliseconds);
@JsMethod(name="unpauseAnimations")
void unpauseAnimations();
@JsMethod(name="unsuspendRedraw")
void unsuspendRedraw(double suspendHandleID);
@JsMethod(name="unsuspendRedrawAll")
void unsuspendRedrawAll();
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
@JsFunction public static interface OnunloadCallback
{
java.lang.Object apply(com.user00.domjnate.api.dom.Event ev);
}
@JsFunction public static interface OnzoomCallback
{
java.lang.Object apply(SVGZoomEvent ev);
}
@JsOverlay
public static SVGSVGElement getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "SVGSVGElement", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", SVGSVGElement.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, SVGSVGElement val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "SVGSVGElement", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static double SVG_ZOOMANDPAN_DISABLE(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "SVGSVGElement", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "SVG_ZOOMANDPAN_DISABLE", double.class);
}
@JsOverlay
public static double SVG_ZOOMANDPAN_MAGNIFY(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "SVGSVGElement", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "SVG_ZOOMANDPAN_MAGNIFY", double.class);
}
@JsOverlay
public static double SVG_ZOOMANDPAN_UNKNOWN(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "SVGSVGElement", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "SVG_ZOOMANDPAN_UNKNOWN", double.class);
}
@JsOverlay
public static SVGSVGElement _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "SVGSVGElement");
  return com.user00.domjnate.util.Js.construct(_win, constructor, SVGSVGElement.class);
}
}
