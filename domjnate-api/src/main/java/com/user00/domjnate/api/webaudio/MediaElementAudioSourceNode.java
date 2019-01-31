package com.user00.domjnate.api.webaudio;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="MediaElementAudioSourceNode")
public interface MediaElementAudioSourceNode extends AudioNode
{
@JsProperty(name="mediaElement")
com.user00.domjnate.api.html.HTMLMediaElement getMediaElement();
@JsOverlay
public static MediaElementAudioSourceNode getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "MediaElementAudioSourceNode", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", MediaElementAudioSourceNode.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, MediaElementAudioSourceNode val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "MediaElementAudioSourceNode", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static MediaElementAudioSourceNode _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, AudioContext context, MediaElementAudioSourceOptions options) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "MediaElementAudioSourceNode");
  return com.user00.domjnate.util.Js.construct(_win, constructor, MediaElementAudioSourceNode.class, context, options);
}
}
