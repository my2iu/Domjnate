package com.user00.domjnate.api.webrtc;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="RTCDTMFSenderEventMap")
public interface RTCDTMFSenderEventMap
{
@JsProperty(name="tonechange")
RTCDTMFToneChangeEvent getTonechange();
@JsProperty(name="tonechange")
void setTonechange(RTCDTMFToneChangeEvent val);
}
