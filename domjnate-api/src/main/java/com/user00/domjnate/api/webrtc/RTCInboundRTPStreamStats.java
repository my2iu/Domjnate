package com.user00.domjnate.api.webrtc;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="RTCInboundRTPStreamStats")
public interface RTCInboundRTPStreamStats extends RTCRTPStreamStats
{
@JsProperty(name="bytesReceived")
Double getBytesReceived();
@JsProperty(name="bytesReceived")
void setBytesReceived(Double val);
@JsProperty(name="fractionLost")
Double getFractionLost();
@JsProperty(name="fractionLost")
void setFractionLost(Double val);
@JsProperty(name="jitter")
Double getJitter();
@JsProperty(name="jitter")
void setJitter(Double val);
@JsProperty(name="packetsLost")
Double getPacketsLost();
@JsProperty(name="packetsLost")
void setPacketsLost(Double val);
@JsProperty(name="packetsReceived")
Double getPacketsReceived();
@JsProperty(name="packetsReceived")
void setPacketsReceived(Double val);
}
