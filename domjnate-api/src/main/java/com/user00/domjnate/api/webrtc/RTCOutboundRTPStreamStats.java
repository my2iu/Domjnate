package com.user00.domjnate.api.webrtc;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="RTCOutboundRTPStreamStats")
public interface RTCOutboundRTPStreamStats extends RTCRTPStreamStats
{
@JsProperty(name="bytesSent")
Double getBytesSent();
@JsProperty(name="bytesSent")
void setBytesSent(Double val);
@JsProperty(name="packetsSent")
Double getPacketsSent();
@JsProperty(name="packetsSent")
void setPacketsSent(Double val);
@JsProperty(name="roundTripTime")
Double getRoundTripTime();
@JsProperty(name="roundTripTime")
void setRoundTripTime(Double val);
@JsProperty(name="targetBitrate")
Double getTargetBitrate();
@JsProperty(name="targetBitrate")
void setTargetBitrate(Double val);
}
