package com.user00.domjnate.api.webaudio;

import jsinterop.annotations.JsFunction;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="AudioScheduledSourceNode")
public interface AudioScheduledSourceNode extends AudioNode
{
@JsProperty(name="onended")
OnendedCallback getOnended();
@JsProperty(name="onended")
void setOnended(OnendedCallback val);
@JsMethod(name="start")
void start();
@JsMethod(name="start")
void start(double when);
@JsMethod(name="stop")
void stop();
@JsMethod(name="stop")
void stop(double when);
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
@JsFunction public static interface OnendedCallback
{
java.lang.Object apply(com.user00.domjnate.api.dom.Event ev);
}
@JsOverlay
public static AudioScheduledSourceNode getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "AudioScheduledSourceNode", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", AudioScheduledSourceNode.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, AudioScheduledSourceNode val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "AudioScheduledSourceNode", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static AudioScheduledSourceNode _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "AudioScheduledSourceNode");
  return com.user00.domjnate.util.Js.construct(_win, constructor, AudioScheduledSourceNode.class);
}
}
