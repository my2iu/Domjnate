package com.user00.domjnate.api.stream;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="TransformStream")
public interface TransformStream<I,O> 
{
@JsProperty(name="readable")
ReadableStream<O> getReadable();
@JsProperty(name="writable")
WritableStream<I> getWritable();
@JsOverlay
public static TransformStream getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "TransformStream", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", TransformStream.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, TransformStream val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "TransformStream", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static <I,O> TransformStream<I, O> _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "TransformStream");
  return com.user00.domjnate.util.Js.construct(_win, constructor, TransformStream.class);
}
@JsOverlay
public static <I,O> TransformStream<I, O> _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, Transformer<I, O> transformer) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "TransformStream");
  return com.user00.domjnate.util.Js.construct(_win, constructor, TransformStream.class, transformer);
}
@JsOverlay
public static <I,O> TransformStream<I, O> _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, Transformer<I, O> transformer, QueuingStrategy<I> writableStrategy) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "TransformStream");
  return com.user00.domjnate.util.Js.construct(_win, constructor, TransformStream.class, transformer, writableStrategy);
}
@JsOverlay
public static <I,O> TransformStream<I, O> _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, Transformer<I, O> transformer, QueuingStrategy<I> writableStrategy, QueuingStrategy<O> readableStrategy) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "TransformStream");
  return com.user00.domjnate.util.Js.construct(_win, constructor, TransformStream.class, transformer, writableStrategy, readableStrategy);
}
}
