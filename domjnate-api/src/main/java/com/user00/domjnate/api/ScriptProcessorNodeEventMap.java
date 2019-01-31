package com.user00.domjnate.api;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="ScriptProcessorNodeEventMap")
public interface ScriptProcessorNodeEventMap
{
@JsProperty(name="audioprocess")
com.user00.domjnate.api.webaudio.AudioProcessingEvent getAudioprocess();
@JsProperty(name="audioprocess")
void setAudioprocess(com.user00.domjnate.api.webaudio.AudioProcessingEvent val);
}
