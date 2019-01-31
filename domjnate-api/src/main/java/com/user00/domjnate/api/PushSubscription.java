package com.user00.domjnate.api;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="PushSubscription")
public interface PushSubscription
{
@JsProperty(name="endpoint")
String getEndpoint();
@JsProperty(name="expirationTime")
Double getExpirationTime();
@JsProperty(name="options")
PushSubscriptionOptions getOptions();
@JsMethod(name="getKey")
ArrayBuffer getKey(String name);
@JsMethod(name="toJSON")
PushSubscriptionJSON toJSON();
@JsMethod(name="unsubscribe")
Promise<Boolean> unsubscribe();
@JsOverlay
public static PushSubscription getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "PushSubscription", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", PushSubscription.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, PushSubscription val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "PushSubscription", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static PushSubscription _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "PushSubscription");
  return com.user00.domjnate.util.Js.construct(_win, constructor, PushSubscription.class);
}
}
