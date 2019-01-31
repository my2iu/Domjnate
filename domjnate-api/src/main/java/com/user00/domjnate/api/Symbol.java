package com.user00.domjnate.api;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="Symbol")
public interface Symbol
{
@JsMethod(name="toString")
String toString();
@JsMethod(name="valueOf")
com.user00.domjnate.api.Symbol valueOf();
@JsOverlay
public static Symbol getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "Symbol", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", Symbol.class);
}
@JsOverlay
public static com.user00.domjnate.api.Symbol _for(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, String key) {
  return com.user00.domjnate.util.Js.callStaticMethod(_win, "Symbol", "for", com.user00.domjnate.api.Symbol.class, key);
}
@JsOverlay
public static java.lang.Object keyFor(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, com.user00.domjnate.api.Symbol sym) {
  return com.user00.domjnate.util.Js.callStaticMethod(_win, "Symbol", "keyFor", java.lang.Object.class, sym);
}
@JsOverlay
public static com.user00.domjnate.api.Symbol call(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  return com.user00.domjnate.util.Js.callMethod(_win, "Symbol", com.user00.domjnate.api.Symbol.class);
}
@JsOverlay
public static com.user00.domjnate.api.Symbol call(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, double description) {
  return com.user00.domjnate.util.Js.callMethod(_win, "Symbol", com.user00.domjnate.api.Symbol.class, description);
}
@JsOverlay
public static com.user00.domjnate.api.Symbol call(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, String description) {
  return com.user00.domjnate.util.Js.callMethod(_win, "Symbol", com.user00.domjnate.api.Symbol.class, description);
}
}
