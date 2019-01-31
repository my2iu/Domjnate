package com.user00.domjnate.api;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="DragEvent")
public interface DragEvent extends MouseEvent
{
@JsProperty(name="dataTransfer")
DataTransfer getDataTransfer();
@JsOverlay
public static DragEvent getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "DragEvent", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", DragEvent.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, DragEvent val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "DragEvent", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static DragEvent _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, String type) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "DragEvent");
  return com.user00.domjnate.util.Js.construct(_win, constructor, DragEvent.class, type);
}
@JsOverlay
public static DragEvent _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, String type, DragEventInit eventInitDict) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "DragEvent");
  return com.user00.domjnate.util.Js.construct(_win, constructor, DragEvent.class, type, eventInitDict);
}
}
