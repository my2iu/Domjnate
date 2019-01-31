package com.user00.domjnate.api.stream;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="ReadableStream")
public interface ReadableStream<R> 
{
@JsProperty(name="locked")
boolean getLocked();
@JsMethod(name="cancel")
com.user00.domjnate.api.Promise<Void> cancel();
@JsMethod(name="cancel")
com.user00.domjnate.api.Promise<Void> cancel(java.lang.Object reason);
@JsMethod(name="getReader")
ReadableStreamBYOBReader getReader(java.lang.Object options);
@JsMethod(name="getReader")
ReadableStreamDefaultReader<R> getReader();
@JsMethod(name="pipeThrough")
<T> ReadableStream<T> pipeThrough(java.lang.Object transformStream);
@JsMethod(name="pipeThrough")
<T> ReadableStream<T> pipeThrough(java.lang.Object transformStream, com.user00.domjnate.api.PipeOptions options);
@JsMethod(name="pipeTo")
com.user00.domjnate.api.Promise<Void> pipeTo(WritableStream<R> dest);
@JsMethod(name="pipeTo")
com.user00.domjnate.api.Promise<Void> pipeTo(WritableStream<R> dest, com.user00.domjnate.api.PipeOptions options);
@JsMethod(name="tee")
java.lang.Object tee();
@JsOverlay
public static ReadableStream getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "ReadableStream", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", ReadableStream.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, ReadableStream val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "ReadableStream", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static ReadableStream<com.user00.domjnate.api.Uint8Array> _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, UnderlyingByteSource underlyingSource) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "ReadableStream");
  return com.user00.domjnate.util.Js.construct(_win, constructor, ReadableStream.class, underlyingSource);
}
@JsOverlay
public static ReadableStream<com.user00.domjnate.api.Uint8Array> _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, UnderlyingByteSource underlyingSource, java.lang.Object strategy) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "ReadableStream");
  return com.user00.domjnate.util.Js.construct(_win, constructor, ReadableStream.class, underlyingSource, strategy);
}
@JsOverlay
public static <R> ReadableStream<R> _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "ReadableStream");
  return com.user00.domjnate.util.Js.construct(_win, constructor, ReadableStream.class);
}
@JsOverlay
public static <R> ReadableStream<R> _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, UnderlyingSource<R> underlyingSource) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "ReadableStream");
  return com.user00.domjnate.util.Js.construct(_win, constructor, ReadableStream.class, underlyingSource);
}
@JsOverlay
public static <R> ReadableStream<R> _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, UnderlyingSource<R> underlyingSource, QueuingStrategy<R> strategy) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "ReadableStream");
  return com.user00.domjnate.util.Js.construct(_win, constructor, ReadableStream.class, underlyingSource, strategy);
}
}
