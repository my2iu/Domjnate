package com.user00.domjnate.api.webspeech;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="SpeechSynthesisEvent")
public interface SpeechSynthesisEvent extends com.user00.domjnate.api.dom.Event
{
@JsProperty(name="charIndex")
double getCharIndex();
@JsProperty(name="elapsedTime")
double getElapsedTime();
@JsProperty(name="name")
String getName();
@JsProperty(name="utterance")
SpeechSynthesisUtterance getUtterance();
@JsOverlay
public static SpeechSynthesisEvent getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "SpeechSynthesisEvent", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", SpeechSynthesisEvent.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, SpeechSynthesisEvent val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "SpeechSynthesisEvent", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static SpeechSynthesisEvent _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "SpeechSynthesisEvent");
  return com.user00.domjnate.util.Js.construct(_win, constructor, SpeechSynthesisEvent.class);
}
}
