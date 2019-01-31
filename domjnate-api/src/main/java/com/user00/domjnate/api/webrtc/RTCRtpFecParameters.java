package com.user00.domjnate.api.webrtc;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="RTCRtpFecParameters")
public interface RTCRtpFecParameters
{
@JsProperty(name="mechanism")
String getMechanism();
@JsProperty(name="mechanism")
void setMechanism(String val);
@JsProperty(name="ssrc")
Double getSsrc();
@JsProperty(name="ssrc")
void setSsrc(Double val);
}
