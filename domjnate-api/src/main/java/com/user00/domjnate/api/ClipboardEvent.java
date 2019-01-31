package com.user00.domjnate.api;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="ClipboardEvent")
public interface ClipboardEvent extends com.user00.domjnate.api.dom.Event
{
@JsProperty(name="clipboardData")
DataTransfer getClipboardData();
@JsOverlay
public static ClipboardEvent getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "ClipboardEvent", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", ClipboardEvent.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, ClipboardEvent val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "ClipboardEvent", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static ClipboardEvent _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, String type) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "ClipboardEvent");
  return com.user00.domjnate.util.Js.construct(_win, constructor, ClipboardEvent.class, type);
}
@JsOverlay
public static ClipboardEvent _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, String type, ClipboardEventInit eventInitDict) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "ClipboardEvent");
  return com.user00.domjnate.util.Js.construct(_win, constructor, ClipboardEvent.class, type, eventInitDict);
}
}
