package com.user00.domjnate.api.webvtt;

import jsinterop.annotations.JsFunction;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="TextTrack")
public interface TextTrack extends com.user00.domjnate.api.dom.EventTarget
{
@JsProperty(name="activeCues")
TextTrackCueList getActiveCues();
@JsProperty(name="cues")
TextTrackCueList getCues();
@JsProperty(name="inBandMetadataTrackDispatchType")
String getInBandMetadataTrackDispatchType();
@JsProperty(name="kind")
String getKind();
@JsProperty(name="label")
String getLabel();
@JsProperty(name="language")
String getLanguage();
@JsProperty(name="mode")
java.lang.Object getMode();
@JsProperty(name="mode")
void setMode(java.lang.Object val);
@JsProperty(name="oncuechange")
OncuechangeCallback getOncuechange();
@JsProperty(name="oncuechange")
void setOncuechange(OncuechangeCallback val);
@JsProperty(name="onerror")
OnerrorCallback getOnerror();
@JsProperty(name="onerror")
void setOnerror(OnerrorCallback val);
@JsProperty(name="onload")
OnloadCallback getOnload();
@JsProperty(name="onload")
void setOnload(OnloadCallback val);
@JsProperty(name="readyState")
double getReadyState();
@JsProperty(name="DISABLED")
double DISABLED();
@JsProperty(name="ERROR")
double ERROR();
@JsProperty(name="HIDDEN")
double HIDDEN();
@JsProperty(name="LOADED")
double LOADED();
@JsProperty(name="LOADING")
double LOADING();
@JsProperty(name="NONE")
double NONE();
@JsProperty(name="SHOWING")
double SHOWING();
@JsMethod(name="addCue")
void addCue(TextTrackCue cue);
@JsMethod(name="removeCue")
void removeCue(TextTrackCue cue);
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
@JsFunction public static interface OnerrorCallback
{
java.lang.Object apply(com.user00.domjnate.api.dom.Event ev);
}
@JsFunction public static interface OnloadCallback
{
java.lang.Object apply(com.user00.domjnate.api.dom.Event ev);
}
@JsFunction public static interface OncuechangeCallback
{
java.lang.Object apply(com.user00.domjnate.api.dom.Event ev);
}
@JsOverlay
public static TextTrack getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "TextTrack", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", TextTrack.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, TextTrack val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "TextTrack", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static double DISABLED(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "TextTrack", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "DISABLED", double.class);
}
@JsOverlay
public static double ERROR(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "TextTrack", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "ERROR", double.class);
}
@JsOverlay
public static double HIDDEN(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "TextTrack", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "HIDDEN", double.class);
}
@JsOverlay
public static double LOADED(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "TextTrack", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "LOADED", double.class);
}
@JsOverlay
public static double LOADING(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "TextTrack", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "LOADING", double.class);
}
@JsOverlay
public static double NONE(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "TextTrack", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "NONE", double.class);
}
@JsOverlay
public static double SHOWING(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "TextTrack", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "SHOWING", double.class);
}
@JsOverlay
public static TextTrack _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "TextTrack");
  return com.user00.domjnate.util.Js.construct(_win, constructor, TextTrack.class);
}
}
