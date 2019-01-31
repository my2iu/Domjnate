package com.user00.domjnate.api.webaudio;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="AudioTimestamp")
public interface AudioTimestamp
{
@JsProperty(name="contextTime")
Double getContextTime();
@JsProperty(name="contextTime")
void setContextTime(Double val);
@JsProperty(name="performanceTime")
Double getPerformanceTime();
@JsProperty(name="performanceTime")
void setPerformanceTime(Double val);
}
