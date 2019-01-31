package com.user00.domjnate.api.dom;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="ProcessingInstruction")
public interface ProcessingInstruction extends CharacterData
{
@JsProperty(name="target")
String getTarget();
@JsOverlay
public static ProcessingInstruction getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "ProcessingInstruction", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", ProcessingInstruction.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, ProcessingInstruction val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "ProcessingInstruction", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static ProcessingInstruction _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "ProcessingInstruction");
  return com.user00.domjnate.util.Js.construct(_win, constructor, ProcessingInstruction.class);
}
}
