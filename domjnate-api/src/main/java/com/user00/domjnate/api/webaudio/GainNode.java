package com.user00.domjnate.api.webaudio;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="GainNode")
public interface GainNode extends AudioNode
{
@JsProperty(name="gain")
AudioParam getGain();
@JsOverlay
public static GainNode getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "GainNode", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", GainNode.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, GainNode val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "GainNode", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static GainNode _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, BaseAudioContext context) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "GainNode");
  return com.user00.domjnate.util.Js.construct(_win, constructor, GainNode.class, context);
}
@JsOverlay
public static GainNode _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, BaseAudioContext context, GainOptions options) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "GainNode");
  return com.user00.domjnate.util.Js.construct(_win, constructor, GainNode.class, context, options);
}
}
