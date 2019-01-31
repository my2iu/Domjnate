package com.user00.domjnate.api.webrtc;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="RTCRtpContributingSource")
public interface RTCRtpContributingSource
{
@JsProperty(name="audioLevel")
Double getAudioLevel();
@JsProperty(name="audioLevel")
void setAudioLevel(Double val);
@JsProperty(name="source")
double getSource();
@JsProperty(name="source")
void setSource(double val);
@JsProperty(name="timestamp")
double getTimestamp();
@JsProperty(name="timestamp")
void setTimestamp(double val);
}
