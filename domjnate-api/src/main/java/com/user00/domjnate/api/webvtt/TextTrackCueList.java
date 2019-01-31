package com.user00.domjnate.api.webvtt;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="TextTrackCueList")
public interface TextTrackCueList
{
@JsProperty(name="length")
double getLength();
@JsMethod(name="getCueById")
TextTrackCue getCueById(String id);
@JsMethod(name="item")
TextTrackCue item(double index);
@JsOverlay
public default TextTrackCue get(double index) {
  return (TextTrackCue)com.user00.domjnate.util.Js.getIndex(this, index, TextTrackCue.class);
}
@JsOverlay
public default void set(double index, TextTrackCue val) {
  com.user00.domjnate.util.Js.setIndex(this, index, val);
}
@JsOverlay
public static TextTrackCueList getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "TextTrackCueList", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", TextTrackCueList.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, TextTrackCueList val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "TextTrackCueList", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static TextTrackCueList _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "TextTrackCueList");
  return com.user00.domjnate.util.Js.construct(_win, constructor, TextTrackCueList.class);
}
}
