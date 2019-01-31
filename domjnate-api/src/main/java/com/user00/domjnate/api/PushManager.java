package com.user00.domjnate.api;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="PushManager")
public interface PushManager
{
@JsMethod(name="getSubscription")
Promise<PushSubscription> getSubscription();
@JsMethod(name="permissionState")
Promise<String> permissionState();
@JsMethod(name="permissionState")
Promise<String> permissionState(PushSubscriptionOptionsInit options);
@JsMethod(name="subscribe")
Promise<PushSubscription> subscribe();
@JsMethod(name="subscribe")
Promise<PushSubscription> subscribe(PushSubscriptionOptionsInit options);
@JsOverlay
public static PushManager getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "PushManager", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", PushManager.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, PushManager val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "PushManager", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static ReadonlyArray<String> getSupportedContentEncodings(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "PushManager", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "supportedContentEncodings", ReadonlyArray.class);
}
@JsOverlay
public static PushManager _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "PushManager");
  return com.user00.domjnate.util.Js.construct(_win, constructor, PushManager.class);
}
}
