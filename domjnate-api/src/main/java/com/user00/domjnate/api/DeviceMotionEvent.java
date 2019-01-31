package com.user00.domjnate.api;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="DeviceMotionEvent")
public interface DeviceMotionEvent extends com.user00.domjnate.api.dom.Event
{
@JsProperty(name="acceleration")
DeviceAcceleration getAcceleration();
@JsProperty(name="accelerationIncludingGravity")
DeviceAcceleration getAccelerationIncludingGravity();
@JsProperty(name="interval")
Double getInterval();
@JsProperty(name="rotationRate")
DeviceRotationRate getRotationRate();
@JsMethod(name="initDeviceMotionEvent")
void initDeviceMotionEvent(String type, boolean bubbles, boolean cancelable, DeviceAccelerationDict acceleration, DeviceAccelerationDict accelerationIncludingGravity, DeviceRotationRateDict rotationRate, Double interval);
@JsOverlay
public static DeviceMotionEvent getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "DeviceMotionEvent", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", DeviceMotionEvent.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, DeviceMotionEvent val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "DeviceMotionEvent", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static DeviceMotionEvent _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, String typeArg) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "DeviceMotionEvent");
  return com.user00.domjnate.util.Js.construct(_win, constructor, DeviceMotionEvent.class, typeArg);
}
@JsOverlay
public static DeviceMotionEvent _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, String typeArg, DeviceMotionEventInit eventInitDict) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "DeviceMotionEvent");
  return com.user00.domjnate.util.Js.construct(_win, constructor, DeviceMotionEvent.class, typeArg, eventInitDict);
}
}
