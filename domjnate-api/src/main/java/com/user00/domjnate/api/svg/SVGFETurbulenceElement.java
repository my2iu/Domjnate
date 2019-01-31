package com.user00.domjnate.api.svg;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="SVGFETurbulenceElement")
public interface SVGFETurbulenceElement extends SVGElement, SVGFilterPrimitiveStandardAttributes
{
@JsProperty(name="baseFrequencyX")
SVGAnimatedNumber getBaseFrequencyX();
@JsProperty(name="baseFrequencyY")
SVGAnimatedNumber getBaseFrequencyY();
@JsProperty(name="numOctaves")
SVGAnimatedInteger getNumOctaves();
@JsProperty(name="seed")
SVGAnimatedNumber getSeed();
@JsProperty(name="stitchTiles")
SVGAnimatedEnumeration getStitchTiles();
@JsProperty(name="type")
SVGAnimatedEnumeration getType();
@JsProperty(name="SVG_STITCHTYPE_NOSTITCH")
double SVG_STITCHTYPE_NOSTITCH();
@JsProperty(name="SVG_STITCHTYPE_STITCH")
double SVG_STITCHTYPE_STITCH();
@JsProperty(name="SVG_STITCHTYPE_UNKNOWN")
double SVG_STITCHTYPE_UNKNOWN();
@JsProperty(name="SVG_TURBULENCE_TYPE_FRACTALNOISE")
double SVG_TURBULENCE_TYPE_FRACTALNOISE();
@JsProperty(name="SVG_TURBULENCE_TYPE_TURBULENCE")
double SVG_TURBULENCE_TYPE_TURBULENCE();
@JsProperty(name="SVG_TURBULENCE_TYPE_UNKNOWN")
double SVG_TURBULENCE_TYPE_UNKNOWN();
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
public static SVGFETurbulenceElement getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "SVGFETurbulenceElement", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", SVGFETurbulenceElement.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, SVGFETurbulenceElement val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "SVGFETurbulenceElement", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static double SVG_STITCHTYPE_NOSTITCH(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "SVGFETurbulenceElement", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "SVG_STITCHTYPE_NOSTITCH", double.class);
}
@JsOverlay
public static double SVG_STITCHTYPE_STITCH(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "SVGFETurbulenceElement", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "SVG_STITCHTYPE_STITCH", double.class);
}
@JsOverlay
public static double SVG_STITCHTYPE_UNKNOWN(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "SVGFETurbulenceElement", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "SVG_STITCHTYPE_UNKNOWN", double.class);
}
@JsOverlay
public static double SVG_TURBULENCE_TYPE_FRACTALNOISE(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "SVGFETurbulenceElement", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "SVG_TURBULENCE_TYPE_FRACTALNOISE", double.class);
}
@JsOverlay
public static double SVG_TURBULENCE_TYPE_TURBULENCE(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "SVGFETurbulenceElement", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "SVG_TURBULENCE_TYPE_TURBULENCE", double.class);
}
@JsOverlay
public static double SVG_TURBULENCE_TYPE_UNKNOWN(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "SVGFETurbulenceElement", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "SVG_TURBULENCE_TYPE_UNKNOWN", double.class);
}
@JsOverlay
public static SVGFETurbulenceElement _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "SVGFETurbulenceElement");
  return com.user00.domjnate.util.Js.construct(_win, constructor, SVGFETurbulenceElement.class);
}
}
