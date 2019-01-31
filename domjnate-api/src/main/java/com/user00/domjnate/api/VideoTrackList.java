package com.user00.domjnate.api;

import jsinterop.annotations.JsFunction;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="VideoTrackList")
public interface VideoTrackList extends com.user00.domjnate.api.dom.EventTarget
{
@JsProperty(name="length")
double getLength();
@JsProperty(name="onaddtrack")
OnaddtrackCallback getOnaddtrack();
@JsProperty(name="onaddtrack")
void setOnaddtrack(OnaddtrackCallback val);
@JsProperty(name="onchange")
OnchangeCallback getOnchange();
@JsProperty(name="onchange")
void setOnchange(OnchangeCallback val);
@JsProperty(name="onremovetrack")
OnremovetrackCallback getOnremovetrack();
@JsProperty(name="onremovetrack")
void setOnremovetrack(OnremovetrackCallback val);
@JsProperty(name="selectedIndex")
double getSelectedIndex();
@JsMethod(name="getTrackById")
VideoTrack getTrackById(String id);
@JsMethod(name="item")
VideoTrack item(double index);
// TODO: Suppressing generic keyof type parameter for addEventListener
@JsMethod(name="addEventListener")
void addEventListener(String type, EventListener listener);
@JsMethod(name="addEventListener")
void addEventListener(String type, EventListener listener, AddEventListenerOptions options);
@JsMethod(name="addEventListener")
void addEventListener(String type, EventListener listener, boolean options);
// TODO: Suppressing generic keyof type parameter for removeEventListener
@JsMethod(name="removeEventListener")
void removeEventListener(String type, EventListener listener);
@JsMethod(name="removeEventListener")
void removeEventListener(String type, EventListener listener, EventListenerOptions options);
@JsMethod(name="removeEventListener")
void removeEventListener(String type, EventListener listener, boolean options);
@JsOverlay
public default VideoTrack get(double index) {
  return (VideoTrack)com.user00.domjnate.util.Js.getIndex(this, index, VideoTrack.class);
}
@JsOverlay
public default void set(double index, VideoTrack val) {
  com.user00.domjnate.util.Js.setIndex(this, index, val);
}
@JsFunction public static interface OnchangeCallback
{
java.lang.Object apply(com.user00.domjnate.api.dom.Event ev);
}
@JsFunction public static interface OnremovetrackCallback
{
java.lang.Object apply(TrackEvent ev);
}
@JsFunction public static interface OnaddtrackCallback
{
java.lang.Object apply(TrackEvent ev);
}
@JsOverlay
public static VideoTrackList getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "VideoTrackList", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", VideoTrackList.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, VideoTrackList val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "VideoTrackList", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static VideoTrackList _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "VideoTrackList");
  return com.user00.domjnate.util.Js.construct(_win, constructor, VideoTrackList.class);
}
}
