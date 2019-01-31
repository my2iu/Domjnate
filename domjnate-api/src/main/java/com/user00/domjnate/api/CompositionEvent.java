package com.user00.domjnate.api;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="CompositionEvent")
public interface CompositionEvent extends UIEvent
{
@JsProperty(name="data")
String getData();
@JsProperty(name="locale")
String getLocale();
@JsMethod(name="initCompositionEvent")
void initCompositionEvent(String typeArg, boolean canBubbleArg, boolean cancelableArg, Window viewArg, String dataArg, String locale);
@JsOverlay
public static CompositionEvent getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "CompositionEvent", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", CompositionEvent.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, CompositionEvent val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "CompositionEvent", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static CompositionEvent _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, String typeArg) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "CompositionEvent");
  return com.user00.domjnate.util.Js.construct(_win, constructor, CompositionEvent.class, typeArg);
}
@JsOverlay
public static CompositionEvent _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, String typeArg, CompositionEventInit eventInitDict) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "CompositionEvent");
  return com.user00.domjnate.util.Js.construct(_win, constructor, CompositionEvent.class, typeArg, eventInitDict);
}
}
