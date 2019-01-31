package com.user00.domjnate.api.svg;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="SVGTextContentElement")
public interface SVGTextContentElement extends SVGGraphicsElement
{
@JsProperty(name="lengthAdjust")
SVGAnimatedEnumeration getLengthAdjust();
@JsProperty(name="textLength")
SVGAnimatedLength getTextLength();
@JsProperty(name="LENGTHADJUST_SPACING")
double LENGTHADJUST_SPACING();
@JsProperty(name="LENGTHADJUST_SPACINGANDGLYPHS")
double LENGTHADJUST_SPACINGANDGLYPHS();
@JsProperty(name="LENGTHADJUST_UNKNOWN")
double LENGTHADJUST_UNKNOWN();
@JsMethod(name="getCharNumAtPosition")
double getCharNumAtPosition(com.user00.domjnate.api.DOMPoint point);
@JsMethod(name="getComputedTextLength")
double getComputedTextLength();
@JsMethod(name="getEndPositionOfChar")
com.user00.domjnate.api.DOMPoint getEndPositionOfChar(double charnum);
@JsMethod(name="getExtentOfChar")
com.user00.domjnate.api.DOMRect getExtentOfChar(double charnum);
@JsMethod(name="getNumberOfChars")
double getNumberOfChars();
@JsMethod(name="getRotationOfChar")
double getRotationOfChar(double charnum);
@JsMethod(name="getStartPositionOfChar")
com.user00.domjnate.api.DOMPoint getStartPositionOfChar(double charnum);
@JsMethod(name="getSubStringLength")
double getSubStringLength(double charnum, double nchars);
@JsMethod(name="selectSubString")
void selectSubString(double charnum, double nchars);
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
public static SVGTextContentElement getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "SVGTextContentElement", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", SVGTextContentElement.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, SVGTextContentElement val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "SVGTextContentElement", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static double LENGTHADJUST_SPACING(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "SVGTextContentElement", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "LENGTHADJUST_SPACING", double.class);
}
@JsOverlay
public static double LENGTHADJUST_SPACINGANDGLYPHS(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "SVGTextContentElement", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "LENGTHADJUST_SPACINGANDGLYPHS", double.class);
}
@JsOverlay
public static double LENGTHADJUST_UNKNOWN(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "SVGTextContentElement", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "LENGTHADJUST_UNKNOWN", double.class);
}
@JsOverlay
public static SVGTextContentElement _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "SVGTextContentElement");
  return com.user00.domjnate.util.Js.construct(_win, constructor, SVGTextContentElement.class);
}
}
