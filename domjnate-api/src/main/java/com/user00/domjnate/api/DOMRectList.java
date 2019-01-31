package com.user00.domjnate.api;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="DOMRectList")
public interface DOMRectList
{
@JsProperty(name="length")
double getLength();
@JsMethod(name="item")
DOMRect item(double index);
@JsOverlay
public default DOMRect get(double index) {
  return (DOMRect)com.user00.domjnate.util.Js.getIndex(this, index, DOMRect.class);
}
@JsOverlay
public default void set(double index, DOMRect val) {
  com.user00.domjnate.util.Js.setIndex(this, index, val);
}
@JsOverlay
public static DOMRectList getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "DOMRectList", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", DOMRectList.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, DOMRectList val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "DOMRectList", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static DOMRectList _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "DOMRectList");
  return com.user00.domjnate.util.Js.construct(_win, constructor, DOMRectList.class);
}
}
