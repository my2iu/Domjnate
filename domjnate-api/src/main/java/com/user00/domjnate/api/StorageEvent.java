package com.user00.domjnate.api;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="StorageEvent")
public interface StorageEvent extends com.user00.domjnate.api.dom.Event
{
@JsProperty(name="key")
String getKey();
@JsProperty(name="newValue")
String getNewValue();
@JsProperty(name="oldValue")
String getOldValue();
@JsProperty(name="storageArea")
Storage getStorageArea();
@JsProperty(name="url")
String getUrl();
@JsOverlay
public static StorageEvent getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "StorageEvent", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", StorageEvent.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, StorageEvent val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "StorageEvent", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static StorageEvent _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, String type) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "StorageEvent");
  return com.user00.domjnate.util.Js.construct(_win, constructor, StorageEvent.class, type);
}
@JsOverlay
public static StorageEvent _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, String type, StorageEventInit eventInitDict) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "StorageEvent");
  return com.user00.domjnate.util.Js.construct(_win, constructor, StorageEvent.class, type, eventInitDict);
}
}
