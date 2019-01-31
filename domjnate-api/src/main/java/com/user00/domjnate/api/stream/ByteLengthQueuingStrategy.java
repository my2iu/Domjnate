package com.user00.domjnate.api.stream;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="ByteLengthQueuingStrategy")
public interface ByteLengthQueuingStrategy extends QueuingStrategy<com.user00.domjnate.api.ArrayBufferView>
{
@JsProperty(name="highWaterMark")
Double getHighWaterMark();
@JsProperty(name="highWaterMark")
void setHighWaterMark(Double val);
@JsMethod(name="size")
double size(com.user00.domjnate.api.ArrayBufferView chunk);
@JsOverlay
public static ByteLengthQueuingStrategy getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "ByteLengthQueuingStrategy", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", ByteLengthQueuingStrategy.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, ByteLengthQueuingStrategy val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "ByteLengthQueuingStrategy", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static ByteLengthQueuingStrategy _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, java.lang.Object options) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "ByteLengthQueuingStrategy");
  return com.user00.domjnate.util.Js.construct(_win, constructor, ByteLengthQueuingStrategy.class, options);
}
}
