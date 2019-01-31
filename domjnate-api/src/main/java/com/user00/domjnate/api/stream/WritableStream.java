package com.user00.domjnate.api.stream;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="WritableStream")
public interface WritableStream<W> 
{
@JsProperty(name="locked")
boolean getLocked();
@JsMethod(name="abort")
com.user00.domjnate.api.Promise<Void> abort();
@JsMethod(name="abort")
com.user00.domjnate.api.Promise<Void> abort(java.lang.Object reason);
@JsMethod(name="getWriter")
WritableStreamDefaultWriter<W> getWriter();
@JsOverlay
public static WritableStream getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "WritableStream", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", WritableStream.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, WritableStream val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "WritableStream", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static <W> WritableStream<W> _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "WritableStream");
  return com.user00.domjnate.util.Js.construct(_win, constructor, WritableStream.class);
}
@JsOverlay
public static <W> WritableStream<W> _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, UnderlyingSink<W> underlyingSink) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "WritableStream");
  return com.user00.domjnate.util.Js.construct(_win, constructor, WritableStream.class, underlyingSink);
}
@JsOverlay
public static <W> WritableStream<W> _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, UnderlyingSink<W> underlyingSink, QueuingStrategy<W> strategy) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "WritableStream");
  return com.user00.domjnate.util.Js.construct(_win, constructor, WritableStream.class, underlyingSink, strategy);
}
}
