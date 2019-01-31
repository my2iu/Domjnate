package com.user00.domjnate.api.indexeddb;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="IDBVersionChangeEvent")
public interface IDBVersionChangeEvent extends com.user00.domjnate.api.dom.Event
{
@JsProperty(name="newVersion")
Double getNewVersion();
@JsProperty(name="oldVersion")
double getOldVersion();
@JsOverlay
public static IDBVersionChangeEvent getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "IDBVersionChangeEvent", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", IDBVersionChangeEvent.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, IDBVersionChangeEvent val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "IDBVersionChangeEvent", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static IDBVersionChangeEvent _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, String type) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "IDBVersionChangeEvent");
  return com.user00.domjnate.util.Js.construct(_win, constructor, IDBVersionChangeEvent.class, type);
}
@JsOverlay
public static IDBVersionChangeEvent _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, String type, IDBVersionChangeEventInit eventInitDict) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "IDBVersionChangeEvent");
  return com.user00.domjnate.util.Js.construct(_win, constructor, IDBVersionChangeEvent.class, type, eventInitDict);
}
}
