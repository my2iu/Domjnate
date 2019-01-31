package com.user00.domjnate.api.webrtc;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="RTCDTMFToneChangeEventInit")
public interface RTCDTMFToneChangeEventInit extends com.user00.domjnate.api.dom.EventInit
{
@JsProperty(name="tone")
String getTone();
@JsProperty(name="tone")
void setTone(String val);
}
