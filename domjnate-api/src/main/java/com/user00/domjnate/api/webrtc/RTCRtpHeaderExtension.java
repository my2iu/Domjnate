package com.user00.domjnate.api.webrtc;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="RTCRtpHeaderExtension")
public interface RTCRtpHeaderExtension
{
@JsProperty(name="kind")
String getKind();
@JsProperty(name="kind")
void setKind(String val);
@JsProperty(name="preferredEncrypt")
Boolean getPreferredEncrypt();
@JsProperty(name="preferredEncrypt")
void setPreferredEncrypt(Boolean val);
@JsProperty(name="preferredId")
Double getPreferredId();
@JsProperty(name="preferredId")
void setPreferredId(Double val);
@JsProperty(name="uri")
String getUri();
@JsProperty(name="uri")
void setUri(String val);
}
