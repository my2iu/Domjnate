package com.user00.domjnate.api.svg;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="SVGFEBlendElement")
public interface SVGFEBlendElement extends SVGElement, SVGFilterPrimitiveStandardAttributes
{
@JsProperty(name="in1")
SVGAnimatedString getIn1();
@JsProperty(name="in2")
SVGAnimatedString getIn2();
@JsProperty(name="mode")
SVGAnimatedEnumeration getMode();
@JsProperty(name="SVG_FEBLEND_MODE_COLOR")
double SVG_FEBLEND_MODE_COLOR();
@JsProperty(name="SVG_FEBLEND_MODE_COLOR_BURN")
double SVG_FEBLEND_MODE_COLOR_BURN();
@JsProperty(name="SVG_FEBLEND_MODE_COLOR_DODGE")
double SVG_FEBLEND_MODE_COLOR_DODGE();
@JsProperty(name="SVG_FEBLEND_MODE_DARKEN")
double SVG_FEBLEND_MODE_DARKEN();
@JsProperty(name="SVG_FEBLEND_MODE_DIFFERENCE")
double SVG_FEBLEND_MODE_DIFFERENCE();
@JsProperty(name="SVG_FEBLEND_MODE_EXCLUSION")
double SVG_FEBLEND_MODE_EXCLUSION();
@JsProperty(name="SVG_FEBLEND_MODE_HARD_LIGHT")
double SVG_FEBLEND_MODE_HARD_LIGHT();
@JsProperty(name="SVG_FEBLEND_MODE_HUE")
double SVG_FEBLEND_MODE_HUE();
@JsProperty(name="SVG_FEBLEND_MODE_LIGHTEN")
double SVG_FEBLEND_MODE_LIGHTEN();
@JsProperty(name="SVG_FEBLEND_MODE_LUMINOSITY")
double SVG_FEBLEND_MODE_LUMINOSITY();
@JsProperty(name="SVG_FEBLEND_MODE_MULTIPLY")
double SVG_FEBLEND_MODE_MULTIPLY();
@JsProperty(name="SVG_FEBLEND_MODE_NORMAL")
double SVG_FEBLEND_MODE_NORMAL();
@JsProperty(name="SVG_FEBLEND_MODE_OVERLAY")
double SVG_FEBLEND_MODE_OVERLAY();
@JsProperty(name="SVG_FEBLEND_MODE_SATURATION")
double SVG_FEBLEND_MODE_SATURATION();
@JsProperty(name="SVG_FEBLEND_MODE_SCREEN")
double SVG_FEBLEND_MODE_SCREEN();
@JsProperty(name="SVG_FEBLEND_MODE_SOFT_LIGHT")
double SVG_FEBLEND_MODE_SOFT_LIGHT();
@JsProperty(name="SVG_FEBLEND_MODE_UNKNOWN")
double SVG_FEBLEND_MODE_UNKNOWN();
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
public static SVGFEBlendElement getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "SVGFEBlendElement", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", SVGFEBlendElement.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, SVGFEBlendElement val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "SVGFEBlendElement", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static double SVG_FEBLEND_MODE_COLOR(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "SVGFEBlendElement", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "SVG_FEBLEND_MODE_COLOR", double.class);
}
@JsOverlay
public static double SVG_FEBLEND_MODE_COLOR_BURN(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "SVGFEBlendElement", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "SVG_FEBLEND_MODE_COLOR_BURN", double.class);
}
@JsOverlay
public static double SVG_FEBLEND_MODE_COLOR_DODGE(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "SVGFEBlendElement", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "SVG_FEBLEND_MODE_COLOR_DODGE", double.class);
}
@JsOverlay
public static double SVG_FEBLEND_MODE_DARKEN(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "SVGFEBlendElement", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "SVG_FEBLEND_MODE_DARKEN", double.class);
}
@JsOverlay
public static double SVG_FEBLEND_MODE_DIFFERENCE(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "SVGFEBlendElement", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "SVG_FEBLEND_MODE_DIFFERENCE", double.class);
}
@JsOverlay
public static double SVG_FEBLEND_MODE_EXCLUSION(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "SVGFEBlendElement", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "SVG_FEBLEND_MODE_EXCLUSION", double.class);
}
@JsOverlay
public static double SVG_FEBLEND_MODE_HARD_LIGHT(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "SVGFEBlendElement", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "SVG_FEBLEND_MODE_HARD_LIGHT", double.class);
}
@JsOverlay
public static double SVG_FEBLEND_MODE_HUE(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "SVGFEBlendElement", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "SVG_FEBLEND_MODE_HUE", double.class);
}
@JsOverlay
public static double SVG_FEBLEND_MODE_LIGHTEN(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "SVGFEBlendElement", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "SVG_FEBLEND_MODE_LIGHTEN", double.class);
}
@JsOverlay
public static double SVG_FEBLEND_MODE_LUMINOSITY(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "SVGFEBlendElement", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "SVG_FEBLEND_MODE_LUMINOSITY", double.class);
}
@JsOverlay
public static double SVG_FEBLEND_MODE_MULTIPLY(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "SVGFEBlendElement", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "SVG_FEBLEND_MODE_MULTIPLY", double.class);
}
@JsOverlay
public static double SVG_FEBLEND_MODE_NORMAL(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "SVGFEBlendElement", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "SVG_FEBLEND_MODE_NORMAL", double.class);
}
@JsOverlay
public static double SVG_FEBLEND_MODE_OVERLAY(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "SVGFEBlendElement", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "SVG_FEBLEND_MODE_OVERLAY", double.class);
}
@JsOverlay
public static double SVG_FEBLEND_MODE_SATURATION(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "SVGFEBlendElement", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "SVG_FEBLEND_MODE_SATURATION", double.class);
}
@JsOverlay
public static double SVG_FEBLEND_MODE_SCREEN(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "SVGFEBlendElement", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "SVG_FEBLEND_MODE_SCREEN", double.class);
}
@JsOverlay
public static double SVG_FEBLEND_MODE_SOFT_LIGHT(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "SVGFEBlendElement", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "SVG_FEBLEND_MODE_SOFT_LIGHT", double.class);
}
@JsOverlay
public static double SVG_FEBLEND_MODE_UNKNOWN(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "SVGFEBlendElement", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "SVG_FEBLEND_MODE_UNKNOWN", double.class);
}
@JsOverlay
public static SVGFEBlendElement _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "SVGFEBlendElement");
  return com.user00.domjnate.util.Js.construct(_win, constructor, SVGFEBlendElement.class);
}
}
