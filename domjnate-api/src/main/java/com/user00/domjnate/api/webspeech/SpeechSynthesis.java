package com.user00.domjnate.api.webspeech;

import jsinterop.annotations.JsFunction;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="SpeechSynthesis")
public interface SpeechSynthesis extends com.user00.domjnate.api.dom.EventTarget
{
@JsProperty(name="onvoiceschanged")
OnvoiceschangedCallback getOnvoiceschanged();
@JsProperty(name="onvoiceschanged")
void setOnvoiceschanged(OnvoiceschangedCallback val);
@JsProperty(name="paused")
boolean getPaused();
@JsProperty(name="pending")
boolean getPending();
@JsProperty(name="speaking")
boolean getSpeaking();
@JsMethod(name="cancel")
void cancel();
@JsMethod(name="getVoices")
com.user00.domjnate.api.Array<SpeechSynthesisVoice> getVoices();
@JsMethod(name="pause")
void pause();
@JsMethod(name="resume")
void resume();
@JsMethod(name="speak")
void speak(SpeechSynthesisUtterance utterance);
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
@JsFunction public static interface OnvoiceschangedCallback
{
java.lang.Object apply(com.user00.domjnate.api.dom.Event ev);
}
@JsOverlay
public static SpeechSynthesis getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "SpeechSynthesis", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", SpeechSynthesis.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, SpeechSynthesis val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "SpeechSynthesis", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static SpeechSynthesis _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "SpeechSynthesis");
  return com.user00.domjnate.util.Js.construct(_win, constructor, SpeechSynthesis.class);
}
}
