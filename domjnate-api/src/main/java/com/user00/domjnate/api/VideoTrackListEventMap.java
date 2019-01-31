package com.user00.domjnate.api;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="VideoTrackListEventMap")
public interface VideoTrackListEventMap
{
@JsProperty(name="addtrack")
TrackEvent getAddtrack();
@JsProperty(name="addtrack")
void setAddtrack(TrackEvent val);
@JsProperty(name="change")
com.user00.domjnate.api.dom.Event getChange();
@JsProperty(name="change")
void setChange(com.user00.domjnate.api.dom.Event val);
@JsProperty(name="removetrack")
TrackEvent getRemovetrack();
@JsProperty(name="removetrack")
void setRemovetrack(TrackEvent val);
}
