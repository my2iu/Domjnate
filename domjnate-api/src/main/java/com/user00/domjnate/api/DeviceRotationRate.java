package com.user00.domjnate.api;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="DeviceRotationRate")
public interface DeviceRotationRate
{
@JsProperty(name="alpha")
Double getAlpha();
@JsProperty(name="beta")
Double getBeta();
@JsProperty(name="gamma")
Double getGamma();
@JsOverlay
public static DeviceRotationRate getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "DeviceRotationRate", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", DeviceRotationRate.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, DeviceRotationRate val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "DeviceRotationRate", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static DeviceRotationRate _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "DeviceRotationRate");
  return com.user00.domjnate.util.Js.construct(_win, constructor, DeviceRotationRate.class);
}
}
