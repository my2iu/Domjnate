package com.user00.domjnate.api.webrtc;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="RTCPeerConnectionIceEventInit")
public interface RTCPeerConnectionIceEventInit extends com.user00.domjnate.api.dom.EventInit
{
@JsProperty(name="candidate")
RTCIceCandidate getCandidate();
@JsProperty(name="candidate")
void setCandidate(RTCIceCandidate val);
@JsProperty(name="url")
String getUrl();
@JsProperty(name="url")
void setUrl(String val);
}
