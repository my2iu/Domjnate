package com.user00.domjnate.api;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="TouchList")
public interface TouchList
{
@JsProperty(name="length")
double getLength();
@JsMethod(name="item")
Touch item(double index);
@JsOverlay
public default Touch get(double index) {
  return (Touch)com.user00.domjnate.util.Js.getIndex(this, index, Touch.class);
}
@JsOverlay
public default void set(double index, Touch val) {
  com.user00.domjnate.util.Js.setIndex(this, index, val);
}
@JsOverlay
public static TouchList getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "TouchList", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", TouchList.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, TouchList val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "TouchList", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static TouchList _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "TouchList");
  return com.user00.domjnate.util.Js.construct(_win, constructor, TouchList.class);
}
}
