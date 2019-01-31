package com.user00.domjnate.api.webspeech;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="SpeechRecognitionAlternative")
public interface SpeechRecognitionAlternative
{
@JsProperty(name="confidence")
double getConfidence();
@JsProperty(name="transcript")
String getTranscript();
@JsOverlay
public static SpeechRecognitionAlternative getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "SpeechRecognitionAlternative", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", SpeechRecognitionAlternative.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, SpeechRecognitionAlternative val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "SpeechRecognitionAlternative", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static SpeechRecognitionAlternative _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "SpeechRecognitionAlternative");
  return com.user00.domjnate.util.Js.construct(_win, constructor, SpeechRecognitionAlternative.class);
}
}
