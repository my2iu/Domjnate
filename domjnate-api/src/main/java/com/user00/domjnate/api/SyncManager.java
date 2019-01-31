package com.user00.domjnate.api;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="SyncManager")
public interface SyncManager
{
@JsMethod(name="getTags")
Promise<Array<String>> getTags();
@JsMethod(name="register")
Promise<Void> register(String tag);
@JsOverlay
public static SyncManager getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "SyncManager", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", SyncManager.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, SyncManager val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "SyncManager", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static SyncManager _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "SyncManager");
  return com.user00.domjnate.util.Js.construct(_win, constructor, SyncManager.class);
}
}
