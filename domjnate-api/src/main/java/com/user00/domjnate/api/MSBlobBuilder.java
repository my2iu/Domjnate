package com.user00.domjnate.api;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="MSBlobBuilder")
public interface MSBlobBuilder
{
@JsMethod(name="append")
void append(java.lang.Object data);
@JsMethod(name="append")
void append(java.lang.Object data, String endings);
@JsMethod(name="getBlob")
Blob getBlob();
@JsMethod(name="getBlob")
Blob getBlob(String contentType);
@JsOverlay
public static MSBlobBuilder getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "MSBlobBuilder", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", MSBlobBuilder.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, MSBlobBuilder val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "MSBlobBuilder", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static MSBlobBuilder _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "MSBlobBuilder");
  return com.user00.domjnate.util.Js.construct(_win, constructor, MSBlobBuilder.class);
}
}
