package com.user00.domjnate.api.webvtt;

import jsinterop.annotations.JsFunction;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="TextTrackCue")
public interface TextTrackCue extends com.user00.domjnate.api.dom.EventTarget
{
@JsProperty(name="endTime")
double getEndTime();
@JsProperty(name="endTime")
void setEndTime(double val);
@JsProperty(name="id")
String getId();
@JsProperty(name="id")
void setId(String val);
@JsProperty(name="onenter")
OnenterCallback getOnenter();
@JsProperty(name="onenter")
void setOnenter(OnenterCallback val);
@JsProperty(name="onexit")
OnexitCallback getOnexit();
@JsProperty(name="onexit")
void setOnexit(OnexitCallback val);
@JsProperty(name="pauseOnExit")
boolean getPauseOnExit();
@JsProperty(name="pauseOnExit")
void setPauseOnExit(boolean val);
@JsProperty(name="startTime")
double getStartTime();
@JsProperty(name="startTime")
void setStartTime(double val);
@JsProperty(name="text")
String getText();
@JsProperty(name="text")
void setText(String val);
@JsProperty(name="track")
TextTrack getTrack();
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
@JsFunction public static interface OnexitCallback
{
java.lang.Object apply(com.user00.domjnate.api.dom.Event ev);
}
@JsFunction public static interface OnenterCallback
{
java.lang.Object apply(com.user00.domjnate.api.dom.Event ev);
}
@JsOverlay
public static TextTrackCue getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "TextTrackCue", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", TextTrackCue.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, TextTrackCue val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "TextTrackCue", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static TextTrackCue _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, double startTime, double endTime, String text) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "TextTrackCue");
  return com.user00.domjnate.util.Js.construct(_win, constructor, TextTrackCue.class, startTime, endTime, text);
}
}
