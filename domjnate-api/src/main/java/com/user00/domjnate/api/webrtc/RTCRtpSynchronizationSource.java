package com.user00.domjnate.api.webrtc;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="RTCRtpSynchronizationSource")
public interface RTCRtpSynchronizationSource extends RTCRtpContributingSource
{
@JsProperty(name="voiceActivityFlag")
Boolean getVoiceActivityFlag();
@JsProperty(name="voiceActivityFlag")
void setVoiceActivityFlag(Boolean val);
}
