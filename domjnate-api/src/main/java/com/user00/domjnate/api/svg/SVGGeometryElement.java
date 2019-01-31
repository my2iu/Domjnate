package com.user00.domjnate.api.svg;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="SVGGeometryElement")
public interface SVGGeometryElement extends SVGGraphicsElement
{
@JsProperty(name="pathLength")
SVGAnimatedNumber getPathLength();
@JsMethod(name="getPointAtLength")
com.user00.domjnate.api.DOMPoint getPointAtLength(double distance);
@JsMethod(name="getTotalLength")
double getTotalLength();
@JsMethod(name="isPointInFill")
boolean isPointInFill();
@JsMethod(name="isPointInFill")
boolean isPointInFill(com.user00.domjnate.api.DOMPointInit point);
@JsMethod(name="isPointInStroke")
boolean isPointInStroke();
@JsMethod(name="isPointInStroke")
boolean isPointInStroke(com.user00.domjnate.api.DOMPointInit point);
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
public static SVGGeometryElement getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "SVGGeometryElement", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", SVGGeometryElement.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, SVGGeometryElement val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "SVGGeometryElement", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static SVGGeometryElement _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "SVGGeometryElement");
  return com.user00.domjnate.util.Js.construct(_win, constructor, SVGGeometryElement.class);
}
}
