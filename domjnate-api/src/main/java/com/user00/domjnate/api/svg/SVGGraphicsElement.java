package com.user00.domjnate.api.svg;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="SVGGraphicsElement")
public interface SVGGraphicsElement extends SVGElement, SVGTests
{
@JsProperty(name="transform")
SVGAnimatedTransformList getTransform();
@JsMethod(name="getBBox")
com.user00.domjnate.api.DOMRect getBBox();
@JsMethod(name="getBBox")
com.user00.domjnate.api.DOMRect getBBox(SVGBoundingBoxOptions options);
@JsMethod(name="getCTM")
com.user00.domjnate.api.DOMMatrix getCTM();
@JsMethod(name="getScreenCTM")
com.user00.domjnate.api.DOMMatrix getScreenCTM();
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
public static SVGGraphicsElement getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "SVGGraphicsElement", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", SVGGraphicsElement.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, SVGGraphicsElement val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "SVGGraphicsElement", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static SVGGraphicsElement _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "SVGGraphicsElement");
  return com.user00.domjnate.util.Js.construct(_win, constructor, SVGGraphicsElement.class);
}
}
