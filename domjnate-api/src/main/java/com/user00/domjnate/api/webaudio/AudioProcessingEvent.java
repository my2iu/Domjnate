package com.user00.domjnate.api.webaudio;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="AudioProcessingEvent")
public interface AudioProcessingEvent extends com.user00.domjnate.api.dom.Event
{
@JsProperty(name="inputBuffer")
AudioBuffer getInputBuffer();
@JsProperty(name="outputBuffer")
AudioBuffer getOutputBuffer();
@JsProperty(name="playbackTime")
double getPlaybackTime();
@JsOverlay
public static AudioProcessingEvent getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "AudioProcessingEvent", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", AudioProcessingEvent.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, AudioProcessingEvent val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "AudioProcessingEvent", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static AudioProcessingEvent _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, String type, AudioProcessingEventInit eventInitDict) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "AudioProcessingEvent");
  return com.user00.domjnate.util.Js.construct(_win, constructor, AudioProcessingEvent.class, type, eventInitDict);
}
}
