package com.user00.domjnate.api.stream;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="ReadableStreamBYOBReader")
public interface ReadableStreamBYOBReader
{
@JsProperty(name="closed")
com.user00.domjnate.api.Promise<Void> getClosed();
@JsMethod(name="cancel")
com.user00.domjnate.api.Promise<Void> cancel();
@JsMethod(name="cancel")
com.user00.domjnate.api.Promise<Void> cancel(java.lang.Object reason);
@JsMethod(name="read")
<T extends com.user00.domjnate.api.ArrayBufferView> com.user00.domjnate.api.Promise<ReadableStreamReadResult<T>> read(T view);
@JsMethod(name="releaseLock")
void releaseLock();
@JsOverlay
public static ReadableStreamBYOBReader getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "ReadableStreamBYOBReader", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", ReadableStreamBYOBReader.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, ReadableStreamBYOBReader val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "ReadableStreamBYOBReader", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static ReadableStreamBYOBReader _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, ReadableStream<com.user00.domjnate.api.Uint8Array> stream) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "ReadableStreamBYOBReader");
  return com.user00.domjnate.util.Js.construct(_win, constructor, ReadableStreamBYOBReader.class, stream);
}
}
