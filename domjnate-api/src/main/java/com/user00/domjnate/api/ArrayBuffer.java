package com.user00.domjnate.api;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="ArrayBuffer")
public interface ArrayBuffer
{
@JsProperty(name="byteLength")
double getByteLength();
@JsMethod(name="slice")
ArrayBuffer slice(double begin);
@JsMethod(name="slice")
ArrayBuffer slice(double begin, double end);
@JsOverlay
public static ArrayBuffer getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "ArrayBuffer", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", ArrayBuffer.class);
}
@JsOverlay
public static boolean isView(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, java.lang.Object arg) {
  return com.user00.domjnate.util.Js.callStaticMethod(_win, "ArrayBuffer", "isView", boolean.class, arg);
}
@JsOverlay
public static ArrayBuffer _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, double byteLength) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "ArrayBuffer");
  return com.user00.domjnate.util.Js.construct(_win, constructor, ArrayBuffer.class, byteLength);
}
}
