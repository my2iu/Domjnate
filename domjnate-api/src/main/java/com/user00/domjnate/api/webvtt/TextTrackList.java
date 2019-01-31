package com.user00.domjnate.api.webvtt;

import jsinterop.annotations.JsFunction;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="TextTrackList")
public interface TextTrackList extends com.user00.domjnate.api.dom.EventTarget
{
@JsProperty(name="length")
double getLength();
@JsProperty(name="onaddtrack")
OnaddtrackCallback getOnaddtrack();
@JsProperty(name="onaddtrack")
void setOnaddtrack(OnaddtrackCallback val);
@JsMethod(name="item")
TextTrack item(double index);
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
public default TextTrack get(double index) {
  return (TextTrack)com.user00.domjnate.util.Js.getIndex(this, index, TextTrack.class);
}
@JsOverlay
public default void set(double index, TextTrack val) {
  com.user00.domjnate.util.Js.setIndex(this, index, val);
}
@JsFunction public static interface OnaddtrackCallback
{
java.lang.Object apply(com.user00.domjnate.api.TrackEvent ev);
}
@JsOverlay
public static TextTrackList getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "TextTrackList", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", TextTrackList.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, TextTrackList val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "TextTrackList", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static TextTrackList _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "TextTrackList");
  return com.user00.domjnate.util.Js.construct(_win, constructor, TextTrackList.class);
}
}
