package com.user00.domjnate.api;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="DeviceMotionEventInit")
public interface DeviceMotionEventInit extends com.user00.domjnate.api.dom.EventInit
{
@JsProperty(name="acceleration")
DeviceAccelerationDict getAcceleration();
@JsProperty(name="acceleration")
void setAcceleration(DeviceAccelerationDict val);
@JsProperty(name="accelerationIncludingGravity")
DeviceAccelerationDict getAccelerationIncludingGravity();
@JsProperty(name="accelerationIncludingGravity")
void setAccelerationIncludingGravity(DeviceAccelerationDict val);
@JsProperty(name="interval")
Double getInterval();
@JsProperty(name="interval")
void setInterval(Double val);
@JsProperty(name="rotationRate")
DeviceRotationRateDict getRotationRate();
@JsProperty(name="rotationRate")
void setRotationRate(DeviceRotationRateDict val);
}
