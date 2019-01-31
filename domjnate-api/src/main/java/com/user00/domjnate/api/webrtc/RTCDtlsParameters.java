package com.user00.domjnate.api.webrtc;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="RTCDtlsParameters")
public interface RTCDtlsParameters
{
@JsProperty(name="fingerprints")
com.user00.domjnate.api.Array<RTCDtlsFingerprint> getFingerprints();
@JsProperty(name="fingerprints")
void setFingerprints(com.user00.domjnate.api.Array<RTCDtlsFingerprint> val);
@JsProperty(name="role")
String getRole();
@JsProperty(name="role")
void setRole(String val);
}
