package com.user00.domjnate.api;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="TrackEventInit")
public interface TrackEventInit extends com.user00.domjnate.api.dom.EventInit
{
@JsProperty(name="track")
java.lang.Object getTrack();
@JsProperty(name="track")
void setTrack(java.lang.Object val);
}
