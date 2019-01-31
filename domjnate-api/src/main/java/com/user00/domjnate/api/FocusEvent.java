package com.user00.domjnate.api;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="FocusEvent")
public interface FocusEvent extends UIEvent
{
@JsProperty(name="relatedTarget")
com.user00.domjnate.api.dom.EventTarget getRelatedTarget();
@JsMethod(name="initFocusEvent")
void initFocusEvent(String typeArg, boolean canBubbleArg, boolean cancelableArg, Window viewArg, double detailArg, com.user00.domjnate.api.dom.EventTarget relatedTargetArg);
@JsOverlay
public static FocusEvent getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "FocusEvent", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", FocusEvent.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, FocusEvent val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "FocusEvent", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static FocusEvent _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, String typeArg) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "FocusEvent");
  return com.user00.domjnate.util.Js.construct(_win, constructor, FocusEvent.class, typeArg);
}
@JsOverlay
public static FocusEvent _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, String typeArg, FocusEventInit eventInitDict) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "FocusEvent");
  return com.user00.domjnate.util.Js.construct(_win, constructor, FocusEvent.class, typeArg, eventInitDict);
}
}
