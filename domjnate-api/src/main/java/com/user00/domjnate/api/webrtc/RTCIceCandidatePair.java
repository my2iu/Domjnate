package com.user00.domjnate.api.webrtc;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="RTCIceCandidatePair")
public interface RTCIceCandidatePair
{
@JsProperty(name="local")
RTCIceCandidate getLocal();
@JsProperty(name="local")
void setLocal(RTCIceCandidate val);
@JsProperty(name="remote")
RTCIceCandidate getRemote();
@JsProperty(name="remote")
void setRemote(RTCIceCandidate val);
}
