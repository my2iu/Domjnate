package com.user00.domjnate.api.webcrypto;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="Crypto")
public interface Crypto
{
@JsProperty(name="subtle")
SubtleCrypto getSubtle();
@JsMethod(name="getRandomValues")
<T> T getRandomValues(T array);
@JsOverlay
public static Crypto getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "Crypto", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", Crypto.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, Crypto val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "Crypto", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static Crypto _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "Crypto");
  return com.user00.domjnate.util.Js.construct(_win, constructor, Crypto.class);
}
}
