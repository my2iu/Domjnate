package com.user00.domjnate.api.webrtc;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="RTCDataChannelEventInit")
public interface RTCDataChannelEventInit extends com.user00.domjnate.api.dom.EventInit
{
@JsProperty(name="channel")
RTCDataChannel getChannel();
@JsProperty(name="channel")
void setChannel(RTCDataChannel val);
}
