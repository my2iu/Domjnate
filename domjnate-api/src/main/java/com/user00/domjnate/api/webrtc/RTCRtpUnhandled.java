package com.user00.domjnate.api.webrtc;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="RTCRtpUnhandled")
public interface RTCRtpUnhandled
{
@JsProperty(name="muxId")
String getMuxId();
@JsProperty(name="muxId")
void setMuxId(String val);
@JsProperty(name="payloadType")
Double getPayloadType();
@JsProperty(name="payloadType")
void setPayloadType(Double val);
@JsProperty(name="ssrc")
Double getSsrc();
@JsProperty(name="ssrc")
void setSsrc(Double val);
}
