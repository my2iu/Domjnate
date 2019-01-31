package com.user00.domjnate.api.svg;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="SVGPatternElement")
public interface SVGPatternElement extends SVGElement, SVGTests, SVGFitToViewBox, SVGURIReference
{
@JsProperty(name="height")
SVGAnimatedLength getHeight();
@JsProperty(name="patternContentUnits")
SVGAnimatedEnumeration getPatternContentUnits();
@JsProperty(name="patternTransform")
SVGAnimatedTransformList getPatternTransform();
@JsProperty(name="patternUnits")
SVGAnimatedEnumeration getPatternUnits();
@JsProperty(name="width")
SVGAnimatedLength getWidth();
@JsProperty(name="x")
SVGAnimatedLength getX();
@JsProperty(name="y")
SVGAnimatedLength getY();
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
public static SVGPatternElement getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "SVGPatternElement", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", SVGPatternElement.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, SVGPatternElement val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "SVGPatternElement", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static SVGPatternElement _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "SVGPatternElement");
  return com.user00.domjnate.util.Js.construct(_win, constructor, SVGPatternElement.class);
}
}
