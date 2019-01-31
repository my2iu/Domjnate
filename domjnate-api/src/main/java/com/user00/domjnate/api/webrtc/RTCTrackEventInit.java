package com.user00.domjnate.api.webrtc;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="RTCTrackEventInit")
public interface RTCTrackEventInit extends com.user00.domjnate.api.dom.EventInit
{
@JsProperty(name="receiver")
RTCRtpReceiver getReceiver();
@JsProperty(name="receiver")
void setReceiver(RTCRtpReceiver val);
@JsProperty(name="streams")
com.user00.domjnate.api.Array<com.user00.domjnate.api.mediastream.MediaStream> getStreams();
@JsProperty(name="streams")
void setStreams(com.user00.domjnate.api.Array<com.user00.domjnate.api.mediastream.MediaStream> val);
@JsProperty(name="track")
com.user00.domjnate.api.mediastream.MediaStreamTrack getTrack();
@JsProperty(name="track")
void setTrack(com.user00.domjnate.api.mediastream.MediaStreamTrack val);
@JsProperty(name="transceiver")
RTCRtpTransceiver getTransceiver();
@JsProperty(name="transceiver")
void setTransceiver(RTCRtpTransceiver val);
}
