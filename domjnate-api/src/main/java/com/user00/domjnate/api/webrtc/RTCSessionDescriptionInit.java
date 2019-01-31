package com.user00.domjnate.api.webrtc;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="RTCSessionDescriptionInit")
public interface RTCSessionDescriptionInit
{
@JsProperty(name="sdp")
String getSdp();
@JsProperty(name="sdp")
void setSdp(String val);
@JsProperty(name="type")
String getType();
@JsProperty(name="type")
void setType(String val);
}
