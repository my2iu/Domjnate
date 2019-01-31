package com.user00.domjnate.api.svg;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="SVGFEColorMatrixElement")
public interface SVGFEColorMatrixElement extends SVGElement, SVGFilterPrimitiveStandardAttributes
{
@JsProperty(name="in1")
SVGAnimatedString getIn1();
@JsProperty(name="type")
SVGAnimatedEnumeration getType();
@JsProperty(name="values")
SVGAnimatedNumberList getValues();
@JsProperty(name="SVG_FECOLORMATRIX_TYPE_HUEROTATE")
double SVG_FECOLORMATRIX_TYPE_HUEROTATE();
@JsProperty(name="SVG_FECOLORMATRIX_TYPE_LUMINANCETOALPHA")
double SVG_FECOLORMATRIX_TYPE_LUMINANCETOALPHA();
@JsProperty(name="SVG_FECOLORMATRIX_TYPE_MATRIX")
double SVG_FECOLORMATRIX_TYPE_MATRIX();
@JsProperty(name="SVG_FECOLORMATRIX_TYPE_SATURATE")
double SVG_FECOLORMATRIX_TYPE_SATURATE();
@JsProperty(name="SVG_FECOLORMATRIX_TYPE_UNKNOWN")
double SVG_FECOLORMATRIX_TYPE_UNKNOWN();
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
public static SVGFEColorMatrixElement getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "SVGFEColorMatrixElement", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", SVGFEColorMatrixElement.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, SVGFEColorMatrixElement val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "SVGFEColorMatrixElement", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static double SVG_FECOLORMATRIX_TYPE_HUEROTATE(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "SVGFEColorMatrixElement", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "SVG_FECOLORMATRIX_TYPE_HUEROTATE", double.class);
}
@JsOverlay
public static double SVG_FECOLORMATRIX_TYPE_LUMINANCETOALPHA(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "SVGFEColorMatrixElement", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "SVG_FECOLORMATRIX_TYPE_LUMINANCETOALPHA", double.class);
}
@JsOverlay
public static double SVG_FECOLORMATRIX_TYPE_MATRIX(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "SVGFEColorMatrixElement", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "SVG_FECOLORMATRIX_TYPE_MATRIX", double.class);
}
@JsOverlay
public static double SVG_FECOLORMATRIX_TYPE_SATURATE(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "SVGFEColorMatrixElement", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "SVG_FECOLORMATRIX_TYPE_SATURATE", double.class);
}
@JsOverlay
public static double SVG_FECOLORMATRIX_TYPE_UNKNOWN(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "SVGFEColorMatrixElement", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "SVG_FECOLORMATRIX_TYPE_UNKNOWN", double.class);
}
@JsOverlay
public static SVGFEColorMatrixElement _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "SVGFEColorMatrixElement");
  return com.user00.domjnate.util.Js.construct(_win, constructor, SVGFEColorMatrixElement.class);
}
}
