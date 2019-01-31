package com.user00.domjnate.api.webrtc;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="RTCDtlsFingerprint")
public interface RTCDtlsFingerprint
{
@JsProperty(name="algorithm")
String getAlgorithm();
@JsProperty(name="algorithm")
void setAlgorithm(String val);
@JsProperty(name="value")
String getValue();
@JsProperty(name="value")
void setValue(String val);
}
