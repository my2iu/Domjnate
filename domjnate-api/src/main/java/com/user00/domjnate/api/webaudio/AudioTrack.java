package com.user00.domjnate.api.webaudio;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="AudioTrack")
public interface AudioTrack
{
@JsProperty(name="enabled")
boolean getEnabled();
@JsProperty(name="enabled")
void setEnabled(boolean val);
@JsProperty(name="id")
String getId();
@JsProperty(name="kind")
String getKind();
@JsProperty(name="kind")
void setKind(String val);
@JsProperty(name="label")
String getLabel();
@JsProperty(name="language")
String getLanguage();
@JsProperty(name="language")
void setLanguage(String val);
@JsProperty(name="sourceBuffer")
com.user00.domjnate.api.mse.SourceBuffer getSourceBuffer();
@JsOverlay
public static AudioTrack getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "AudioTrack", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", AudioTrack.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, AudioTrack val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "AudioTrack", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static AudioTrack _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "AudioTrack");
  return com.user00.domjnate.util.Js.construct(_win, constructor, AudioTrack.class);
}
}
