package com.user00.domjnate.api.webrtc;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="RTCIceCandidateInit")
public interface RTCIceCandidateInit
{
@JsProperty(name="candidate")
String getCandidate();
@JsProperty(name="candidate")
void setCandidate(String val);
@JsProperty(name="sdpMLineIndex")
Double getSdpMLineIndex();
@JsProperty(name="sdpMLineIndex")
void setSdpMLineIndex(Double val);
@JsProperty(name="sdpMid")
String getSdpMid();
@JsProperty(name="sdpMid")
void setSdpMid(String val);
@JsProperty(name="usernameFragment")
String getUsernameFragment();
@JsProperty(name="usernameFragment")
void setUsernameFragment(String val);
}
