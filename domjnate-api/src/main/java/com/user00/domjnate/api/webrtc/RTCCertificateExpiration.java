package com.user00.domjnate.api.webrtc;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="RTCCertificateExpiration")
public interface RTCCertificateExpiration
{
@JsProperty(name="expires")
Double getExpires();
@JsProperty(name="expires")
void setExpires(Double val);
}
