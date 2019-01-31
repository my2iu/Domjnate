package com.user00.domjnate.api.webaudio;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="AudioBufferSourceNode")
public interface AudioBufferSourceNode extends AudioScheduledSourceNode
{
@JsProperty(name="buffer")
AudioBuffer getBuffer();
@JsProperty(name="buffer")
void setBuffer(AudioBuffer val);
@JsProperty(name="detune")
AudioParam getDetune();
@JsProperty(name="loop")
boolean getLoop();
@JsProperty(name="loop")
void setLoop(boolean val);
@JsProperty(name="loopEnd")
double getLoopEnd();
@JsProperty(name="loopEnd")
void setLoopEnd(double val);
@JsProperty(name="loopStart")
double getLoopStart();
@JsProperty(name="loopStart")
void setLoopStart(double val);
@JsProperty(name="playbackRate")
AudioParam getPlaybackRate();
@JsMethod(name="start")
void start();
@JsMethod(name="start")
void start(double when);
@JsMethod(name="start")
void start(double when, double offset);
@JsMethod(name="start")
void start(double when, double offset, double duration);
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
public static AudioBufferSourceNode getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "AudioBufferSourceNode", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", AudioBufferSourceNode.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, AudioBufferSourceNode val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "AudioBufferSourceNode", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static AudioBufferSourceNode _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, BaseAudioContext context) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "AudioBufferSourceNode");
  return com.user00.domjnate.util.Js.construct(_win, constructor, AudioBufferSourceNode.class, context);
}
@JsOverlay
public static AudioBufferSourceNode _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, BaseAudioContext context, AudioBufferSourceOptions options) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "AudioBufferSourceNode");
  return com.user00.domjnate.util.Js.construct(_win, constructor, AudioBufferSourceNode.class, context, options);
}
}
