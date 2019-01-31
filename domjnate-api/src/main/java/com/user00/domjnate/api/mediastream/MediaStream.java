package com.user00.domjnate.api.mediastream;

import jsinterop.annotations.JsFunction;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="MediaStream")
public interface MediaStream extends com.user00.domjnate.api.dom.EventTarget
{
@JsProperty(name="active")
boolean getActive();
@JsProperty(name="id")
String getId();
@JsProperty(name="onactive")
OnactiveCallback getOnactive();
@JsProperty(name="onactive")
void setOnactive(OnactiveCallback val);
@JsProperty(name="onaddtrack")
OnaddtrackCallback getOnaddtrack();
@JsProperty(name="onaddtrack")
void setOnaddtrack(OnaddtrackCallback val);
@JsProperty(name="oninactive")
OninactiveCallback getOninactive();
@JsProperty(name="oninactive")
void setOninactive(OninactiveCallback val);
@JsProperty(name="onremovetrack")
OnremovetrackCallback getOnremovetrack();
@JsProperty(name="onremovetrack")
void setOnremovetrack(OnremovetrackCallback val);
@JsMethod(name="addTrack")
void addTrack(MediaStreamTrack track);
@JsMethod(name="clone")
MediaStream clone();
@JsMethod(name="getAudioTracks")
com.user00.domjnate.api.Array<MediaStreamTrack> getAudioTracks();
@JsMethod(name="getTrackById")
MediaStreamTrack getTrackById(String trackId);
@JsMethod(name="getTracks")
com.user00.domjnate.api.Array<MediaStreamTrack> getTracks();
@JsMethod(name="getVideoTracks")
com.user00.domjnate.api.Array<MediaStreamTrack> getVideoTracks();
@JsMethod(name="removeTrack")
void removeTrack(MediaStreamTrack track);
@JsMethod(name="stop")
void stop();
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
@JsFunction public static interface OninactiveCallback
{
java.lang.Object apply(com.user00.domjnate.api.dom.Event ev);
}
@JsFunction public static interface OnactiveCallback
{
java.lang.Object apply(com.user00.domjnate.api.dom.Event ev);
}
@JsFunction public static interface OnremovetrackCallback
{
java.lang.Object apply(MediaStreamTrackEvent ev);
}
@JsFunction public static interface OnaddtrackCallback
{
java.lang.Object apply(MediaStreamTrackEvent ev);
}
@JsOverlay
public static MediaStream getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "MediaStream", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", MediaStream.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, MediaStream val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "MediaStream", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static MediaStream _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "MediaStream");
  return com.user00.domjnate.util.Js.construct(_win, constructor, MediaStream.class);
}
@JsOverlay
public static MediaStream _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, MediaStream stream) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "MediaStream");
  return com.user00.domjnate.util.Js.construct(_win, constructor, MediaStream.class, stream);
}
@JsOverlay
public static MediaStream _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, com.user00.domjnate.api.Array<MediaStreamTrack> tracks) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "MediaStream");
  return com.user00.domjnate.util.Js.construct(_win, constructor, MediaStream.class, tracks);
}
}
