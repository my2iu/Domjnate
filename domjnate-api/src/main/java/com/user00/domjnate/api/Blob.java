package com.user00.domjnate.api;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="Blob")
public interface Blob
{
@JsProperty(name="size")
double getSize();
@JsProperty(name="type")
String getType();
@JsMethod(name="slice")
Blob slice();
@JsMethod(name="slice")
Blob slice(double start);
@JsMethod(name="slice")
Blob slice(double start, double end);
@JsMethod(name="slice")
Blob slice(double start, double end, String contentType);
@JsOverlay
public static Blob getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "Blob", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", Blob.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, Blob val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "Blob", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static Blob _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "Blob");
  return com.user00.domjnate.util.Js.construct(_win, constructor, Blob.class);
}
@JsOverlay
public static Blob _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, Array<String> blobParts) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "Blob");
  return com.user00.domjnate.util.Js.construct(_win, constructor, Blob.class, blobParts);
}
@JsOverlay
public static Blob _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, Array<String> blobParts, BlobPropertyBag options) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "Blob");
  return com.user00.domjnate.util.Js.construct(_win, constructor, Blob.class, blobParts, options);
}
}
