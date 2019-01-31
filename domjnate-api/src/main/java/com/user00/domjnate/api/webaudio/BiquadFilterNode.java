package com.user00.domjnate.api.webaudio;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="BiquadFilterNode")
public interface BiquadFilterNode extends AudioNode
{
@JsProperty(name="Q")
AudioParam Q();
@JsProperty(name="detune")
AudioParam getDetune();
@JsProperty(name="frequency")
AudioParam getFrequency();
@JsProperty(name="gain")
AudioParam getGain();
@JsProperty(name="type")
String getType();
@JsProperty(name="type")
void setType(String val);
@JsMethod(name="getFrequencyResponse")
void getFrequencyResponse(com.user00.domjnate.api.Float32Array frequencyHz, com.user00.domjnate.api.Float32Array magResponse, com.user00.domjnate.api.Float32Array phaseResponse);
@JsOverlay
public static BiquadFilterNode getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "BiquadFilterNode", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", BiquadFilterNode.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, BiquadFilterNode val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "BiquadFilterNode", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static BiquadFilterNode _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, BaseAudioContext context) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "BiquadFilterNode");
  return com.user00.domjnate.util.Js.construct(_win, constructor, BiquadFilterNode.class, context);
}
@JsOverlay
public static BiquadFilterNode _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, BaseAudioContext context, BiquadFilterOptions options) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "BiquadFilterNode");
  return com.user00.domjnate.util.Js.construct(_win, constructor, BiquadFilterNode.class, context, options);
}
}
