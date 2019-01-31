package com.user00.domjnate.api.webaudio;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="AudioContextInfo")
public interface AudioContextInfo
{
@JsProperty(name="currentTime")
Double getCurrentTime();
@JsProperty(name="currentTime")
void setCurrentTime(Double val);
@JsProperty(name="sampleRate")
Double getSampleRate();
@JsProperty(name="sampleRate")
void setSampleRate(Double val);
}
