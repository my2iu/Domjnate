package com.user00.domjnate.api;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="NavigationPreloadManager")
public interface NavigationPreloadManager
{
@JsMethod(name="disable")
Promise<Void> disable();
@JsMethod(name="enable")
Promise<Void> enable();
@JsMethod(name="getState")
Promise<NavigationPreloadState> getState();
@JsMethod(name="setHeaderValue")
Promise<Void> setHeaderValue(String value);
@JsOverlay
public static NavigationPreloadManager getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "NavigationPreloadManager", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", NavigationPreloadManager.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, NavigationPreloadManager val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "NavigationPreloadManager", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static NavigationPreloadManager _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "NavigationPreloadManager");
  return com.user00.domjnate.util.Js.construct(_win, constructor, NavigationPreloadManager.class);
}
}
