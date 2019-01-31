package com.user00.domjnate.api;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="Position")
public interface Position
{
@JsProperty(name="coords")
Coordinates getCoords();
@JsProperty(name="timestamp")
double getTimestamp();
}
