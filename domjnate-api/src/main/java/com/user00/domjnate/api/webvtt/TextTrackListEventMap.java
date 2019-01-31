package com.user00.domjnate.api.webvtt;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="TextTrackListEventMap")
public interface TextTrackListEventMap
{
@JsProperty(name="addtrack")
com.user00.domjnate.api.TrackEvent getAddtrack();
@JsProperty(name="addtrack")
void setAddtrack(com.user00.domjnate.api.TrackEvent val);
}
