package com.user00.domjnate.api.svg;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="SVGFESpotLightElement")
public interface SVGFESpotLightElement extends SVGElement
{
@JsProperty(name="limitingConeAngle")
SVGAnimatedNumber getLimitingConeAngle();
@JsProperty(name="pointsAtX")
SVGAnimatedNumber getPointsAtX();
@JsProperty(name="pointsAtY")
SVGAnimatedNumber getPointsAtY();
@JsProperty(name="pointsAtZ")
SVGAnimatedNumber getPointsAtZ();
@JsProperty(name="specularExponent")
SVGAnimatedNumber getSpecularExponent();
@JsProperty(name="x")
SVGAnimatedNumber getX();
@JsProperty(name="y")
SVGAnimatedNumber getY();
@JsProperty(name="z")
SVGAnimatedNumber getZ();
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
public static SVGFESpotLightElement getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "SVGFESpotLightElement", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", SVGFESpotLightElement.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, SVGFESpotLightElement val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "SVGFESpotLightElement", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static SVGFESpotLightElement _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "SVGFESpotLightElement");
  return com.user00.domjnate.util.Js.construct(_win, constructor, SVGFESpotLightElement.class);
}
}
