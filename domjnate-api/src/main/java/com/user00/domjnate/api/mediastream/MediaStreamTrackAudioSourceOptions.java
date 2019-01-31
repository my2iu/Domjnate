package com.user00.domjnate.api.mediastream;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="MediaStreamTrackAudioSourceOptions")
public interface MediaStreamTrackAudioSourceOptions
{
@JsProperty(name="mediaStreamTrack")
MediaStreamTrack getMediaStreamTrack();
@JsProperty(name="mediaStreamTrack")
void setMediaStreamTrack(MediaStreamTrack val);
}
