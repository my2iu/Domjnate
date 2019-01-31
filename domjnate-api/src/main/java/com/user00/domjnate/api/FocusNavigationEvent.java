package com.user00.domjnate.api;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="FocusNavigationEvent")
public interface FocusNavigationEvent extends com.user00.domjnate.api.dom.Event
{
@JsProperty(name="navigationReason")
String getNavigationReason();
@JsProperty(name="originHeight")
double getOriginHeight();
@JsProperty(name="originLeft")
double getOriginLeft();
@JsProperty(name="originTop")
double getOriginTop();
@JsProperty(name="originWidth")
double getOriginWidth();
@JsMethod(name="requestFocus")
void requestFocus();
@JsOverlay
public static FocusNavigationEvent getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "FocusNavigationEvent", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", FocusNavigationEvent.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, FocusNavigationEvent val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "FocusNavigationEvent", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static FocusNavigationEvent _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, String type) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "FocusNavigationEvent");
  return com.user00.domjnate.util.Js.construct(_win, constructor, FocusNavigationEvent.class, type);
}
@JsOverlay
public static FocusNavigationEvent _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, String type, FocusNavigationEventInit eventInitDict) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "FocusNavigationEvent");
  return com.user00.domjnate.util.Js.construct(_win, constructor, FocusNavigationEvent.class, type, eventInitDict);
}
}
