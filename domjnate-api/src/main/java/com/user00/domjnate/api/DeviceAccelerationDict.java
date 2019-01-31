package com.user00.domjnate.api;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="DeviceAccelerationDict")
public interface DeviceAccelerationDict
{
@JsProperty(name="x")
Double getX();
@JsProperty(name="x")
void setX(Double val);
@JsProperty(name="y")
Double getY();
@JsProperty(name="y")
void setY(Double val);
@JsProperty(name="z")
Double getZ();
@JsProperty(name="z")
void setZ(Double val);
}
