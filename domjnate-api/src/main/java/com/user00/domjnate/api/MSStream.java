package com.user00.domjnate.api;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="MSStream")
public interface MSStream
{
@JsProperty(name="type")
String getType();
@JsMethod(name="msClose")
void msClose();
@JsMethod(name="msDetachStream")
java.lang.Object msDetachStream();
@JsOverlay
public static MSStream getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "MSStream", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", MSStream.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, MSStream val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "MSStream", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static MSStream _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "MSStream");
  return com.user00.domjnate.util.Js.construct(_win, constructor, MSStream.class);
}
}
