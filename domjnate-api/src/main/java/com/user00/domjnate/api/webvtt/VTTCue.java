package com.user00.domjnate.api.webvtt;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="VTTCue")
public interface VTTCue extends TextTrackCue
{
@JsProperty(name="align")
String getAlign();
@JsProperty(name="align")
void setAlign(String val);
@JsProperty(name="line")
java.lang.Object getLine();
@JsProperty(name="line")
void setLine(java.lang.Object val);
@JsProperty(name="lineAlign")
String getLineAlign();
@JsProperty(name="lineAlign")
void setLineAlign(String val);
@JsProperty(name="position")
java.lang.Object getPosition();
@JsProperty(name="position")
void setPosition(java.lang.Object val);
@JsProperty(name="positionAlign")
String getPositionAlign();
@JsProperty(name="positionAlign")
void setPositionAlign(String val);
@JsProperty(name="region")
VTTRegion getRegion();
@JsProperty(name="region")
void setRegion(VTTRegion val);
@JsProperty(name="size")
double getSize();
@JsProperty(name="size")
void setSize(double val);
@JsProperty(name="snapToLines")
boolean getSnapToLines();
@JsProperty(name="snapToLines")
void setSnapToLines(boolean val);
@JsProperty(name="text")
String getText();
@JsProperty(name="text")
void setText(String val);
@JsProperty(name="vertical")
String getVertical();
@JsProperty(name="vertical")
void setVertical(String val);
@JsMethod(name="getCueAsHTML")
com.user00.domjnate.api.dom.DocumentFragment getCueAsHTML();
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
public static VTTCue getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "VTTCue", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", VTTCue.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, VTTCue val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "VTTCue", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static VTTCue _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, double startTime, double endTime, String text) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "VTTCue");
  return com.user00.domjnate.util.Js.construct(_win, constructor, VTTCue.class, startTime, endTime, text);
}
}
