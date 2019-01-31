package com.user00.domjnate.api;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="StorageManager")
public interface StorageManager
{
@JsMethod(name="estimate")
Promise<StorageEstimate> estimate();
@JsMethod(name="persist")
Promise<Boolean> persist();
@JsMethod(name="persisted")
Promise<Boolean> persisted();
@JsOverlay
public static StorageManager getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "StorageManager", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", StorageManager.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, StorageManager val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "StorageManager", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static StorageManager _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "StorageManager");
  return com.user00.domjnate.util.Js.construct(_win, constructor, StorageManager.class);
}
}
