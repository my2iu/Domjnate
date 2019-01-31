package com.user00.domjnate.api.webaudio;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="AudioProcessingEventInit")
public interface AudioProcessingEventInit extends com.user00.domjnate.api.dom.EventInit
{
@JsProperty(name="inputBuffer")
AudioBuffer getInputBuffer();
@JsProperty(name="inputBuffer")
void setInputBuffer(AudioBuffer val);
@JsProperty(name="outputBuffer")
AudioBuffer getOutputBuffer();
@JsProperty(name="outputBuffer")
void setOutputBuffer(AudioBuffer val);
@JsProperty(name="playbackTime")
double getPlaybackTime();
@JsProperty(name="playbackTime")
void setPlaybackTime(double val);
}
