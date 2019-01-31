package com.user00.domjnate.api;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="AbortController")
public interface AbortController
{
@JsProperty(name="signal")
AbortSignal getSignal();
@JsMethod(name="abort")
void abort();
@JsOverlay
public static AbortController getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "AbortController", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", AbortController.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, AbortController val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "AbortController", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static AbortController _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "AbortController");
  return com.user00.domjnate.util.Js.construct(_win, constructor, AbortController.class);
}
}
