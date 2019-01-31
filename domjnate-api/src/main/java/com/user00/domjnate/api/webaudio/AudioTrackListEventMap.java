package com.user00.domjnate.api.webaudio;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="AudioTrackListEventMap")
public interface AudioTrackListEventMap
{
@JsProperty(name="addtrack")
com.user00.domjnate.api.TrackEvent getAddtrack();
@JsProperty(name="addtrack")
void setAddtrack(com.user00.domjnate.api.TrackEvent val);
@JsProperty(name="change")
com.user00.domjnate.api.dom.Event getChange();
@JsProperty(name="change")
void setChange(com.user00.domjnate.api.dom.Event val);
@JsProperty(name="removetrack")
com.user00.domjnate.api.TrackEvent getRemovetrack();
@JsProperty(name="removetrack")
void setRemovetrack(com.user00.domjnate.api.TrackEvent val);
}
