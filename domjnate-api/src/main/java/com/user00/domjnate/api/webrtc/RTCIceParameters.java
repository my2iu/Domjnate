package com.user00.domjnate.api.webrtc;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="RTCIceParameters")
public interface RTCIceParameters
{
@JsProperty(name="password")
String getPassword();
@JsProperty(name="password")
void setPassword(String val);
@JsProperty(name="usernameFragment")
String getUsernameFragment();
@JsProperty(name="usernameFragment")
void setUsernameFragment(String val);
}
