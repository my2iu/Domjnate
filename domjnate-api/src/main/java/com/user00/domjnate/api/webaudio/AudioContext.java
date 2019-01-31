package com.user00.domjnate.api.webaudio;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="AudioContext")
public interface AudioContext extends BaseAudioContext
{
@JsProperty(name="baseLatency")
double getBaseLatency();
@JsProperty(name="outputLatency")
double getOutputLatency();
@JsMethod(name="close")
com.user00.domjnate.api.Promise<Void> close();
@JsMethod(name="createMediaElementSource")
MediaElementAudioSourceNode createMediaElementSource(com.user00.domjnate.api.html.HTMLMediaElement mediaElement);
@JsMethod(name="createMediaStreamDestination")
MediaStreamAudioDestinationNode createMediaStreamDestination();
@JsMethod(name="createMediaStreamSource")
MediaStreamAudioSourceNode createMediaStreamSource(com.user00.domjnate.api.mediastream.MediaStream mediaStream);
@JsMethod(name="createMediaStreamTrackSource")
com.user00.domjnate.api.mediastream.MediaStreamTrackAudioSourceNode createMediaStreamTrackSource(com.user00.domjnate.api.mediastream.MediaStreamTrack mediaStreamTrack);
@JsMethod(name="getOutputTimestamp")
AudioTimestamp getOutputTimestamp();
@JsMethod(name="suspend")
com.user00.domjnate.api.Promise<Void> suspend();
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
public static AudioContext getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "AudioContext", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", AudioContext.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, AudioContext val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "AudioContext", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static AudioContext _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "AudioContext");
  return com.user00.domjnate.util.Js.construct(_win, constructor, AudioContext.class);
}
@JsOverlay
public static AudioContext _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, AudioContextOptions contextOptions) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "AudioContext");
  return com.user00.domjnate.util.Js.construct(_win, constructor, AudioContext.class, contextOptions);
}
}
