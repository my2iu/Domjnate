package com.user00.domjnate.api.webaudio;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="OfflineAudioContextOptions")
public interface OfflineAudioContextOptions
{
@JsProperty(name="length")
double getLength();
@JsProperty(name="length")
void setLength(double val);
@JsProperty(name="numberOfChannels")
Double getNumberOfChannels();
@JsProperty(name="numberOfChannels")
void setNumberOfChannels(Double val);
@JsProperty(name="sampleRate")
double getSampleRate();
@JsProperty(name="sampleRate")
void setSampleRate(double val);
}
