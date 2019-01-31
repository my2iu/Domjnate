package com.user00.domjnate.api;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="UIEvent")
public interface UIEvent extends com.user00.domjnate.api.dom.Event
{
@JsProperty(name="detail")
double getDetail();
@JsProperty(name="view")
Window getView();
@JsMethod(name="initUIEvent")
void initUIEvent(String typeArg, boolean canBubbleArg, boolean cancelableArg, Window viewArg, double detailArg);
@JsOverlay
public static UIEvent getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "UIEvent", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", UIEvent.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, UIEvent val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "UIEvent", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static UIEvent _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, String typeArg) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "UIEvent");
  return com.user00.domjnate.util.Js.construct(_win, constructor, UIEvent.class, typeArg);
}
@JsOverlay
public static UIEvent _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, String typeArg, UIEventInit eventInitDict) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "UIEvent");
  return com.user00.domjnate.util.Js.construct(_win, constructor, UIEvent.class, typeArg, eventInitDict);
}
}
