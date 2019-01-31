package com.user00.domjnate.api.webaudio;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="MediaStreamAudioDestinationNode")
public interface MediaStreamAudioDestinationNode extends AudioNode
{
@JsProperty(name="stream")
com.user00.domjnate.api.mediastream.MediaStream getStream();
@JsOverlay
public static MediaStreamAudioDestinationNode getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "MediaStreamAudioDestinationNode", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", MediaStreamAudioDestinationNode.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, MediaStreamAudioDestinationNode val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "MediaStreamAudioDestinationNode", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static MediaStreamAudioDestinationNode _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, AudioContext context) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "MediaStreamAudioDestinationNode");
  return com.user00.domjnate.util.Js.construct(_win, constructor, MediaStreamAudioDestinationNode.class, context);
}
@JsOverlay
public static MediaStreamAudioDestinationNode _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, AudioContext context, AudioNodeOptions options) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "MediaStreamAudioDestinationNode");
  return com.user00.domjnate.util.Js.construct(_win, constructor, MediaStreamAudioDestinationNode.class, context, options);
}
}
