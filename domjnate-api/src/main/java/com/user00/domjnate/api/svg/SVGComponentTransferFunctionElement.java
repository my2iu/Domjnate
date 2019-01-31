package com.user00.domjnate.api.svg;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="SVGComponentTransferFunctionElement")
public interface SVGComponentTransferFunctionElement extends SVGElement
{
@JsProperty(name="amplitude")
SVGAnimatedNumber getAmplitude();
@JsProperty(name="exponent")
SVGAnimatedNumber getExponent();
@JsProperty(name="intercept")
SVGAnimatedNumber getIntercept();
@JsProperty(name="offset")
SVGAnimatedNumber getOffset();
@JsProperty(name="slope")
SVGAnimatedNumber getSlope();
@JsProperty(name="tableValues")
SVGAnimatedNumberList getTableValues();
@JsProperty(name="type")
SVGAnimatedEnumeration getType();
@JsProperty(name="SVG_FECOMPONENTTRANSFER_TYPE_DISCRETE")
double SVG_FECOMPONENTTRANSFER_TYPE_DISCRETE();
@JsProperty(name="SVG_FECOMPONENTTRANSFER_TYPE_GAMMA")
double SVG_FECOMPONENTTRANSFER_TYPE_GAMMA();
@JsProperty(name="SVG_FECOMPONENTTRANSFER_TYPE_IDENTITY")
double SVG_FECOMPONENTTRANSFER_TYPE_IDENTITY();
@JsProperty(name="SVG_FECOMPONENTTRANSFER_TYPE_LINEAR")
double SVG_FECOMPONENTTRANSFER_TYPE_LINEAR();
@JsProperty(name="SVG_FECOMPONENTTRANSFER_TYPE_TABLE")
double SVG_FECOMPONENTTRANSFER_TYPE_TABLE();
@JsProperty(name="SVG_FECOMPONENTTRANSFER_TYPE_UNKNOWN")
double SVG_FECOMPONENTTRANSFER_TYPE_UNKNOWN();
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
public static SVGComponentTransferFunctionElement getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "SVGComponentTransferFunctionElement", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", SVGComponentTransferFunctionElement.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, SVGComponentTransferFunctionElement val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "SVGComponentTransferFunctionElement", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static double SVG_FECOMPONENTTRANSFER_TYPE_DISCRETE(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "SVGComponentTransferFunctionElement", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "SVG_FECOMPONENTTRANSFER_TYPE_DISCRETE", double.class);
}
@JsOverlay
public static double SVG_FECOMPONENTTRANSFER_TYPE_GAMMA(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "SVGComponentTransferFunctionElement", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "SVG_FECOMPONENTTRANSFER_TYPE_GAMMA", double.class);
}
@JsOverlay
public static double SVG_FECOMPONENTTRANSFER_TYPE_IDENTITY(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "SVGComponentTransferFunctionElement", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "SVG_FECOMPONENTTRANSFER_TYPE_IDENTITY", double.class);
}
@JsOverlay
public static double SVG_FECOMPONENTTRANSFER_TYPE_LINEAR(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "SVGComponentTransferFunctionElement", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "SVG_FECOMPONENTTRANSFER_TYPE_LINEAR", double.class);
}
@JsOverlay
public static double SVG_FECOMPONENTTRANSFER_TYPE_TABLE(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "SVGComponentTransferFunctionElement", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "SVG_FECOMPONENTTRANSFER_TYPE_TABLE", double.class);
}
@JsOverlay
public static double SVG_FECOMPONENTTRANSFER_TYPE_UNKNOWN(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "SVGComponentTransferFunctionElement", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "SVG_FECOMPONENTTRANSFER_TYPE_UNKNOWN", double.class);
}
@JsOverlay
public static SVGComponentTransferFunctionElement _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "SVGComponentTransferFunctionElement");
  return com.user00.domjnate.util.Js.construct(_win, constructor, SVGComponentTransferFunctionElement.class);
}
}
