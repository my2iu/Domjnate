package com.user00.domjnate.api.webaudio;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="ConvolverNode")
public interface ConvolverNode extends AudioNode
{
@JsProperty(name="buffer")
AudioBuffer getBuffer();
@JsProperty(name="buffer")
void setBuffer(AudioBuffer val);
@JsProperty(name="normalize")
boolean getNormalize();
@JsProperty(name="normalize")
void setNormalize(boolean val);
@JsOverlay
public static ConvolverNode getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "ConvolverNode", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", ConvolverNode.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, ConvolverNode val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "ConvolverNode", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static ConvolverNode _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, BaseAudioContext context) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "ConvolverNode");
  return com.user00.domjnate.util.Js.construct(_win, constructor, ConvolverNode.class, context);
}
@JsOverlay
public static ConvolverNode _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, BaseAudioContext context, ConvolverOptions options) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "ConvolverNode");
  return com.user00.domjnate.util.Js.construct(_win, constructor, ConvolverNode.class, context, options);
}
}
