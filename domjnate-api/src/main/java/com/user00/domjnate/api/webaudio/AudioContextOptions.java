package com.user00.domjnate.api.webaudio;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="AudioContextOptions")
public interface AudioContextOptions
{
@JsProperty(name="latencyHint")
java.lang.Object getLatencyHint();
@JsProperty(name="latencyHint")
void setLatencyHint(java.lang.Object val);
@JsProperty(name="sampleRate")
Double getSampleRate();
@JsProperty(name="sampleRate")
void setSampleRate(Double val);
}
