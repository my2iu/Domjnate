package com.user00.domjnate.api;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="PositionOptions")
public interface PositionOptions
{
@JsProperty(name="enableHighAccuracy")
Boolean getEnableHighAccuracy();
@JsProperty(name="enableHighAccuracy")
void setEnableHighAccuracy(Boolean val);
@JsProperty(name="maximumAge")
Double getMaximumAge();
@JsProperty(name="maximumAge")
void setMaximumAge(Double val);
@JsProperty(name="timeout")
Double getTimeout();
@JsProperty(name="timeout")
void setTimeout(Double val);
}
