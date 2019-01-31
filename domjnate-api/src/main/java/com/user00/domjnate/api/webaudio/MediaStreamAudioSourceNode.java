package com.user00.domjnate.api.webaudio;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="MediaStreamAudioSourceNode")
public interface MediaStreamAudioSourceNode extends AudioNode
{
@JsProperty(name="mediaStream")
com.user00.domjnate.api.mediastream.MediaStream getMediaStream();
@JsOverlay
public static MediaStreamAudioSourceNode getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "MediaStreamAudioSourceNode", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", MediaStreamAudioSourceNode.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, MediaStreamAudioSourceNode val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "MediaStreamAudioSourceNode", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static MediaStreamAudioSourceNode _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, AudioContext context, MediaStreamAudioSourceOptions options) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "MediaStreamAudioSourceNode");
  return com.user00.domjnate.util.Js.construct(_win, constructor, MediaStreamAudioSourceNode.class, context, options);
}
}
