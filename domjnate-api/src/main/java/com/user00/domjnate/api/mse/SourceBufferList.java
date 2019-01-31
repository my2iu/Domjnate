package com.user00.domjnate.api.mse;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="SourceBufferList")
public interface SourceBufferList extends com.user00.domjnate.api.dom.EventTarget
{
@JsProperty(name="length")
double getLength();
@JsMethod(name="item")
SourceBuffer item(double index);
@JsOverlay
public default SourceBuffer get(double index) {
  return (SourceBuffer)com.user00.domjnate.util.Js.getIndex(this, index, SourceBuffer.class);
}
@JsOverlay
public default void set(double index, SourceBuffer val) {
  com.user00.domjnate.util.Js.setIndex(this, index, val);
}
@JsOverlay
public static SourceBufferList getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "SourceBufferList", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", SourceBufferList.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, SourceBufferList val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "SourceBufferList", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static SourceBufferList _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "SourceBufferList");
  return com.user00.domjnate.util.Js.construct(_win, constructor, SourceBufferList.class);
}
}
