package com.user00.domjnate.api.webspeech;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="SpeechSynthesisVoice")
public interface SpeechSynthesisVoice
{
@JsProperty(name="default")
boolean getDefault();
@JsProperty(name="lang")
String getLang();
@JsProperty(name="localService")
boolean getLocalService();
@JsProperty(name="name")
String getName();
@JsProperty(name="voiceURI")
String getVoiceURI();
@JsOverlay
public static SpeechSynthesisVoice getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "SpeechSynthesisVoice", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", SpeechSynthesisVoice.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, SpeechSynthesisVoice val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "SpeechSynthesisVoice", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static SpeechSynthesisVoice _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "SpeechSynthesisVoice");
  return com.user00.domjnate.util.Js.construct(_win, constructor, SpeechSynthesisVoice.class);
}
}
