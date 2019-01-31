package com.user00.domjnate.api.webspeech;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="SpeechRecognitionError")
public interface SpeechRecognitionError extends com.user00.domjnate.api.dom.Event
{
@JsProperty(name="error")
String getError();
@JsProperty(name="message")
String getMessage();
@JsOverlay
public static SpeechRecognitionError getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "SpeechRecognitionError", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", SpeechRecognitionError.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, SpeechRecognitionError val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "SpeechRecognitionError", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static SpeechRecognitionError _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "SpeechRecognitionError");
  return com.user00.domjnate.util.Js.construct(_win, constructor, SpeechRecognitionError.class);
}
}
