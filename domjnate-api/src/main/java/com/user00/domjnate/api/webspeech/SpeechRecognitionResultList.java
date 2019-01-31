package com.user00.domjnate.api.webspeech;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="SpeechRecognitionResultList")
public interface SpeechRecognitionResultList
{
@JsProperty(name="length")
double getLength();
@JsMethod(name="item")
SpeechRecognitionResult item(double index);
@JsOverlay
public default SpeechRecognitionResult get(double index) {
  return (SpeechRecognitionResult)com.user00.domjnate.util.Js.getIndex(this, index, SpeechRecognitionResult.class);
}
@JsOverlay
public default void set(double index, SpeechRecognitionResult val) {
  com.user00.domjnate.util.Js.setIndex(this, index, val);
}
@JsOverlay
public static SpeechRecognitionResultList getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "SpeechRecognitionResultList", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", SpeechRecognitionResultList.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, SpeechRecognitionResultList val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "SpeechRecognitionResultList", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static SpeechRecognitionResultList _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "SpeechRecognitionResultList");
  return com.user00.domjnate.util.Js.construct(_win, constructor, SpeechRecognitionResultList.class);
}
}
