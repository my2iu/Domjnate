package com.user00.domjnate.api;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="PushSubscriptionOptions")
public interface PushSubscriptionOptions
{
@JsProperty(name="applicationServerKey")
ArrayBuffer getApplicationServerKey();
@JsProperty(name="userVisibleOnly")
boolean getUserVisibleOnly();
@JsOverlay
public static PushSubscriptionOptions getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "PushSubscriptionOptions", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", PushSubscriptionOptions.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, PushSubscriptionOptions val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "PushSubscriptionOptions", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static PushSubscriptionOptions _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "PushSubscriptionOptions");
  return com.user00.domjnate.util.Js.construct(_win, constructor, PushSubscriptionOptions.class);
}
}
