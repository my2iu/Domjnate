package com.user00.domjnate.api.webaudio;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="OfflineAudioCompletionEvent")
public interface OfflineAudioCompletionEvent extends com.user00.domjnate.api.dom.Event
{
@JsProperty(name="renderedBuffer")
AudioBuffer getRenderedBuffer();
@JsOverlay
public static OfflineAudioCompletionEvent getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "OfflineAudioCompletionEvent", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", OfflineAudioCompletionEvent.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, OfflineAudioCompletionEvent val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "OfflineAudioCompletionEvent", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static OfflineAudioCompletionEvent _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, String type, OfflineAudioCompletionEventInit eventInitDict) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "OfflineAudioCompletionEvent");
  return com.user00.domjnate.util.Js.construct(_win, constructor, OfflineAudioCompletionEvent.class, type, eventInitDict);
}
}
