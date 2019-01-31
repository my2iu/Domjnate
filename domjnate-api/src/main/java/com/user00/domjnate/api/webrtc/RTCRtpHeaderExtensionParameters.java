package com.user00.domjnate.api.webrtc;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="RTCRtpHeaderExtensionParameters")
public interface RTCRtpHeaderExtensionParameters
{
@JsProperty(name="encrypted")
Boolean getEncrypted();
@JsProperty(name="encrypted")
void setEncrypted(Boolean val);
@JsProperty(name="id")
double getId();
@JsProperty(name="id")
void setId(double val);
@JsProperty(name="uri")
String getUri();
@JsProperty(name="uri")
void setUri(String val);
}
