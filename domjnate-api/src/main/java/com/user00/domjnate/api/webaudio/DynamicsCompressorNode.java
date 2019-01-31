package com.user00.domjnate.api.webaudio;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="DynamicsCompressorNode")
public interface DynamicsCompressorNode extends AudioNode
{
@JsProperty(name="attack")
AudioParam getAttack();
@JsProperty(name="knee")
AudioParam getKnee();
@JsProperty(name="ratio")
AudioParam getRatio();
@JsProperty(name="reduction")
double getReduction();
@JsProperty(name="release")
AudioParam getRelease();
@JsProperty(name="threshold")
AudioParam getThreshold();
@JsOverlay
public static DynamicsCompressorNode getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "DynamicsCompressorNode", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", DynamicsCompressorNode.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, DynamicsCompressorNode val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "DynamicsCompressorNode", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static DynamicsCompressorNode _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, BaseAudioContext context) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "DynamicsCompressorNode");
  return com.user00.domjnate.util.Js.construct(_win, constructor, DynamicsCompressorNode.class, context);
}
@JsOverlay
public static DynamicsCompressorNode _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, BaseAudioContext context, DynamicsCompressorOptions options) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "DynamicsCompressorNode");
  return com.user00.domjnate.util.Js.construct(_win, constructor, DynamicsCompressorNode.class, context, options);
}
}
