package com.user00.domjnate.api.svg;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="SVGLineElement")
public interface SVGLineElement extends SVGGraphicsElement
{
@JsProperty(name="x1")
SVGAnimatedLength getX1();
@JsProperty(name="x2")
SVGAnimatedLength getX2();
@JsProperty(name="y1")
SVGAnimatedLength getY1();
@JsProperty(name="y2")
SVGAnimatedLength getY2();
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
public static SVGLineElement getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "SVGLineElement", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", SVGLineElement.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, SVGLineElement val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "SVGLineElement", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static SVGLineElement _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "SVGLineElement");
  return com.user00.domjnate.util.Js.construct(_win, constructor, SVGLineElement.class);
}
}
