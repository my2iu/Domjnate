package com.user00.domjnate.api.webcrypto;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="RandomSource")
public interface RandomSource
{
@JsMethod(name="getRandomValues")
<T> T getRandomValues(T array);
@JsOverlay
public static RandomSource getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "RandomSource", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", RandomSource.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, RandomSource val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "RandomSource", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static RandomSource _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "RandomSource");
  return com.user00.domjnate.util.Js.construct(_win, constructor, RandomSource.class);
}
}
