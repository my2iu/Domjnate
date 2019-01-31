package com.user00.domjnate.api;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="ScopedCredential")
public interface ScopedCredential
{
@JsProperty(name="id")
ArrayBuffer getId();
@JsProperty(name="type")
String getType();
@JsOverlay
public static ScopedCredential getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "ScopedCredential", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", ScopedCredential.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, ScopedCredential val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "ScopedCredential", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static ScopedCredential _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "ScopedCredential");
  return com.user00.domjnate.util.Js.construct(_win, constructor, ScopedCredential.class);
}
}
