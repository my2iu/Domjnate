package com.user00.domjnate.api.webrtc;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="RTCDtlsTransportEventMap")
public interface RTCDtlsTransportEventMap
{
@JsProperty(name="error")
RTCErrorEvent getError();
@JsProperty(name="error")
void setError(RTCErrorEvent val);
@JsProperty(name="statechange")
com.user00.domjnate.api.dom.Event getStatechange();
@JsProperty(name="statechange")
void setStatechange(com.user00.domjnate.api.dom.Event val);
}
