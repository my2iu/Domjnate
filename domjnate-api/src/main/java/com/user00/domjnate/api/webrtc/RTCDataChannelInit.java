package com.user00.domjnate.api.webrtc;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="RTCDataChannelInit")
public interface RTCDataChannelInit
{
@JsProperty(name="id")
Double getId();
@JsProperty(name="id")
void setId(Double val);
@JsProperty(name="maxPacketLifeTime")
Double getMaxPacketLifeTime();
@JsProperty(name="maxPacketLifeTime")
void setMaxPacketLifeTime(Double val);
@JsProperty(name="maxRetransmits")
Double getMaxRetransmits();
@JsProperty(name="maxRetransmits")
void setMaxRetransmits(Double val);
@JsProperty(name="negotiated")
Boolean getNegotiated();
@JsProperty(name="negotiated")
void setNegotiated(Boolean val);
@JsProperty(name="ordered")
Boolean getOrdered();
@JsProperty(name="ordered")
void setOrdered(Boolean val);
@JsProperty(name="priority")
String getPriority();
@JsProperty(name="priority")
void setPriority(String val);
@JsProperty(name="protocol")
String getProtocol();
@JsProperty(name="protocol")
void setProtocol(String val);
}
