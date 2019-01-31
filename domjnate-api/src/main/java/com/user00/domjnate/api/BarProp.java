package com.user00.domjnate.api;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="BarProp")
public interface BarProp
{
@JsProperty(name="visible")
boolean getVisible();
@JsOverlay
public static BarProp getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "BarProp", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", BarProp.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, BarProp val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "BarProp", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static BarProp _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "BarProp");
  return com.user00.domjnate.util.Js.construct(_win, constructor, BarProp.class);
}
}
