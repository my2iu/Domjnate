package com.user00.domjnate.api;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="PromiseRejectionEvent")
public interface PromiseRejectionEvent extends com.user00.domjnate.api.dom.Event
{
@JsProperty(name="promise")
Promise<java.lang.Object> getPromise();
@JsProperty(name="reason")
java.lang.Object getReason();
@JsOverlay
public static PromiseRejectionEvent getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "PromiseRejectionEvent", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", PromiseRejectionEvent.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, PromiseRejectionEvent val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "PromiseRejectionEvent", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static PromiseRejectionEvent _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, String type, PromiseRejectionEventInit eventInitDict) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "PromiseRejectionEvent");
  return com.user00.domjnate.util.Js.construct(_win, constructor, PromiseRejectionEvent.class, type, eventInitDict);
}
}
