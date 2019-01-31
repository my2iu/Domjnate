package com.user00.domjnate.api.webaudio;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="IIRFilterNode")
public interface IIRFilterNode extends AudioNode
{
@JsMethod(name="getFrequencyResponse")
void getFrequencyResponse(com.user00.domjnate.api.Float32Array frequencyHz, com.user00.domjnate.api.Float32Array magResponse, com.user00.domjnate.api.Float32Array phaseResponse);
@JsOverlay
public static IIRFilterNode getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "IIRFilterNode", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", IIRFilterNode.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, IIRFilterNode val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "IIRFilterNode", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static IIRFilterNode _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, BaseAudioContext context, IIRFilterOptions options) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "IIRFilterNode");
  return com.user00.domjnate.util.Js.construct(_win, constructor, IIRFilterNode.class, context, options);
}
}
