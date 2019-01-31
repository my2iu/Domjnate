package com.user00.domjnate.api.webaudio;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="ChannelSplitterNode")
public interface ChannelSplitterNode extends AudioNode
{
@JsOverlay
public static ChannelSplitterNode getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "ChannelSplitterNode", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", ChannelSplitterNode.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, ChannelSplitterNode val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "ChannelSplitterNode", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static ChannelSplitterNode _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, BaseAudioContext context) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "ChannelSplitterNode");
  return com.user00.domjnate.util.Js.construct(_win, constructor, ChannelSplitterNode.class, context);
}
@JsOverlay
public static ChannelSplitterNode _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, BaseAudioContext context, ChannelSplitterOptions options) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "ChannelSplitterNode");
  return com.user00.domjnate.util.Js.construct(_win, constructor, ChannelSplitterNode.class, context, options);
}
}
