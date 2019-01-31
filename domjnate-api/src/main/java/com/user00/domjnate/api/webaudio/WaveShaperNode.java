package com.user00.domjnate.api.webaudio;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="WaveShaperNode")
public interface WaveShaperNode extends AudioNode
{
@JsProperty(name="curve")
com.user00.domjnate.api.Float32Array getCurve();
@JsProperty(name="curve")
void setCurve(com.user00.domjnate.api.Float32Array val);
@JsProperty(name="oversample")
String getOversample();
@JsProperty(name="oversample")
void setOversample(String val);
@JsOverlay
public static WaveShaperNode getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "WaveShaperNode", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", WaveShaperNode.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, WaveShaperNode val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "WaveShaperNode", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static WaveShaperNode _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, BaseAudioContext context) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "WaveShaperNode");
  return com.user00.domjnate.util.Js.construct(_win, constructor, WaveShaperNode.class, context);
}
@JsOverlay
public static WaveShaperNode _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, BaseAudioContext context, WaveShaperOptions options) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "WaveShaperNode");
  return com.user00.domjnate.util.Js.construct(_win, constructor, WaveShaperNode.class, context, options);
}
}
