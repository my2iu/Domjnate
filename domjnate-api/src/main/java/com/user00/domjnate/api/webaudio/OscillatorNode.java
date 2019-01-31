package com.user00.domjnate.api.webaudio;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="OscillatorNode")
public interface OscillatorNode extends AudioScheduledSourceNode
{
@JsProperty(name="detune")
AudioParam getDetune();
@JsProperty(name="frequency")
AudioParam getFrequency();
@JsProperty(name="type")
String getType();
@JsProperty(name="type")
void setType(String val);
@JsMethod(name="setPeriodicWave")
void setPeriodicWave(PeriodicWave periodicWave);
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
public static OscillatorNode getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "OscillatorNode", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", OscillatorNode.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, OscillatorNode val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "OscillatorNode", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static OscillatorNode _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, BaseAudioContext context) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "OscillatorNode");
  return com.user00.domjnate.util.Js.construct(_win, constructor, OscillatorNode.class, context);
}
@JsOverlay
public static OscillatorNode _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, BaseAudioContext context, OscillatorOptions options) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "OscillatorNode");
  return com.user00.domjnate.util.Js.construct(_win, constructor, OscillatorNode.class, context, options);
}
}
