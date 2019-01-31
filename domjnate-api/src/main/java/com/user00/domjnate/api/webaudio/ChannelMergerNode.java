package com.user00.domjnate.api.webaudio;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="ChannelMergerNode")
public interface ChannelMergerNode extends AudioNode
{
@JsOverlay
public static ChannelMergerNode getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "ChannelMergerNode", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", ChannelMergerNode.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, ChannelMergerNode val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "ChannelMergerNode", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static ChannelMergerNode _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, BaseAudioContext context) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "ChannelMergerNode");
  return com.user00.domjnate.util.Js.construct(_win, constructor, ChannelMergerNode.class, context);
}
@JsOverlay
public static ChannelMergerNode _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, BaseAudioContext context, ChannelMergerOptions options) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "ChannelMergerNode");
  return com.user00.domjnate.util.Js.construct(_win, constructor, ChannelMergerNode.class, context, options);
}
}
