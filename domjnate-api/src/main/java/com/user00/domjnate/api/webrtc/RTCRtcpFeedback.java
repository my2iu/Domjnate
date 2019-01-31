package com.user00.domjnate.api.webrtc;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="RTCRtcpFeedback")
public interface RTCRtcpFeedback
{
@JsProperty(name="parameter")
String getParameter();
@JsProperty(name="parameter")
void setParameter(String val);
@JsProperty(name="type")
String getType();
@JsProperty(name="type")
void setType(String val);
}
