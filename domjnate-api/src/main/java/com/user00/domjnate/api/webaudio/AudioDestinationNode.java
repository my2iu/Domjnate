package com.user00.domjnate.api.webaudio;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="AudioDestinationNode")
public interface AudioDestinationNode extends AudioNode
{
@JsProperty(name="maxChannelCount")
double getMaxChannelCount();
@JsOverlay
public static AudioDestinationNode getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "AudioDestinationNode", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", AudioDestinationNode.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, AudioDestinationNode val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "AudioDestinationNode", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static AudioDestinationNode _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "AudioDestinationNode");
  return com.user00.domjnate.util.Js.construct(_win, constructor, AudioDestinationNode.class);
}
}
