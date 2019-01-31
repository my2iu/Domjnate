package com.user00.domjnate.api.webspeech;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="SpeechSynthesisErrorEvent")
public interface SpeechSynthesisErrorEvent extends SpeechSynthesisEvent
{
@JsProperty(name="error")
String getError();
@JsOverlay
public static SpeechSynthesisErrorEvent getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "SpeechSynthesisErrorEvent", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", SpeechSynthesisErrorEvent.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, SpeechSynthesisErrorEvent val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "SpeechSynthesisErrorEvent", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static SpeechSynthesisErrorEvent _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "SpeechSynthesisErrorEvent");
  return com.user00.domjnate.util.Js.construct(_win, constructor, SpeechSynthesisErrorEvent.class);
}
}
