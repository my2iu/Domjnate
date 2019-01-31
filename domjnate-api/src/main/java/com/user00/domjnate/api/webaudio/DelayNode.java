package com.user00.domjnate.api.webaudio;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="DelayNode")
public interface DelayNode extends AudioNode
{
@JsProperty(name="delayTime")
AudioParam getDelayTime();
@JsOverlay
public static DelayNode getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "DelayNode", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", DelayNode.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, DelayNode val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "DelayNode", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static DelayNode _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, BaseAudioContext context) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "DelayNode");
  return com.user00.domjnate.util.Js.construct(_win, constructor, DelayNode.class, context);
}
@JsOverlay
public static DelayNode _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, BaseAudioContext context, DelayOptions options) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "DelayNode");
  return com.user00.domjnate.util.Js.construct(_win, constructor, DelayNode.class, context, options);
}
}
