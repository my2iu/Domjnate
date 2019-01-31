package com.user00.domjnate.api.webrtc;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="RTCRtpTransceiverInit")
public interface RTCRtpTransceiverInit
{
@JsProperty(name="direction")
String getDirection();
@JsProperty(name="direction")
void setDirection(String val);
@JsProperty(name="sendEncodings")
com.user00.domjnate.api.Array<RTCRtpEncodingParameters> getSendEncodings();
@JsProperty(name="sendEncodings")
void setSendEncodings(com.user00.domjnate.api.Array<RTCRtpEncodingParameters> val);
@JsProperty(name="streams")
com.user00.domjnate.api.Array<com.user00.domjnate.api.mediastream.MediaStream> getStreams();
@JsProperty(name="streams")
void setStreams(com.user00.domjnate.api.Array<com.user00.domjnate.api.mediastream.MediaStream> val);
}
