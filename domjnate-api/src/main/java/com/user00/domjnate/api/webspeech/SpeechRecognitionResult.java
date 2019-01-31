package com.user00.domjnate.api.webspeech;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="SpeechRecognitionResult")
public interface SpeechRecognitionResult
{
@JsProperty(name="isFinal")
boolean getIsFinal();
@JsProperty(name="length")
double getLength();
@JsMethod(name="item")
SpeechRecognitionAlternative item(double index);
@JsOverlay
public default SpeechRecognitionAlternative get(double index) {
  return (SpeechRecognitionAlternative)com.user00.domjnate.util.Js.getIndex(this, index, SpeechRecognitionAlternative.class);
}
@JsOverlay
public default void set(double index, SpeechRecognitionAlternative val) {
  com.user00.domjnate.util.Js.setIndex(this, index, val);
}
@JsOverlay
public static SpeechRecognitionResult getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "SpeechRecognitionResult", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", SpeechRecognitionResult.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, SpeechRecognitionResult val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "SpeechRecognitionResult", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static SpeechRecognitionResult _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "SpeechRecognitionResult");
  return com.user00.domjnate.util.Js.construct(_win, constructor, SpeechRecognitionResult.class);
}
}
