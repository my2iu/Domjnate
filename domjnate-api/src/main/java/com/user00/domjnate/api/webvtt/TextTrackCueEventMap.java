package com.user00.domjnate.api.webvtt;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="TextTrackCueEventMap")
public interface TextTrackCueEventMap
{
@JsProperty(name="enter")
com.user00.domjnate.api.dom.Event getEnter();
@JsProperty(name="enter")
void setEnter(com.user00.domjnate.api.dom.Event val);
@JsProperty(name="exit")
com.user00.domjnate.api.dom.Event getExit();
@JsProperty(name="exit")
void setExit(com.user00.domjnate.api.dom.Event val);
}
