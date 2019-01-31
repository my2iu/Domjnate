package com.user00.domjnate.api.webvtt;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="TextTrackEventMap")
public interface TextTrackEventMap
{
@JsProperty(name="cuechange")
com.user00.domjnate.api.dom.Event getCuechange();
@JsProperty(name="cuechange")
void setCuechange(com.user00.domjnate.api.dom.Event val);
@JsProperty(name="error")
com.user00.domjnate.api.dom.Event getError();
@JsProperty(name="error")
void setError(com.user00.domjnate.api.dom.Event val);
@JsProperty(name="load")
com.user00.domjnate.api.dom.Event getLoad();
@JsProperty(name="load")
void setLoad(com.user00.domjnate.api.dom.Event val);
}
