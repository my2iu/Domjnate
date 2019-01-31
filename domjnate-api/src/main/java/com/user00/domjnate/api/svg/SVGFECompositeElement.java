package com.user00.domjnate.api.svg;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="SVGFECompositeElement")
public interface SVGFECompositeElement extends SVGElement, SVGFilterPrimitiveStandardAttributes
{
@JsProperty(name="in1")
SVGAnimatedString getIn1();
@JsProperty(name="in2")
SVGAnimatedString getIn2();
@JsProperty(name="k1")
SVGAnimatedNumber getK1();
@JsProperty(name="k2")
SVGAnimatedNumber getK2();
@JsProperty(name="k3")
SVGAnimatedNumber getK3();
@JsProperty(name="k4")
SVGAnimatedNumber getK4();
@JsProperty(name="operator")
SVGAnimatedEnumeration getOperator();
@JsProperty(name="SVG_FECOMPOSITE_OPERATOR_ARITHMETIC")
double SVG_FECOMPOSITE_OPERATOR_ARITHMETIC();
@JsProperty(name="SVG_FECOMPOSITE_OPERATOR_ATOP")
double SVG_FECOMPOSITE_OPERATOR_ATOP();
@JsProperty(name="SVG_FECOMPOSITE_OPERATOR_IN")
double SVG_FECOMPOSITE_OPERATOR_IN();
@JsProperty(name="SVG_FECOMPOSITE_OPERATOR_OUT")
double SVG_FECOMPOSITE_OPERATOR_OUT();
@JsProperty(name="SVG_FECOMPOSITE_OPERATOR_OVER")
double SVG_FECOMPOSITE_OPERATOR_OVER();
@JsProperty(name="SVG_FECOMPOSITE_OPERATOR_UNKNOWN")
double SVG_FECOMPOSITE_OPERATOR_UNKNOWN();
@JsProperty(name="SVG_FECOMPOSITE_OPERATOR_XOR")
double SVG_FECOMPOSITE_OPERATOR_XOR();
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
public static SVGFECompositeElement getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "SVGFECompositeElement", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", SVGFECompositeElement.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, SVGFECompositeElement val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "SVGFECompositeElement", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static double SVG_FECOMPOSITE_OPERATOR_ARITHMETIC(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "SVGFECompositeElement", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "SVG_FECOMPOSITE_OPERATOR_ARITHMETIC", double.class);
}
@JsOverlay
public static double SVG_FECOMPOSITE_OPERATOR_ATOP(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "SVGFECompositeElement", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "SVG_FECOMPOSITE_OPERATOR_ATOP", double.class);
}
@JsOverlay
public static double SVG_FECOMPOSITE_OPERATOR_IN(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "SVGFECompositeElement", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "SVG_FECOMPOSITE_OPERATOR_IN", double.class);
}
@JsOverlay
public static double SVG_FECOMPOSITE_OPERATOR_OUT(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "SVGFECompositeElement", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "SVG_FECOMPOSITE_OPERATOR_OUT", double.class);
}
@JsOverlay
public static double SVG_FECOMPOSITE_OPERATOR_OVER(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "SVGFECompositeElement", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "SVG_FECOMPOSITE_OPERATOR_OVER", double.class);
}
@JsOverlay
public static double SVG_FECOMPOSITE_OPERATOR_UNKNOWN(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "SVGFECompositeElement", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "SVG_FECOMPOSITE_OPERATOR_UNKNOWN", double.class);
}
@JsOverlay
public static double SVG_FECOMPOSITE_OPERATOR_XOR(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "SVGFECompositeElement", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "SVG_FECOMPOSITE_OPERATOR_XOR", double.class);
}
@JsOverlay
public static SVGFECompositeElement _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "SVGFECompositeElement");
  return com.user00.domjnate.util.Js.construct(_win, constructor, SVGFECompositeElement.class);
}
}
