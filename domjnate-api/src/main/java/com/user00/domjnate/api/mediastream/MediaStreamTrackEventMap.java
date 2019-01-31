package com.user00.domjnate.api.mediastream;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="MediaStreamTrackEventMap")
public interface MediaStreamTrackEventMap
{
@JsProperty(name="ended")
MediaStreamErrorEvent getEnded();
@JsProperty(name="ended")
void setEnded(MediaStreamErrorEvent val);
@JsProperty(name="isolationchange")
com.user00.domjnate.api.dom.Event getIsolationchange();
@JsProperty(name="isolationchange")
void setIsolationchange(com.user00.domjnate.api.dom.Event val);
@JsProperty(name="mute")
com.user00.domjnate.api.dom.Event getMute();
@JsProperty(name="mute")
void setMute(com.user00.domjnate.api.dom.Event val);
@JsProperty(name="overconstrained")
MediaStreamErrorEvent getOverconstrained();
@JsProperty(name="overconstrained")
void setOverconstrained(MediaStreamErrorEvent val);
@JsProperty(name="unmute")
com.user00.domjnate.api.dom.Event getUnmute();
@JsProperty(name="unmute")
void setUnmute(com.user00.domjnate.api.dom.Event val);
}
