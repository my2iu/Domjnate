package com.user00.domjnate.api.webspeech;

import jsinterop.annotations.JsFunction;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="SpeechSynthesisUtterance")
public interface SpeechSynthesisUtterance extends com.user00.domjnate.api.dom.EventTarget
{
@JsProperty(name="lang")
String getLang();
@JsProperty(name="lang")
void setLang(String val);
@JsProperty(name="onboundary")
OnboundaryCallback getOnboundary();
@JsProperty(name="onboundary")
void setOnboundary(OnboundaryCallback val);
@JsProperty(name="onend")
OnendCallback getOnend();
@JsProperty(name="onend")
void setOnend(OnendCallback val);
@JsProperty(name="onerror")
OnerrorCallback getOnerror();
@JsProperty(name="onerror")
void setOnerror(OnerrorCallback val);
@JsProperty(name="onmark")
OnmarkCallback getOnmark();
@JsProperty(name="onmark")
void setOnmark(OnmarkCallback val);
@JsProperty(name="onpause")
OnpauseCallback getOnpause();
@JsProperty(name="onpause")
void setOnpause(OnpauseCallback val);
@JsProperty(name="onresume")
OnresumeCallback getOnresume();
@JsProperty(name="onresume")
void setOnresume(OnresumeCallback val);
@JsProperty(name="onstart")
OnstartCallback getOnstart();
@JsProperty(name="onstart")
void setOnstart(OnstartCallback val);
@JsProperty(name="pitch")
double getPitch();
@JsProperty(name="pitch")
void setPitch(double val);
@JsProperty(name="rate")
double getRate();
@JsProperty(name="rate")
void setRate(double val);
@JsProperty(name="text")
String getText();
@JsProperty(name="text")
void setText(String val);
@JsProperty(name="voice")
SpeechSynthesisVoice getVoice();
@JsProperty(name="voice")
void setVoice(SpeechSynthesisVoice val);
@JsProperty(name="volume")
double getVolume();
@JsProperty(name="volume")
void setVolume(double val);
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
java.lang.Object apply(SpeechSynthesisErrorEvent ev);
}
@JsFunction public static interface OnpauseCallback
{
java.lang.Object apply(SpeechSynthesisEvent ev);
}
@JsFunction public static interface OnstartCallback
{
java.lang.Object apply(SpeechSynthesisEvent ev);
}
@JsFunction public static interface OnboundaryCallback
{
java.lang.Object apply(SpeechSynthesisEvent ev);
}
@JsFunction public static interface OnendCallback
{
java.lang.Object apply(SpeechSynthesisEvent ev);
}
@JsFunction public static interface OnmarkCallback
{
java.lang.Object apply(SpeechSynthesisEvent ev);
}
@JsFunction public static interface OnresumeCallback
{
java.lang.Object apply(SpeechSynthesisEvent ev);
}
@JsOverlay
public static SpeechSynthesisUtterance getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "SpeechSynthesisUtterance", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", SpeechSynthesisUtterance.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, SpeechSynthesisUtterance val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "SpeechSynthesisUtterance", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static SpeechSynthesisUtterance _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "SpeechSynthesisUtterance");
  return com.user00.domjnate.util.Js.construct(_win, constructor, SpeechSynthesisUtterance.class);
}
@JsOverlay
public static SpeechSynthesisUtterance _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, String text) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "SpeechSynthesisUtterance");
  return com.user00.domjnate.util.Js.construct(_win, constructor, SpeechSynthesisUtterance.class, text);
}
}
