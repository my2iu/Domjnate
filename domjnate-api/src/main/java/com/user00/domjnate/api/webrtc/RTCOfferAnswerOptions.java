package com.user00.domjnate.api.webrtc;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="RTCOfferAnswerOptions")
public interface RTCOfferAnswerOptions
{
@JsProperty(name="voiceActivityDetection")
Boolean getVoiceActivityDetection();
@JsProperty(name="voiceActivityDetection")
void setVoiceActivityDetection(Boolean val);
}
