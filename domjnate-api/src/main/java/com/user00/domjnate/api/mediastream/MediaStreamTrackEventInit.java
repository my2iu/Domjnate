package com.user00.domjnate.api.mediastream;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="MediaStreamTrackEventInit")
public interface MediaStreamTrackEventInit extends com.user00.domjnate.api.dom.EventInit
{
@JsProperty(name="track")
MediaStreamTrack getTrack();
@JsProperty(name="track")
void setTrack(MediaStreamTrack val);
}
