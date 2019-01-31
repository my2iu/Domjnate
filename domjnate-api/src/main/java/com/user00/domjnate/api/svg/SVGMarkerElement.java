package com.user00.domjnate.api.svg;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="SVGMarkerElement")
public interface SVGMarkerElement extends SVGElement, SVGFitToViewBox
{
@JsProperty(name="markerHeight")
SVGAnimatedLength getMarkerHeight();
@JsProperty(name="markerUnits")
SVGAnimatedEnumeration getMarkerUnits();
@JsProperty(name="markerWidth")
SVGAnimatedLength getMarkerWidth();
@JsProperty(name="orientAngle")
SVGAnimatedAngle getOrientAngle();
@JsProperty(name="orientType")
SVGAnimatedEnumeration getOrientType();
@JsProperty(name="refX")
SVGAnimatedLength getRefX();
@JsProperty(name="refY")
SVGAnimatedLength getRefY();
@JsProperty(name="SVG_MARKERUNITS_STROKEWIDTH")
double SVG_MARKERUNITS_STROKEWIDTH();
@JsProperty(name="SVG_MARKERUNITS_UNKNOWN")
double SVG_MARKERUNITS_UNKNOWN();
@JsProperty(name="SVG_MARKERUNITS_USERSPACEONUSE")
double SVG_MARKERUNITS_USERSPACEONUSE();
@JsProperty(name="SVG_MARKER_ORIENT_ANGLE")
double SVG_MARKER_ORIENT_ANGLE();
@JsProperty(name="SVG_MARKER_ORIENT_AUTO")
double SVG_MARKER_ORIENT_AUTO();
@JsProperty(name="SVG_MARKER_ORIENT_UNKNOWN")
double SVG_MARKER_ORIENT_UNKNOWN();
@JsMethod(name="setOrientToAngle")
void setOrientToAngle(SVGAngle angle);
@JsMethod(name="setOrientToAuto")
void setOrientToAuto();
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
public static SVGMarkerElement getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "SVGMarkerElement", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", SVGMarkerElement.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, SVGMarkerElement val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "SVGMarkerElement", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static double SVG_MARKERUNITS_STROKEWIDTH(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "SVGMarkerElement", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "SVG_MARKERUNITS_STROKEWIDTH", double.class);
}
@JsOverlay
public static double SVG_MARKERUNITS_UNKNOWN(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "SVGMarkerElement", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "SVG_MARKERUNITS_UNKNOWN", double.class);
}
@JsOverlay
public static double SVG_MARKERUNITS_USERSPACEONUSE(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "SVGMarkerElement", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "SVG_MARKERUNITS_USERSPACEONUSE", double.class);
}
@JsOverlay
public static double SVG_MARKER_ORIENT_ANGLE(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "SVGMarkerElement", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "SVG_MARKER_ORIENT_ANGLE", double.class);
}
@JsOverlay
public static double SVG_MARKER_ORIENT_AUTO(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "SVGMarkerElement", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "SVG_MARKER_ORIENT_AUTO", double.class);
}
@JsOverlay
public static double SVG_MARKER_ORIENT_UNKNOWN(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "SVGMarkerElement", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "SVG_MARKER_ORIENT_UNKNOWN", double.class);
}
@JsOverlay
public static SVGMarkerElement _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "SVGMarkerElement");
  return com.user00.domjnate.util.Js.construct(_win, constructor, SVGMarkerElement.class);
}
}
