package com.user00.domjnate.api.svg;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="SVGFEDisplacementMapElement")
public interface SVGFEDisplacementMapElement extends SVGElement, SVGFilterPrimitiveStandardAttributes
{
@JsProperty(name="in1")
SVGAnimatedString getIn1();
@JsProperty(name="in2")
SVGAnimatedString getIn2();
@JsProperty(name="scale")
SVGAnimatedNumber getScale();
@JsProperty(name="xChannelSelector")
SVGAnimatedEnumeration getXChannelSelector();
@JsProperty(name="yChannelSelector")
SVGAnimatedEnumeration getYChannelSelector();
@JsProperty(name="SVG_CHANNEL_A")
double SVG_CHANNEL_A();
@JsProperty(name="SVG_CHANNEL_B")
double SVG_CHANNEL_B();
@JsProperty(name="SVG_CHANNEL_G")
double SVG_CHANNEL_G();
@JsProperty(name="SVG_CHANNEL_R")
double SVG_CHANNEL_R();
@JsProperty(name="SVG_CHANNEL_UNKNOWN")
double SVG_CHANNEL_UNKNOWN();
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
public static SVGFEDisplacementMapElement getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "SVGFEDisplacementMapElement", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", SVGFEDisplacementMapElement.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, SVGFEDisplacementMapElement val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "SVGFEDisplacementMapElement", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static double SVG_CHANNEL_A(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "SVGFEDisplacementMapElement", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "SVG_CHANNEL_A", double.class);
}
@JsOverlay
public static double SVG_CHANNEL_B(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "SVGFEDisplacementMapElement", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "SVG_CHANNEL_B", double.class);
}
@JsOverlay
public static double SVG_CHANNEL_G(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "SVGFEDisplacementMapElement", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "SVG_CHANNEL_G", double.class);
}
@JsOverlay
public static double SVG_CHANNEL_R(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "SVGFEDisplacementMapElement", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "SVG_CHANNEL_R", double.class);
}
@JsOverlay
public static double SVG_CHANNEL_UNKNOWN(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "SVGFEDisplacementMapElement", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "SVG_CHANNEL_UNKNOWN", double.class);
}
@JsOverlay
public static SVGFEDisplacementMapElement _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "SVGFEDisplacementMapElement");
  return com.user00.domjnate.util.Js.construct(_win, constructor, SVGFEDisplacementMapElement.class);
}
}
