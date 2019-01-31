package com.user00.domjnate.api;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="WheelEvent")
public interface WheelEvent extends MouseEvent
{
@JsProperty(name="deltaMode")
double getDeltaMode();
@JsProperty(name="deltaX")
double getDeltaX();
@JsProperty(name="deltaY")
double getDeltaY();
@JsProperty(name="deltaZ")
double getDeltaZ();
@JsProperty(name="DOM_DELTA_LINE")
double DOM_DELTA_LINE();
@JsProperty(name="DOM_DELTA_PAGE")
double DOM_DELTA_PAGE();
@JsProperty(name="DOM_DELTA_PIXEL")
double DOM_DELTA_PIXEL();
@JsMethod(name="getCurrentPoint")
void getCurrentPoint(com.user00.domjnate.api.dom.Element element);
@JsMethod(name="initWheelEvent")
void initWheelEvent(String typeArg, boolean canBubbleArg, boolean cancelableArg, Window viewArg, double detailArg, double screenXArg, double screenYArg, double clientXArg, double clientYArg, double buttonArg, com.user00.domjnate.api.dom.EventTarget relatedTargetArg, String modifiersListArg, double deltaXArg, double deltaYArg, double deltaZArg, double deltaMode);
@JsOverlay
public static WheelEvent getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "WheelEvent", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", WheelEvent.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, WheelEvent val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "WheelEvent", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static double DOM_DELTA_LINE(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "WheelEvent", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "DOM_DELTA_LINE", double.class);
}
@JsOverlay
public static double DOM_DELTA_PAGE(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "WheelEvent", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "DOM_DELTA_PAGE", double.class);
}
@JsOverlay
public static double DOM_DELTA_PIXEL(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "WheelEvent", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "DOM_DELTA_PIXEL", double.class);
}
@JsOverlay
public static WheelEvent _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, String typeArg) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "WheelEvent");
  return com.user00.domjnate.util.Js.construct(_win, constructor, WheelEvent.class, typeArg);
}
@JsOverlay
public static WheelEvent _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, String typeArg, WheelEventInit eventInitDict) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "WheelEvent");
  return com.user00.domjnate.util.Js.construct(_win, constructor, WheelEvent.class, typeArg, eventInitDict);
}
}
