package com.user00.domjnate.api;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="Worklet")
public interface Worklet
{
@JsMethod(name="addModule")
Promise<Void> addModule(String moduleURL);
@JsMethod(name="addModule")
Promise<Void> addModule(String moduleURL, WorkletOptions options);
@JsOverlay
public static Worklet getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "Worklet", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", Worklet.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, Worklet val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "Worklet", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static Worklet _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "Worklet");
  return com.user00.domjnate.util.Js.construct(_win, constructor, Worklet.class);
}
}
