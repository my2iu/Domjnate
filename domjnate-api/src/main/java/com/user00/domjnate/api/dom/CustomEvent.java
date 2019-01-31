package com.user00.domjnate.api.dom;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="CustomEvent")
public interface CustomEvent<T>  extends Event
{
@JsProperty(name="detail")
T getDetail();
@JsMethod(name="initCustomEvent")
void initCustomEvent(String typeArg, boolean canBubbleArg, boolean cancelableArg, T detailArg);
@JsOverlay
public static CustomEvent getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "CustomEvent", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", CustomEvent.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, CustomEvent val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "CustomEvent", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static <T> CustomEvent<T> _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, String typeArg) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "CustomEvent");
  return com.user00.domjnate.util.Js.construct(_win, constructor, CustomEvent.class, typeArg);
}
@JsOverlay
public static <T> CustomEvent<T> _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, String typeArg, CustomEventInit<T> eventInitDict) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "CustomEvent");
  return com.user00.domjnate.util.Js.construct(_win, constructor, CustomEvent.class, typeArg, eventInitDict);
}
}
