package com.user00.domjnate.api;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="DeviceLightEvent")
public interface DeviceLightEvent extends com.user00.domjnate.api.dom.Event
{
@JsProperty(name="value")
double getValue();
@JsOverlay
public static DeviceLightEvent getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "DeviceLightEvent", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", DeviceLightEvent.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, DeviceLightEvent val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "DeviceLightEvent", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static DeviceLightEvent _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, String typeArg) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "DeviceLightEvent");
  return com.user00.domjnate.util.Js.construct(_win, constructor, DeviceLightEvent.class, typeArg);
}
@JsOverlay
public static DeviceLightEvent _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, String typeArg, DeviceLightEventInit eventInitDict) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "DeviceLightEvent");
  return com.user00.domjnate.util.Js.construct(_win, constructor, DeviceLightEvent.class, typeArg, eventInitDict);
}
}
