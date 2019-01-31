package com.user00.domjnate.api;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="DeviceAcceleration")
public interface DeviceAcceleration
{
@JsProperty(name="x")
Double getX();
@JsProperty(name="y")
Double getY();
@JsProperty(name="z")
Double getZ();
@JsOverlay
public static DeviceAcceleration getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "DeviceAcceleration", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", DeviceAcceleration.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, DeviceAcceleration val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "DeviceAcceleration", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static DeviceAcceleration _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "DeviceAcceleration");
  return com.user00.domjnate.util.Js.construct(_win, constructor, DeviceAcceleration.class);
}
}
