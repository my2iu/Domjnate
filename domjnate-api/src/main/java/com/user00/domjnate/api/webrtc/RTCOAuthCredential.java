package com.user00.domjnate.api.webrtc;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="RTCOAuthCredential")
public interface RTCOAuthCredential
{
@JsProperty(name="accessToken")
String getAccessToken();
@JsProperty(name="accessToken")
void setAccessToken(String val);
@JsProperty(name="macKey")
String getMacKey();
@JsProperty(name="macKey")
void setMacKey(String val);
}
