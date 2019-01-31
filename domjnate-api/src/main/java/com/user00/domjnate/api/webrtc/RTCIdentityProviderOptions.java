package com.user00.domjnate.api.webrtc;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="RTCIdentityProviderOptions")
public interface RTCIdentityProviderOptions
{
@JsProperty(name="peerIdentity")
String getPeerIdentity();
@JsProperty(name="peerIdentity")
void setPeerIdentity(String val);
@JsProperty(name="protocol")
String getProtocol();
@JsProperty(name="protocol")
void setProtocol(String val);
@JsProperty(name="usernameHint")
String getUsernameHint();
@JsProperty(name="usernameHint")
void setUsernameHint(String val);
}
