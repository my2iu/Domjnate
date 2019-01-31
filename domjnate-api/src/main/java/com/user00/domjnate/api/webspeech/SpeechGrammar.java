package com.user00.domjnate.api.webspeech;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="SpeechGrammar")
public interface SpeechGrammar
{
@JsProperty(name="src")
String getSrc();
@JsProperty(name="src")
void setSrc(String val);
@JsProperty(name="weight")
double getWeight();
@JsProperty(name="weight")
void setWeight(double val);
@JsOverlay
public static SpeechGrammar getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "SpeechGrammar", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", SpeechGrammar.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, SpeechGrammar val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "SpeechGrammar", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static SpeechGrammar _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "SpeechGrammar");
  return com.user00.domjnate.util.Js.construct(_win, constructor, SpeechGrammar.class);
}
}
