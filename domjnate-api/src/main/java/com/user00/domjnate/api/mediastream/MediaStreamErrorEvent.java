package com.user00.domjnate.api.mediastream;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="MediaStreamErrorEvent")
public interface MediaStreamErrorEvent extends com.user00.domjnate.api.dom.Event
{
@JsProperty(name="error")
MediaStreamError getError();
@JsOverlay
public static MediaStreamErrorEvent getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "MediaStreamErrorEvent", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", MediaStreamErrorEvent.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, MediaStreamErrorEvent val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "MediaStreamErrorEvent", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static MediaStreamErrorEvent _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, String typeArg) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "MediaStreamErrorEvent");
  return com.user00.domjnate.util.Js.construct(_win, constructor, MediaStreamErrorEvent.class, typeArg);
}
@JsOverlay
public static MediaStreamErrorEvent _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, String typeArg, MediaStreamErrorEventInit eventInitDict) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "MediaStreamErrorEvent");
  return com.user00.domjnate.util.Js.construct(_win, constructor, MediaStreamErrorEvent.class, typeArg, eventInitDict);
}
}
