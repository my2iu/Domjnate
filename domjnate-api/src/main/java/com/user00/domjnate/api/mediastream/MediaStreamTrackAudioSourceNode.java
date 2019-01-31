package com.user00.domjnate.api.mediastream;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="MediaStreamTrackAudioSourceNode")
public interface MediaStreamTrackAudioSourceNode extends com.user00.domjnate.api.webaudio.AudioNode
{
@JsOverlay
public static MediaStreamTrackAudioSourceNode getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "MediaStreamTrackAudioSourceNode", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", MediaStreamTrackAudioSourceNode.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, MediaStreamTrackAudioSourceNode val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "MediaStreamTrackAudioSourceNode", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static MediaStreamTrackAudioSourceNode _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, com.user00.domjnate.api.webaudio.AudioContext context, MediaStreamTrackAudioSourceOptions options) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "MediaStreamTrackAudioSourceNode");
  return com.user00.domjnate.util.Js.construct(_win, constructor, MediaStreamTrackAudioSourceNode.class, context, options);
}
}
