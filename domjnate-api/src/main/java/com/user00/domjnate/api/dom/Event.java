package com.user00.domjnate.api.dom;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="Event")
public interface Event
{
@JsProperty(name="bubbles")
boolean getBubbles();
@JsProperty(name="cancelBubble")
boolean getCancelBubble();
@JsProperty(name="cancelBubble")
void setCancelBubble(boolean val);
@JsProperty(name="cancelable")
boolean getCancelable();
@JsProperty(name="composed")
boolean getComposed();
@JsProperty(name="currentTarget")
EventTarget getCurrentTarget();
@JsProperty(name="defaultPrevented")
boolean getDefaultPrevented();
@JsProperty(name="eventPhase")
double getEventPhase();
@JsProperty(name="isTrusted")
boolean getIsTrusted();
@JsProperty(name="srcElement")
Element getSrcElement();
@JsProperty(name="target")
EventTarget getTarget();
@JsProperty(name="timeStamp")
double getTimeStamp();
@JsProperty(name="type")
String getType();
@JsProperty(name="AT_TARGET")
double AT_TARGET();
@JsProperty(name="BUBBLING_PHASE")
double BUBBLING_PHASE();
@JsProperty(name="CAPTURING_PHASE")
double CAPTURING_PHASE();
@JsProperty(name="NONE")
double NONE();
@JsMethod(name="composedPath")
com.user00.domjnate.api.Array<EventTarget> composedPath();
@JsMethod(name="initEvent")
void initEvent(String type);
@JsMethod(name="initEvent")
void initEvent(String type, boolean bubbles);
@JsMethod(name="initEvent")
void initEvent(String type, boolean bubbles, boolean cancelable);
@JsMethod(name="preventDefault")
void preventDefault();
@JsMethod(name="stopImmediatePropagation")
void stopImmediatePropagation();
@JsMethod(name="stopPropagation")
void stopPropagation();
@JsOverlay
public static Event getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "Event", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", Event.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, Event val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "Event", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static double AT_TARGET(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "Event", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "AT_TARGET", double.class);
}
@JsOverlay
public static double BUBBLING_PHASE(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "Event", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "BUBBLING_PHASE", double.class);
}
@JsOverlay
public static double CAPTURING_PHASE(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "Event", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "CAPTURING_PHASE", double.class);
}
@JsOverlay
public static double NONE(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "Event", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "NONE", double.class);
}
@JsOverlay
public static Event _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, String type) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "Event");
  return com.user00.domjnate.util.Js.construct(_win, constructor, Event.class, type);
}
@JsOverlay
public static Event _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, String type, EventInit eventInitDict) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "Event");
  return com.user00.domjnate.util.Js.construct(_win, constructor, Event.class, type, eventInitDict);
}
}
