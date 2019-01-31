package com.user00.domjnate.api.webaudio;

import jsinterop.annotations.JsFunction;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="BaseAudioContext")
public interface BaseAudioContext extends com.user00.domjnate.api.dom.EventTarget
{
@JsProperty(name="audioWorklet")
AudioWorklet getAudioWorklet();
@JsProperty(name="currentTime")
double getCurrentTime();
@JsProperty(name="destination")
AudioDestinationNode getDestination();
@JsProperty(name="listener")
AudioListener getListener();
@JsProperty(name="onstatechange")
OnstatechangeCallback getOnstatechange();
@JsProperty(name="onstatechange")
void setOnstatechange(OnstatechangeCallback val);
@JsProperty(name="sampleRate")
double getSampleRate();
@JsProperty(name="state")
String getState();
@JsMethod(name="createAnalyser")
AnalyserNode createAnalyser();
@JsMethod(name="createBiquadFilter")
BiquadFilterNode createBiquadFilter();
@JsMethod(name="createBuffer")
AudioBuffer createBuffer(double numberOfChannels, double length, double sampleRate);
@JsMethod(name="createBufferSource")
AudioBufferSourceNode createBufferSource();
@JsMethod(name="createChannelMerger")
ChannelMergerNode createChannelMerger();
@JsMethod(name="createChannelMerger")
ChannelMergerNode createChannelMerger(double numberOfInputs);
@JsMethod(name="createChannelSplitter")
ChannelSplitterNode createChannelSplitter();
@JsMethod(name="createChannelSplitter")
ChannelSplitterNode createChannelSplitter(double numberOfOutputs);
@JsMethod(name="createConstantSource")
ConstantSourceNode createConstantSource();
@JsMethod(name="createConvolver")
ConvolverNode createConvolver();
@JsMethod(name="createDelay")
DelayNode createDelay();
@JsMethod(name="createDelay")
DelayNode createDelay(double maxDelayTime);
@JsMethod(name="createDynamicsCompressor")
DynamicsCompressorNode createDynamicsCompressor();
@JsMethod(name="createGain")
GainNode createGain();
@JsMethod(name="createIIRFilter")
IIRFilterNode createIIRFilter(com.user00.domjnate.api.Array<Double> feedforward, com.user00.domjnate.api.Array<Double> feedback);
@JsMethod(name="createOscillator")
OscillatorNode createOscillator();
@JsMethod(name="createPanner")
PannerNode createPanner();
@JsMethod(name="createPeriodicWave")
PeriodicWave createPeriodicWave(com.user00.domjnate.api.Float32Array real, com.user00.domjnate.api.Float32Array imag);
@JsMethod(name="createPeriodicWave")
PeriodicWave createPeriodicWave(com.user00.domjnate.api.Array<Double> real, com.user00.domjnate.api.Float32Array imag);
@JsMethod(name="createPeriodicWave")
PeriodicWave createPeriodicWave(com.user00.domjnate.api.Float32Array real, com.user00.domjnate.api.Array<Double> imag);
@JsMethod(name="createPeriodicWave")
PeriodicWave createPeriodicWave(com.user00.domjnate.api.Array<Double> real, com.user00.domjnate.api.Array<Double> imag);
@JsMethod(name="createPeriodicWave")
PeriodicWave createPeriodicWave(com.user00.domjnate.api.Float32Array real, com.user00.domjnate.api.Float32Array imag, PeriodicWaveConstraints constraints);
@JsMethod(name="createPeriodicWave")
PeriodicWave createPeriodicWave(com.user00.domjnate.api.Array<Double> real, com.user00.domjnate.api.Float32Array imag, PeriodicWaveConstraints constraints);
@JsMethod(name="createPeriodicWave")
PeriodicWave createPeriodicWave(com.user00.domjnate.api.Float32Array real, com.user00.domjnate.api.Array<Double> imag, PeriodicWaveConstraints constraints);
@JsMethod(name="createPeriodicWave")
PeriodicWave createPeriodicWave(com.user00.domjnate.api.Array<Double> real, com.user00.domjnate.api.Array<Double> imag, PeriodicWaveConstraints constraints);
@JsMethod(name="createScriptProcessor")
com.user00.domjnate.api.ScriptProcessorNode createScriptProcessor();
@JsMethod(name="createScriptProcessor")
com.user00.domjnate.api.ScriptProcessorNode createScriptProcessor(double bufferSize);
@JsMethod(name="createScriptProcessor")
com.user00.domjnate.api.ScriptProcessorNode createScriptProcessor(double bufferSize, double numberOfInputChannels);
@JsMethod(name="createScriptProcessor")
com.user00.domjnate.api.ScriptProcessorNode createScriptProcessor(double bufferSize, double numberOfInputChannels, double numberOfOutputChannels);
@JsMethod(name="createStereoPanner")
StereoPannerNode createStereoPanner();
@JsMethod(name="createWaveShaper")
WaveShaperNode createWaveShaper();
@JsMethod(name="decodeAudioData")
com.user00.domjnate.api.Promise<AudioBuffer> decodeAudioData(com.user00.domjnate.api.ArrayBuffer audioData);
@JsMethod(name="decodeAudioData")
com.user00.domjnate.api.Promise<AudioBuffer> decodeAudioData(com.user00.domjnate.api.ArrayBuffer audioData, com.user00.domjnate.api.DecodeSuccessCallback successCallback);
@JsMethod(name="decodeAudioData")
com.user00.domjnate.api.Promise<AudioBuffer> decodeAudioData(com.user00.domjnate.api.ArrayBuffer audioData, com.user00.domjnate.api.DecodeSuccessCallback successCallback, com.user00.domjnate.api.DecodeErrorCallback errorCallback);
@JsMethod(name="resume")
com.user00.domjnate.api.Promise<Void> resume();
// TODO: Suppressing generic keyof type parameter for addEventListener
@JsMethod(name="addEventListener")
void addEventListener(String type, com.user00.domjnate.api.EventListener listener);
@JsMethod(name="addEventListener")
void addEventListener(String type, com.user00.domjnate.api.EventListener listener, com.user00.domjnate.api.AddEventListenerOptions options);
@JsMethod(name="addEventListener")
void addEventListener(String type, com.user00.domjnate.api.EventListener listener, boolean options);
// TODO: Suppressing generic keyof type parameter for removeEventListener
@JsMethod(name="removeEventListener")
void removeEventListener(String type, com.user00.domjnate.api.EventListener listener);
@JsMethod(name="removeEventListener")
void removeEventListener(String type, com.user00.domjnate.api.EventListener listener, com.user00.domjnate.api.EventListenerOptions options);
@JsMethod(name="removeEventListener")
void removeEventListener(String type, com.user00.domjnate.api.EventListener listener, boolean options);
@JsFunction public static interface OnstatechangeCallback
{
java.lang.Object apply(com.user00.domjnate.api.dom.Event ev);
}
@JsOverlay
public static BaseAudioContext getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "BaseAudioContext", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", BaseAudioContext.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, BaseAudioContext val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "BaseAudioContext", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static BaseAudioContext _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "BaseAudioContext");
  return com.user00.domjnate.util.Js.construct(_win, constructor, BaseAudioContext.class);
}
}
