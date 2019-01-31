package com.user00.domjnate.api.webrtc;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="RTCRtpHeaderExtensionCapability")
public interface RTCRtpHeaderExtensionCapability
{
@JsProperty(name="uri")
String getUri();
@JsProperty(name="uri")
void setUri(String val);
}
