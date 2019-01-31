package com.user00.domjnate.api.webspeech;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="SpeechRecognitionEvent")
public interface SpeechRecognitionEvent extends com.user00.domjnate.api.dom.Event
{
@JsProperty(name="emma")
com.user00.domjnate.api.dom.Document getEmma();
@JsProperty(name="interpretation")
java.lang.Object getInterpretation();
@JsProperty(name="resultIndex")
double getResultIndex();
@JsProperty(name="results")
SpeechRecognitionResultList getResults();
@JsOverlay
public static SpeechRecognitionEvent getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "SpeechRecognitionEvent", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", SpeechRecognitionEvent.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, SpeechRecognitionEvent val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "SpeechRecognitionEvent", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static SpeechRecognitionEvent _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "SpeechRecognitionEvent");
  return com.user00.domjnate.util.Js.construct(_win, constructor, SpeechRecognitionEvent.class);
}
}
