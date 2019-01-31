package com.user00.domjnate.api.svg;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="SVGTextPathElement")
public interface SVGTextPathElement extends SVGTextContentElement, SVGURIReference
{
@JsProperty(name="method")
SVGAnimatedEnumeration getMethod();
@JsProperty(name="spacing")
SVGAnimatedEnumeration getSpacing();
@JsProperty(name="startOffset")
SVGAnimatedLength getStartOffset();
@JsProperty(name="TEXTPATH_METHODTYPE_ALIGN")
double TEXTPATH_METHODTYPE_ALIGN();
@JsProperty(name="TEXTPATH_METHODTYPE_STRETCH")
double TEXTPATH_METHODTYPE_STRETCH();
@JsProperty(name="TEXTPATH_METHODTYPE_UNKNOWN")
double TEXTPATH_METHODTYPE_UNKNOWN();
@JsProperty(name="TEXTPATH_SPACINGTYPE_AUTO")
double TEXTPATH_SPACINGTYPE_AUTO();
@JsProperty(name="TEXTPATH_SPACINGTYPE_EXACT")
double TEXTPATH_SPACINGTYPE_EXACT();
@JsProperty(name="TEXTPATH_SPACINGTYPE_UNKNOWN")
double TEXTPATH_SPACINGTYPE_UNKNOWN();
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
public static SVGTextPathElement getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "SVGTextPathElement", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", SVGTextPathElement.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, SVGTextPathElement val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "SVGTextPathElement", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static double TEXTPATH_METHODTYPE_ALIGN(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "SVGTextPathElement", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "TEXTPATH_METHODTYPE_ALIGN", double.class);
}
@JsOverlay
public static double TEXTPATH_METHODTYPE_STRETCH(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "SVGTextPathElement", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "TEXTPATH_METHODTYPE_STRETCH", double.class);
}
@JsOverlay
public static double TEXTPATH_METHODTYPE_UNKNOWN(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "SVGTextPathElement", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "TEXTPATH_METHODTYPE_UNKNOWN", double.class);
}
@JsOverlay
public static double TEXTPATH_SPACINGTYPE_AUTO(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "SVGTextPathElement", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "TEXTPATH_SPACINGTYPE_AUTO", double.class);
}
@JsOverlay
public static double TEXTPATH_SPACINGTYPE_EXACT(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "SVGTextPathElement", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "TEXTPATH_SPACINGTYPE_EXACT", double.class);
}
@JsOverlay
public static double TEXTPATH_SPACINGTYPE_UNKNOWN(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "SVGTextPathElement", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "TEXTPATH_SPACINGTYPE_UNKNOWN", double.class);
}
@JsOverlay
public static SVGTextPathElement _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "SVGTextPathElement");
  return com.user00.domjnate.util.Js.construct(_win, constructor, SVGTextPathElement.class);
}
}
