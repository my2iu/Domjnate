package com.user00.domjnate.api.stream;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="CountQueuingStrategy")
public interface CountQueuingStrategy extends QueuingStrategy
{
@JsProperty(name="highWaterMark")
Double getHighWaterMark();
@JsProperty(name="highWaterMark")
void setHighWaterMark(Double val);
@JsMethod(name="size")
java.lang.Object size(java.lang.Object chunk);
@JsOverlay
public static CountQueuingStrategy getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "CountQueuingStrategy", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", CountQueuingStrategy.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, CountQueuingStrategy val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "CountQueuingStrategy", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static CountQueuingStrategy _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, java.lang.Object options) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "CountQueuingStrategy");
  return com.user00.domjnate.util.Js.construct(_win, constructor, CountQueuingStrategy.class, options);
}
}
