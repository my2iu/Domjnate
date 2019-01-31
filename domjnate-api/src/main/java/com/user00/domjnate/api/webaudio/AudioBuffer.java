package com.user00.domjnate.api.webaudio;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="AudioBuffer")
public interface AudioBuffer
{
@JsProperty(name="duration")
double getDuration();
@JsProperty(name="length")
double getLength();
@JsProperty(name="numberOfChannels")
double getNumberOfChannels();
@JsProperty(name="sampleRate")
double getSampleRate();
@JsMethod(name="copyFromChannel")
void copyFromChannel(com.user00.domjnate.api.Float32Array destination, double channelNumber);
@JsMethod(name="copyFromChannel")
void copyFromChannel(com.user00.domjnate.api.Float32Array destination, double channelNumber, double startInChannel);
@JsMethod(name="copyToChannel")
void copyToChannel(com.user00.domjnate.api.Float32Array source, double channelNumber);
@JsMethod(name="copyToChannel")
void copyToChannel(com.user00.domjnate.api.Float32Array source, double channelNumber, double startInChannel);
@JsMethod(name="getChannelData")
com.user00.domjnate.api.Float32Array getChannelData(double channel);
@JsOverlay
public static AudioBuffer getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "AudioBuffer", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", AudioBuffer.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, AudioBuffer val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "AudioBuffer", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static AudioBuffer _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, AudioBufferOptions options) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "AudioBuffer");
  return com.user00.domjnate.util.Js.construct(_win, constructor, AudioBuffer.class, options);
}
}
