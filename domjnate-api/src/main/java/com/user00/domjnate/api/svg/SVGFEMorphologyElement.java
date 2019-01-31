package com.user00.domjnate.api.svg;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="SVGFEMorphologyElement")
public interface SVGFEMorphologyElement extends SVGElement, SVGFilterPrimitiveStandardAttributes
{
@JsProperty(name="in1")
SVGAnimatedString getIn1();
@JsProperty(name="operator")
SVGAnimatedEnumeration getOperator();
@JsProperty(name="radiusX")
SVGAnimatedNumber getRadiusX();
@JsProperty(name="radiusY")
SVGAnimatedNumber getRadiusY();
@JsProperty(name="SVG_MORPHOLOGY_OPERATOR_DILATE")
double SVG_MORPHOLOGY_OPERATOR_DILATE();
@JsProperty(name="SVG_MORPHOLOGY_OPERATOR_ERODE")
double SVG_MORPHOLOGY_OPERATOR_ERODE();
@JsProperty(name="SVG_MORPHOLOGY_OPERATOR_UNKNOWN")
double SVG_MORPHOLOGY_OPERATOR_UNKNOWN();
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
public static SVGFEMorphologyElement getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "SVGFEMorphologyElement", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", SVGFEMorphologyElement.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, SVGFEMorphologyElement val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "SVGFEMorphologyElement", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static double SVG_MORPHOLOGY_OPERATOR_DILATE(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "SVGFEMorphologyElement", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "SVG_MORPHOLOGY_OPERATOR_DILATE", double.class);
}
@JsOverlay
public static double SVG_MORPHOLOGY_OPERATOR_ERODE(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "SVGFEMorphologyElement", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "SVG_MORPHOLOGY_OPERATOR_ERODE", double.class);
}
@JsOverlay
public static double SVG_MORPHOLOGY_OPERATOR_UNKNOWN(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "SVGFEMorphologyElement", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "SVG_MORPHOLOGY_OPERATOR_UNKNOWN", double.class);
}
@JsOverlay
public static SVGFEMorphologyElement _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "SVGFEMorphologyElement");
  return com.user00.domjnate.util.Js.construct(_win, constructor, SVGFEMorphologyElement.class);
}
}
