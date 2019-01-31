package com.user00.domjnate.api.stream;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="ReadableStreamReader")
public interface ReadableStreamReader<R> 
{
@JsMethod(name="cancel")
com.user00.domjnate.api.Promise<Void> cancel();
@JsMethod(name="read")
com.user00.domjnate.api.Promise<ReadableStreamReadResult<R>> read();
@JsMethod(name="releaseLock")
void releaseLock();
@JsOverlay
public static ReadableStreamReader getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "ReadableStreamReader", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", ReadableStreamReader.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, ReadableStreamReader val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "ReadableStreamReader", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static ReadableStreamReader _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "ReadableStreamReader");
  return com.user00.domjnate.util.Js.construct(_win, constructor, ReadableStreamReader.class);
}
}
