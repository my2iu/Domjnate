package com.user00.domjnate.api;

import jsinterop.annotations.JsFunction;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="ScriptProcessorNode")
public interface ScriptProcessorNode extends com.user00.domjnate.api.webaudio.AudioNode
{
@JsProperty(name="bufferSize")
double getBufferSize();
@JsProperty(name="onaudioprocess")
OnaudioprocessCallback getOnaudioprocess();
@JsProperty(name="onaudioprocess")
void setOnaudioprocess(OnaudioprocessCallback val);
// TODO: Suppressing generic keyof type parameter for addEventListener
@JsMethod(name="addEventListener")
void addEventListener(String type, EventListener listener);
@JsMethod(name="addEventListener")
void addEventListener(String type, EventListener listener, AddEventListenerOptions options);
@JsMethod(name="addEventListener")
void addEventListener(String type, EventListener listener, boolean options);
// TODO: Suppressing generic keyof type parameter for removeEventListener
@JsMethod(name="removeEventListener")
void removeEventListener(String type, EventListener listener);
@JsMethod(name="removeEventListener")
void removeEventListener(String type, EventListener listener, EventListenerOptions options);
@JsMethod(name="removeEventListener")
void removeEventListener(String type, EventListener listener, boolean options);
@JsFunction public static interface OnaudioprocessCallback
{
java.lang.Object apply(com.user00.domjnate.api.webaudio.AudioProcessingEvent ev);
}
@JsOverlay
public static ScriptProcessorNode getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "ScriptProcessorNode", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", ScriptProcessorNode.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, ScriptProcessorNode val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "ScriptProcessorNode", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static ScriptProcessorNode _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "ScriptProcessorNode");
  return com.user00.domjnate.util.Js.construct(_win, constructor, ScriptProcessorNode.class);
}
}
