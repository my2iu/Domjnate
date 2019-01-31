package com.user00.domjnate.api.webaudio;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="StereoPannerNode")
public interface StereoPannerNode extends AudioNode
{
@JsProperty(name="pan")
AudioParam getPan();
@JsOverlay
public static StereoPannerNode getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "StereoPannerNode", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", StereoPannerNode.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, StereoPannerNode val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "StereoPannerNode", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static StereoPannerNode _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, BaseAudioContext context) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "StereoPannerNode");
  return com.user00.domjnate.util.Js.construct(_win, constructor, StereoPannerNode.class, context);
}
@JsOverlay
public static StereoPannerNode _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, BaseAudioContext context, StereoPannerOptions options) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "StereoPannerNode");
  return com.user00.domjnate.util.Js.construct(_win, constructor, StereoPannerNode.class, context, options);
}
}
