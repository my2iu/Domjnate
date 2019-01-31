package com.user00.domjnate.api.svg;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="SVGFEConvolveMatrixElement")
public interface SVGFEConvolveMatrixElement extends SVGElement, SVGFilterPrimitiveStandardAttributes
{
@JsProperty(name="bias")
SVGAnimatedNumber getBias();
@JsProperty(name="divisor")
SVGAnimatedNumber getDivisor();
@JsProperty(name="edgeMode")
SVGAnimatedEnumeration getEdgeMode();
@JsProperty(name="in1")
SVGAnimatedString getIn1();
@JsProperty(name="kernelMatrix")
SVGAnimatedNumberList getKernelMatrix();
@JsProperty(name="kernelUnitLengthX")
SVGAnimatedNumber getKernelUnitLengthX();
@JsProperty(name="kernelUnitLengthY")
SVGAnimatedNumber getKernelUnitLengthY();
@JsProperty(name="orderX")
SVGAnimatedInteger getOrderX();
@JsProperty(name="orderY")
SVGAnimatedInteger getOrderY();
@JsProperty(name="preserveAlpha")
SVGAnimatedBoolean getPreserveAlpha();
@JsProperty(name="targetX")
SVGAnimatedInteger getTargetX();
@JsProperty(name="targetY")
SVGAnimatedInteger getTargetY();
@JsProperty(name="SVG_EDGEMODE_DUPLICATE")
double SVG_EDGEMODE_DUPLICATE();
@JsProperty(name="SVG_EDGEMODE_NONE")
double SVG_EDGEMODE_NONE();
@JsProperty(name="SVG_EDGEMODE_UNKNOWN")
double SVG_EDGEMODE_UNKNOWN();
@JsProperty(name="SVG_EDGEMODE_WRAP")
double SVG_EDGEMODE_WRAP();
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
public static SVGFEConvolveMatrixElement getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "SVGFEConvolveMatrixElement", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", SVGFEConvolveMatrixElement.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, SVGFEConvolveMatrixElement val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "SVGFEConvolveMatrixElement", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static double SVG_EDGEMODE_DUPLICATE(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "SVGFEConvolveMatrixElement", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "SVG_EDGEMODE_DUPLICATE", double.class);
}
@JsOverlay
public static double SVG_EDGEMODE_NONE(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "SVGFEConvolveMatrixElement", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "SVG_EDGEMODE_NONE", double.class);
}
@JsOverlay
public static double SVG_EDGEMODE_UNKNOWN(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "SVGFEConvolveMatrixElement", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "SVG_EDGEMODE_UNKNOWN", double.class);
}
@JsOverlay
public static double SVG_EDGEMODE_WRAP(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "SVGFEConvolveMatrixElement", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "SVG_EDGEMODE_WRAP", double.class);
}
@JsOverlay
public static SVGFEConvolveMatrixElement _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "SVGFEConvolveMatrixElement");
  return com.user00.domjnate.util.Js.construct(_win, constructor, SVGFEConvolveMatrixElement.class);
}
}
