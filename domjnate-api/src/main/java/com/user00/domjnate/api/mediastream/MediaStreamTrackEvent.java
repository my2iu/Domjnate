package com.user00.domjnate.api.mediastream;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="MediaStreamTrackEvent")
public interface MediaStreamTrackEvent extends com.user00.domjnate.api.dom.Event
{
@JsProperty(name="track")
MediaStreamTrack getTrack();
@JsOverlay
public static MediaStreamTrackEvent getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "MediaStreamTrackEvent", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", MediaStreamTrackEvent.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, MediaStreamTrackEvent val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "MediaStreamTrackEvent", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static MediaStreamTrackEvent _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, String typeArg) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "MediaStreamTrackEvent");
  return com.user00.domjnate.util.Js.construct(_win, constructor, MediaStreamTrackEvent.class, typeArg);
}
@JsOverlay
public static MediaStreamTrackEvent _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, String typeArg, MediaStreamTrackEventInit eventInitDict) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "MediaStreamTrackEvent");
  return com.user00.domjnate.util.Js.construct(_win, constructor, MediaStreamTrackEvent.class, typeArg, eventInitDict);
}
}
