package com.user00.domjnate.api;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="BeforeUnloadEvent")
public interface BeforeUnloadEvent extends com.user00.domjnate.api.dom.Event
{
@JsProperty(name="returnValue")
java.lang.Object getReturnValue();
@JsProperty(name="returnValue")
void setReturnValue(java.lang.Object val);
@JsOverlay
public static BeforeUnloadEvent getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "BeforeUnloadEvent", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", BeforeUnloadEvent.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, BeforeUnloadEvent val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "BeforeUnloadEvent", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static BeforeUnloadEvent _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "BeforeUnloadEvent");
  return com.user00.domjnate.util.Js.construct(_win, constructor, BeforeUnloadEvent.class);
}
}
