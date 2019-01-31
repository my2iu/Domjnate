package com.user00.domjnate.api.webaudio;

import jsinterop.annotations.JsFunction;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="AudioWorkletNode")
public interface AudioWorkletNode extends AudioNode
{
@JsProperty(name="onprocessorerror")
OnprocessorerrorCallback getOnprocessorerror();
@JsProperty(name="onprocessorerror")
void setOnprocessorerror(OnprocessorerrorCallback val);
@JsProperty(name="parameters")
AudioParamMap getParameters();
@JsProperty(name="port")
com.user00.domjnate.api.MessagePort getPort();
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
@JsFunction public static interface OnprocessorerrorCallback
{
java.lang.Object apply(com.user00.domjnate.api.dom.Event ev);
}
@JsOverlay
public static AudioWorkletNode getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "AudioWorkletNode", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", AudioWorkletNode.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, AudioWorkletNode val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "AudioWorkletNode", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static AudioWorkletNode _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, BaseAudioContext context, String name) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "AudioWorkletNode");
  return com.user00.domjnate.util.Js.construct(_win, constructor, AudioWorkletNode.class, context, name);
}
@JsOverlay
public static AudioWorkletNode _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, BaseAudioContext context, String name, AudioWorkletNodeOptions options) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "AudioWorkletNode");
  return com.user00.domjnate.util.Js.construct(_win, constructor, AudioWorkletNode.class, context, name, options);
}
}
