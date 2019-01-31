package com.user00.domjnate.api;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="PositionError")
public interface PositionError
{
@JsProperty(name="code")
double getCode();
@JsProperty(name="message")
String getMessage();
@JsProperty(name="PERMISSION_DENIED")
double PERMISSION_DENIED();
@JsProperty(name="POSITION_UNAVAILABLE")
double POSITION_UNAVAILABLE();
@JsProperty(name="TIMEOUT")
double TIMEOUT();
}
