package com.user00.domjnate.api.webaudio;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="AnalyserNode")
public interface AnalyserNode extends AudioNode
{
@JsProperty(name="fftSize")
double getFftSize();
@JsProperty(name="fftSize")
void setFftSize(double val);
@JsProperty(name="frequencyBinCount")
double getFrequencyBinCount();
@JsProperty(name="maxDecibels")
double getMaxDecibels();
@JsProperty(name="maxDecibels")
void setMaxDecibels(double val);
@JsProperty(name="minDecibels")
double getMinDecibels();
@JsProperty(name="minDecibels")
void setMinDecibels(double val);
@JsProperty(name="smoothingTimeConstant")
double getSmoothingTimeConstant();
@JsProperty(name="smoothingTimeConstant")
void setSmoothingTimeConstant(double val);
@JsMethod(name="getByteFrequencyData")
void getByteFrequencyData(com.user00.domjnate.api.Uint8Array array);
@JsMethod(name="getByteTimeDomainData")
void getByteTimeDomainData(com.user00.domjnate.api.Uint8Array array);
@JsMethod(name="getFloatFrequencyData")
void getFloatFrequencyData(com.user00.domjnate.api.Float32Array array);
@JsMethod(name="getFloatTimeDomainData")
void getFloatTimeDomainData(com.user00.domjnate.api.Float32Array array);
@JsOverlay
public static AnalyserNode getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "AnalyserNode", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", AnalyserNode.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, AnalyserNode val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "AnalyserNode", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static AnalyserNode _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, BaseAudioContext context) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "AnalyserNode");
  return com.user00.domjnate.util.Js.construct(_win, constructor, AnalyserNode.class, context);
}
@JsOverlay
public static AnalyserNode _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, BaseAudioContext context, AnalyserOptions options) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "AnalyserNode");
  return com.user00.domjnate.util.Js.construct(_win, constructor, AnalyserNode.class, context, options);
}
}
