package com.user00.domjnate.api.webrtc;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="RTCIceGathererEventMap")
public interface RTCIceGathererEventMap
{
@JsProperty(name="error")
com.user00.domjnate.api.dom.Event getError();
@JsProperty(name="error")
void setError(com.user00.domjnate.api.dom.Event val);
@JsProperty(name="localcandidate")
RTCIceGathererEvent getLocalcandidate();
@JsProperty(name="localcandidate")
void setLocalcandidate(RTCIceGathererEvent val);
}
