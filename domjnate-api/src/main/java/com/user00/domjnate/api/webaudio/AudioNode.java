package com.user00.domjnate.api.webaudio;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="AudioNode")
public interface AudioNode extends com.user00.domjnate.api.dom.EventTarget
{
@JsProperty(name="channelCount")
double getChannelCount();
@JsProperty(name="channelCount")
void setChannelCount(double val);
@JsProperty(name="channelCountMode")
String getChannelCountMode();
@JsProperty(name="channelCountMode")
void setChannelCountMode(String val);
@JsProperty(name="channelInterpretation")
String getChannelInterpretation();
@JsProperty(name="channelInterpretation")
void setChannelInterpretation(String val);
@JsProperty(name="context")
BaseAudioContext getContext();
@JsProperty(name="numberOfInputs")
double getNumberOfInputs();
@JsProperty(name="numberOfOutputs")
double getNumberOfOutputs();
@JsMethod(name="connect")
AudioNode connect(AudioNode destinationNode);
@JsMethod(name="connect")
AudioNode connect(AudioNode destinationNode, double output);
@JsMethod(name="connect")
AudioNode connect(AudioNode destinationNode, double output, double input);
@JsMethod(name="connect")
void connect(AudioParam destinationParam);
@JsMethod(name="connect")
void connect(AudioParam destinationParam, double output);
@JsMethod(name="disconnect")
void disconnect();
@JsMethod(name="disconnect")
void disconnect(double output);
@JsMethod(name="disconnect")
void disconnect(AudioNode destinationNode);
@JsMethod(name="disconnect")
void disconnect(AudioNode destinationNode, double output);
@JsMethod(name="disconnect")
void disconnect(AudioNode destinationNode, double output, double input);
@JsMethod(name="disconnect")
void disconnect(AudioParam destinationParam);
@JsMethod(name="disconnect")
void disconnect(AudioParam destinationParam, double output);
@JsOverlay
public static AudioNode getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "AudioNode", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", AudioNode.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, AudioNode val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "AudioNode", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static AudioNode _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "AudioNode");
  return com.user00.domjnate.util.Js.construct(_win, constructor, AudioNode.class);
}
}
