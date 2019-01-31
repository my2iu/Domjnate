package com.user00.domjnate.api.webspeech;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="SpeechGrammarList")
public interface SpeechGrammarList
{
@JsProperty(name="length")
double getLength();
@JsMethod(name="addFromString")
void addFromString(String string);
@JsMethod(name="addFromString")
void addFromString(String string, double weight);
@JsMethod(name="addFromURI")
void addFromURI(String src);
@JsMethod(name="addFromURI")
void addFromURI(String src, double weight);
@JsMethod(name="item")
SpeechGrammar item(double index);
@JsOverlay
public default SpeechGrammar get(double index) {
  return (SpeechGrammar)com.user00.domjnate.util.Js.getIndex(this, index, SpeechGrammar.class);
}
@JsOverlay
public default void set(double index, SpeechGrammar val) {
  com.user00.domjnate.util.Js.setIndex(this, index, val);
}
@JsOverlay
public static SpeechGrammarList getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "SpeechGrammarList", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", SpeechGrammarList.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, SpeechGrammarList val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "SpeechGrammarList", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static SpeechGrammarList _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "SpeechGrammarList");
  return com.user00.domjnate.util.Js.construct(_win, constructor, SpeechGrammarList.class);
}
}
