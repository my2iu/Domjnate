package com.user00.domjnate.api.webrtc;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="RTCRtpCodecParameters")
public interface RTCRtpCodecParameters
{
@JsProperty(name="channels")
Double getChannels();
@JsProperty(name="channels")
void setChannels(Double val);
@JsProperty(name="clockRate")
double getClockRate();
@JsProperty(name="clockRate")
void setClockRate(double val);
@JsProperty(name="mimeType")
String getMimeType();
@JsProperty(name="mimeType")
void setMimeType(String val);
@JsProperty(name="payloadType")
double getPayloadType();
@JsProperty(name="payloadType")
void setPayloadType(double val);
@JsProperty(name="sdpFmtpLine")
String getSdpFmtpLine();
@JsProperty(name="sdpFmtpLine")
void setSdpFmtpLine(String val);
}
