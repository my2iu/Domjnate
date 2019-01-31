package com.user00.domjnate.api.webaudio;

import jsinterop.annotations.JsFunction;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="AudioTrackList")
public interface AudioTrackList extends com.user00.domjnate.api.dom.EventTarget
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
@JsMethod(name="getTrackById")
AudioTrack getTrackById(String id);
@JsMethod(name="item")
AudioTrack item(double index);
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
public default AudioTrack get(double index) {
  return (AudioTrack)com.user00.domjnate.util.Js.getIndex(this, index, AudioTrack.class);
}
@JsOverlay
public default void set(double index, AudioTrack val) {
  com.user00.domjnate.util.Js.setIndex(this, index, val);
}
@JsFunction public static interface OnchangeCallback
{
java.lang.Object apply(com.user00.domjnate.api.dom.Event ev);
}
@JsFunction public static interface OnremovetrackCallback
{
java.lang.Object apply(com.user00.domjnate.api.TrackEvent ev);
}
@JsFunction public static interface OnaddtrackCallback
{
java.lang.Object apply(com.user00.domjnate.api.TrackEvent ev);
}
@JsOverlay
public static AudioTrackList getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "AudioTrackList", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", AudioTrackList.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, AudioTrackList val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "AudioTrackList", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static AudioTrackList _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "AudioTrackList");
  return com.user00.domjnate.util.Js.construct(_win, constructor, AudioTrackList.class);
}
}
