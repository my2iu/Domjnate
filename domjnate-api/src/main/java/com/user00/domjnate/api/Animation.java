package com.user00.domjnate.api;

import jsinterop.annotations.JsFunction;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="Animation")
public interface Animation extends com.user00.domjnate.api.dom.EventTarget
{
@JsProperty(name="currentTime")
Double getCurrentTime();
@JsProperty(name="currentTime")
void setCurrentTime(Double val);
@JsProperty(name="effect")
AnimationEffect getEffect();
@JsProperty(name="effect")
void setEffect(AnimationEffect val);
@JsProperty(name="finished")
Promise<Animation> getFinished();
@JsProperty(name="id")
String getId();
@JsProperty(name="id")
void setId(String val);
@JsProperty(name="oncancel")
OncancelCallback getOncancel();
@JsProperty(name="oncancel")
void setOncancel(OncancelCallback val);
@JsProperty(name="onfinish")
OnfinishCallback getOnfinish();
@JsProperty(name="onfinish")
void setOnfinish(OnfinishCallback val);
@JsProperty(name="pending")
boolean getPending();
@JsProperty(name="playState")
String getPlayState();
@JsProperty(name="playbackRate")
double getPlaybackRate();
@JsProperty(name="playbackRate")
void setPlaybackRate(double val);
@JsProperty(name="ready")
Promise<Animation> getReady();
@JsProperty(name="startTime")
Double getStartTime();
@JsProperty(name="startTime")
void setStartTime(Double val);
@JsProperty(name="timeline")
AnimationTimeline getTimeline();
@JsProperty(name="timeline")
void setTimeline(AnimationTimeline val);
@JsMethod(name="cancel")
void cancel();
@JsMethod(name="finish")
void finish();
@JsMethod(name="pause")
void pause();
@JsMethod(name="play")
void play();
@JsMethod(name="reverse")
void reverse();
@JsMethod(name="updatePlaybackRate")
void updatePlaybackRate(double playbackRate);
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
@JsFunction public static interface OncancelCallback
{
java.lang.Object apply(AnimationPlaybackEvent ev);
}
@JsFunction public static interface OnfinishCallback
{
java.lang.Object apply(AnimationPlaybackEvent ev);
}
@JsOverlay
public static Animation getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "Animation", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", Animation.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, Animation val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "Animation", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static Animation _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "Animation");
  return com.user00.domjnate.util.Js.construct(_win, constructor, Animation.class);
}
@JsOverlay
public static Animation _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, AnimationEffect effect) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "Animation");
  return com.user00.domjnate.util.Js.construct(_win, constructor, Animation.class, effect);
}
@JsOverlay
public static Animation _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, AnimationEffect effect, AnimationTimeline timeline) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "Animation");
  return com.user00.domjnate.util.Js.construct(_win, constructor, Animation.class, effect, timeline);
}
}
