package com.user00.domjnate.api.svg;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="SVGGradientElement")
public interface SVGGradientElement extends SVGElement, SVGURIReference
{
@JsProperty(name="gradientTransform")
SVGAnimatedTransformList getGradientTransform();
@JsProperty(name="gradientUnits")
SVGAnimatedEnumeration getGradientUnits();
@JsProperty(name="spreadMethod")
SVGAnimatedEnumeration getSpreadMethod();
@JsProperty(name="SVG_SPREADMETHOD_PAD")
double SVG_SPREADMETHOD_PAD();
@JsProperty(name="SVG_SPREADMETHOD_REFLECT")
double SVG_SPREADMETHOD_REFLECT();
@JsProperty(name="SVG_SPREADMETHOD_REPEAT")
double SVG_SPREADMETHOD_REPEAT();
@JsProperty(name="SVG_SPREADMETHOD_UNKNOWN")
double SVG_SPREADMETHOD_UNKNOWN();
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
public static SVGGradientElement getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "SVGGradientElement", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", SVGGradientElement.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, SVGGradientElement val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "SVGGradientElement", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static double SVG_SPREADMETHOD_PAD(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "SVGGradientElement", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "SVG_SPREADMETHOD_PAD", double.class);
}
@JsOverlay
public static double SVG_SPREADMETHOD_REFLECT(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "SVGGradientElement", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "SVG_SPREADMETHOD_REFLECT", double.class);
}
@JsOverlay
public static double SVG_SPREADMETHOD_REPEAT(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "SVGGradientElement", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "SVG_SPREADMETHOD_REPEAT", double.class);
}
@JsOverlay
public static double SVG_SPREADMETHOD_UNKNOWN(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "SVGGradientElement", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "SVG_SPREADMETHOD_UNKNOWN", double.class);
}
@JsOverlay
public static SVGGradientElement _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "SVGGradientElement");
  return com.user00.domjnate.util.Js.construct(_win, constructor, SVGGradientElement.class);
}
}
