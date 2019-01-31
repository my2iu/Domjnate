package com.user00.domjnate.api.mediastream;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="MediaStreamEvent")
public interface MediaStreamEvent extends com.user00.domjnate.api.dom.Event
{
@JsProperty(name="stream")
MediaStream getStream();
@JsOverlay
public static MediaStreamEvent getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "MediaStreamEvent", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", MediaStreamEvent.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, MediaStreamEvent val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "MediaStreamEvent", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static MediaStreamEvent _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, String type, MediaStreamEventInit eventInitDict) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "MediaStreamEvent");
  return com.user00.domjnate.util.Js.construct(_win, constructor, MediaStreamEvent.class, type, eventInitDict);
}
}
