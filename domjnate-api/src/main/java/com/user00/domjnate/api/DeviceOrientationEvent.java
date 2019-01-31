package com.user00.domjnate.api;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="DeviceOrientationEvent")
public interface DeviceOrientationEvent extends com.user00.domjnate.api.dom.Event
{
@JsProperty(name="absolute")
boolean getAbsolute();
@JsProperty(name="alpha")
Double getAlpha();
@JsProperty(name="beta")
Double getBeta();
@JsProperty(name="gamma")
Double getGamma();
@JsMethod(name="initDeviceOrientationEvent")
void initDeviceOrientationEvent(String type, boolean bubbles, boolean cancelable, Double alpha, Double beta, Double gamma, boolean absolute);
@JsOverlay
public static DeviceOrientationEvent getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "DeviceOrientationEvent", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", DeviceOrientationEvent.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, DeviceOrientationEvent val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "DeviceOrientationEvent", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static DeviceOrientationEvent _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, String typeArg) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "DeviceOrientationEvent");
  return com.user00.domjnate.util.Js.construct(_win, constructor, DeviceOrientationEvent.class, typeArg);
}
@JsOverlay
public static DeviceOrientationEvent _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, String typeArg, DeviceOrientationEventInit eventInitDict) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "DeviceOrientationEvent");
  return com.user00.domjnate.util.Js.construct(_win, constructor, DeviceOrientationEvent.class, typeArg, eventInitDict);
}
}
