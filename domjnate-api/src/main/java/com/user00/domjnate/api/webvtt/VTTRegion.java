package com.user00.domjnate.api.webvtt;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="VTTRegion")
public interface VTTRegion
{
@JsProperty(name="id")
String getId();
@JsProperty(name="id")
void setId(String val);
@JsProperty(name="lines")
double getLines();
@JsProperty(name="lines")
void setLines(double val);
@JsProperty(name="regionAnchorX")
double getRegionAnchorX();
@JsProperty(name="regionAnchorX")
void setRegionAnchorX(double val);
@JsProperty(name="regionAnchorY")
double getRegionAnchorY();
@JsProperty(name="regionAnchorY")
void setRegionAnchorY(double val);
@JsProperty(name="scroll")
String getScroll();
@JsProperty(name="scroll")
void setScroll(String val);
@JsProperty(name="viewportAnchorX")
double getViewportAnchorX();
@JsProperty(name="viewportAnchorX")
void setViewportAnchorX(double val);
@JsProperty(name="viewportAnchorY")
double getViewportAnchorY();
@JsProperty(name="viewportAnchorY")
void setViewportAnchorY(double val);
@JsProperty(name="width")
double getWidth();
@JsProperty(name="width")
void setWidth(double val);
@JsOverlay
public static VTTRegion getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "VTTRegion", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", VTTRegion.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, VTTRegion val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "VTTRegion", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static VTTRegion _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "VTTRegion");
  return com.user00.domjnate.util.Js.construct(_win, constructor, VTTRegion.class);
}
}
