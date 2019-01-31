package com.user00.domjnate.api.webrtc;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="RTCErrorEventInit")
public interface RTCErrorEventInit extends com.user00.domjnate.api.dom.EventInit
{
@JsProperty(name="error")
RTCError getError();
@JsProperty(name="error")
void setError(RTCError val);
}
