package com.user00.domjnate.api.webaudio;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="AnalyserOptions")
public interface AnalyserOptions extends AudioNodeOptions
{
@JsProperty(name="fftSize")
Double getFftSize();
@JsProperty(name="fftSize")
void setFftSize(Double val);
@JsProperty(name="maxDecibels")
Double getMaxDecibels();
@JsProperty(name="maxDecibels")
void setMaxDecibels(Double val);
@JsProperty(name="minDecibels")
Double getMinDecibels();
@JsProperty(name="minDecibels")
void setMinDecibels(Double val);
@JsProperty(name="smoothingTimeConstant")
Double getSmoothingTimeConstant();
@JsProperty(name="smoothingTimeConstant")
void setSmoothingTimeConstant(Double val);
}
