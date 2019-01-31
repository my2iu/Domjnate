package com.user00.domjnate.api.mediastream;

import jsinterop.annotations.JsFunction;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="MediaStreamTrack")
public interface MediaStreamTrack extends com.user00.domjnate.api.dom.EventTarget
{
@JsProperty(name="enabled")
boolean getEnabled();
@JsProperty(name="enabled")
void setEnabled(boolean val);
@JsProperty(name="id")
String getId();
@JsProperty(name="isolated")
boolean getIsolated();
@JsProperty(name="kind")
String getKind();
@JsProperty(name="label")
String getLabel();
@JsProperty(name="muted")
boolean getMuted();
@JsProperty(name="onended")
OnendedCallback getOnended();
@JsProperty(name="onended")
void setOnended(OnendedCallback val);
@JsProperty(name="onisolationchange")
OnisolationchangeCallback getOnisolationchange();
@JsProperty(name="onisolationchange")
void setOnisolationchange(OnisolationchangeCallback val);
@JsProperty(name="onmute")
OnmuteCallback getOnmute();
@JsProperty(name="onmute")
void setOnmute(OnmuteCallback val);
@JsProperty(name="onoverconstrained")
OnoverconstrainedCallback getOnoverconstrained();
@JsProperty(name="onoverconstrained")
void setOnoverconstrained(OnoverconstrainedCallback val);
@JsProperty(name="onunmute")
OnunmuteCallback getOnunmute();
@JsProperty(name="onunmute")
void setOnunmute(OnunmuteCallback val);
@JsProperty(name="readonly")
boolean getReadonly();
@JsProperty(name="readyState")
String getReadyState();
@JsProperty(name="remote")
boolean getRemote();
@JsMethod(name="applyConstraints")
com.user00.domjnate.api.Promise<Void> applyConstraints(MediaTrackConstraints constraints);
@JsMethod(name="clone")
MediaStreamTrack clone();
@JsMethod(name="getCapabilities")
MediaTrackCapabilities getCapabilities();
@JsMethod(name="getConstraints")
MediaTrackConstraints getConstraints();
@JsMethod(name="getSettings")
MediaTrackSettings getSettings();
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
@JsFunction public static interface OnoverconstrainedCallback
{
java.lang.Object apply(MediaStreamErrorEvent ev);
}
@JsFunction public static interface OnmuteCallback
{
java.lang.Object apply(com.user00.domjnate.api.dom.Event ev);
}
@JsFunction public static interface OnendedCallback
{
java.lang.Object apply(MediaStreamErrorEvent ev);
}
@JsFunction public static interface OnunmuteCallback
{
java.lang.Object apply(com.user00.domjnate.api.dom.Event ev);
}
@JsFunction public static interface OnisolationchangeCallback
{
java.lang.Object apply(com.user00.domjnate.api.dom.Event ev);
}
@JsOverlay
public static MediaStreamTrack getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "MediaStreamTrack", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", MediaStreamTrack.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, MediaStreamTrack val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "MediaStreamTrack", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static MediaStreamTrack _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "MediaStreamTrack");
  return com.user00.domjnate.util.Js.construct(_win, constructor, MediaStreamTrack.class);
}
}
