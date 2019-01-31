package com.user00.domjnate.api.webaudio;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="AudioBufferSourceOptions")
public interface AudioBufferSourceOptions
{
@JsProperty(name="buffer")
AudioBuffer getBuffer();
@JsProperty(name="buffer")
void setBuffer(AudioBuffer val);
@JsProperty(name="detune")
Double getDetune();
@JsProperty(name="detune")
void setDetune(Double val);
@JsProperty(name="loop")
Boolean getLoop();
@JsProperty(name="loop")
void setLoop(Boolean val);
@JsProperty(name="loopEnd")
Double getLoopEnd();
@JsProperty(name="loopEnd")
void setLoopEnd(Double val);
@JsProperty(name="loopStart")
Double getLoopStart();
@JsProperty(name="loopStart")
void setLoopStart(Double val);
@JsProperty(name="playbackRate")
Double getPlaybackRate();
@JsProperty(name="playbackRate")
void setPlaybackRate(Double val);
}
