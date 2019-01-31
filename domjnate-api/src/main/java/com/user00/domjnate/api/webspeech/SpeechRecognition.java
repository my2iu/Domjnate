package com.user00.domjnate.api.webspeech;

import jsinterop.annotations.JsFunction;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="SpeechRecognition")
public interface SpeechRecognition extends com.user00.domjnate.api.dom.EventTarget
{
@JsProperty(name="continuous")
boolean getContinuous();
@JsProperty(name="continuous")
void setContinuous(boolean val);
@JsProperty(name="grammars")
SpeechGrammarList getGrammars();
@JsProperty(name="grammars")
void setGrammars(SpeechGrammarList val);
@JsProperty(name="interimResults")
boolean getInterimResults();
@JsProperty(name="interimResults")
void setInterimResults(boolean val);
@JsProperty(name="lang")
String getLang();
@JsProperty(name="lang")
void setLang(String val);
@JsProperty(name="maxAlternatives")
double getMaxAlternatives();
@JsProperty(name="maxAlternatives")
void setMaxAlternatives(double val);
@JsProperty(name="onaudioend")
OnaudioendCallback getOnaudioend();
@JsProperty(name="onaudioend")
void setOnaudioend(OnaudioendCallback val);
@JsProperty(name="onaudiostart")
OnaudiostartCallback getOnaudiostart();
@JsProperty(name="onaudiostart")
void setOnaudiostart(OnaudiostartCallback val);
@JsProperty(name="onend")
OnendCallback getOnend();
@JsProperty(name="onend")
void setOnend(OnendCallback val);
@JsProperty(name="onerror")
OnerrorCallback getOnerror();
@JsProperty(name="onerror")
void setOnerror(OnerrorCallback val);
@JsProperty(name="onnomatch")
OnnomatchCallback getOnnomatch();
@JsProperty(name="onnomatch")
void setOnnomatch(OnnomatchCallback val);
@JsProperty(name="onresult")
OnresultCallback getOnresult();
@JsProperty(name="onresult")
void setOnresult(OnresultCallback val);
@JsProperty(name="onsoundend")
OnsoundendCallback getOnsoundend();
@JsProperty(name="onsoundend")
void setOnsoundend(OnsoundendCallback val);
@JsProperty(name="onsoundstart")
OnsoundstartCallback getOnsoundstart();
@JsProperty(name="onsoundstart")
void setOnsoundstart(OnsoundstartCallback val);
@JsProperty(name="onspeechend")
OnspeechendCallback getOnspeechend();
@JsProperty(name="onspeechend")
void setOnspeechend(OnspeechendCallback val);
@JsProperty(name="onspeechstart")
OnspeechstartCallback getOnspeechstart();
@JsProperty(name="onspeechstart")
void setOnspeechstart(OnspeechstartCallback val);
@JsProperty(name="onstart")
OnstartCallback getOnstart();
@JsProperty(name="onstart")
void setOnstart(OnstartCallback val);
@JsProperty(name="serviceURI")
String getServiceURI();
@JsProperty(name="serviceURI")
void setServiceURI(String val);
@JsMethod(name="abort")
void abort();
@JsMethod(name="start")
void start();
@JsMethod(name="stop")
void stop();
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
@JsFunction public static interface OnerrorCallback
{
java.lang.Object apply(SpeechRecognitionError ev);
}
@JsFunction public static interface OnaudiostartCallback
{
java.lang.Object apply(com.user00.domjnate.api.dom.Event ev);
}
@JsFunction public static interface OnnomatchCallback
{
java.lang.Object apply(SpeechRecognitionEvent ev);
}
@JsFunction public static interface OnsoundendCallback
{
java.lang.Object apply(com.user00.domjnate.api.dom.Event ev);
}
@JsFunction public static interface OnresultCallback
{
java.lang.Object apply(SpeechRecognitionEvent ev);
}
@JsFunction public static interface OnaudioendCallback
{
java.lang.Object apply(com.user00.domjnate.api.dom.Event ev);
}
@JsFunction public static interface OnspeechendCallback
{
java.lang.Object apply(com.user00.domjnate.api.dom.Event ev);
}
@JsFunction public static interface OnspeechstartCallback
{
java.lang.Object apply(com.user00.domjnate.api.dom.Event ev);
}
@JsFunction public static interface OnstartCallback
{
java.lang.Object apply(com.user00.domjnate.api.dom.Event ev);
}
@JsFunction public static interface OnsoundstartCallback
{
java.lang.Object apply(com.user00.domjnate.api.dom.Event ev);
}
@JsFunction public static interface OnendCallback
{
java.lang.Object apply(com.user00.domjnate.api.dom.Event ev);
}
@JsOverlay
public static SpeechRecognition getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "SpeechRecognition", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", SpeechRecognition.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, SpeechRecognition val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "SpeechRecognition", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static SpeechRecognition _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "SpeechRecognition");
  return com.user00.domjnate.util.Js.construct(_win, constructor, SpeechRecognition.class);
}
}
