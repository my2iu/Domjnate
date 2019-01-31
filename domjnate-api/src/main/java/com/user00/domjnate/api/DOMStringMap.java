package com.user00.domjnate.api;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="DOMStringMap")
public interface DOMStringMap
{
@JsOverlay
public default java.lang.Object get(String name) {
  return (java.lang.Object)com.user00.domjnate.util.Js.getMember(this, name, java.lang.Object.class);
}
@JsOverlay
public default void set(String name, java.lang.Object val) {
  com.user00.domjnate.util.Js.setMember(this, name, val);
}
@JsOverlay
public static DOMStringMap getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "DOMStringMap", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", DOMStringMap.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, DOMStringMap val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "DOMStringMap", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static DOMStringMap _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "DOMStringMap");
  return com.user00.domjnate.util.Js.construct(_win, constructor, DOMStringMap.class);
}
}
