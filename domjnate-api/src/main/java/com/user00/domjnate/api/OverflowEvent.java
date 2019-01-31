package com.user00.domjnate.api;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="OverflowEvent")
public interface OverflowEvent extends UIEvent
{
@JsProperty(name="horizontalOverflow")
boolean getHorizontalOverflow();
@JsProperty(name="orient")
double getOrient();
@JsProperty(name="verticalOverflow")
boolean getVerticalOverflow();
@JsProperty(name="BOTH")
double BOTH();
@JsProperty(name="HORIZONTAL")
double HORIZONTAL();
@JsProperty(name="VERTICAL")
double VERTICAL();
@JsOverlay
public static OverflowEvent getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "OverflowEvent", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", OverflowEvent.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, OverflowEvent val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "OverflowEvent", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static double BOTH(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "OverflowEvent", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "BOTH", double.class);
}
@JsOverlay
public static double HORIZONTAL(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "OverflowEvent", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "HORIZONTAL", double.class);
}
@JsOverlay
public static double VERTICAL(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "OverflowEvent", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "VERTICAL", double.class);
}
@JsOverlay
public static OverflowEvent _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "OverflowEvent");
  return com.user00.domjnate.util.Js.construct(_win, constructor, OverflowEvent.class);
}
}
