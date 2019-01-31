package com.user00.domjnate.api.webaudio;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="MediaStreamAudioSourceOptions")
public interface MediaStreamAudioSourceOptions
{
@JsProperty(name="mediaStream")
com.user00.domjnate.api.mediastream.MediaStream getMediaStream();
@JsProperty(name="mediaStream")
void setMediaStream(com.user00.domjnate.api.mediastream.MediaStream val);
}
