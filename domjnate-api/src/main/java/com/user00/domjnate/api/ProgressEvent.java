package com.user00.domjnate.api;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="ProgressEvent")
public interface ProgressEvent extends com.user00.domjnate.api.dom.Event
{
@JsProperty(name="lengthComputable")
boolean getLengthComputable();
@JsProperty(name="loaded")
double getLoaded();
@JsProperty(name="total")
double getTotal();
@JsOverlay
public static ProgressEvent getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "ProgressEvent", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", ProgressEvent.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, ProgressEvent val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "ProgressEvent", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static ProgressEvent _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, String type) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "ProgressEvent");
  return com.user00.domjnate.util.Js.construct(_win, constructor, ProgressEvent.class, type);
}
@JsOverlay
public static ProgressEvent _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, String type, ProgressEventInit eventInitDict) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "ProgressEvent");
  return com.user00.domjnate.util.Js.construct(_win, constructor, ProgressEvent.class, type, eventInitDict);
}
}
