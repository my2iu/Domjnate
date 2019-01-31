package com.user00.domjnate.api.webrtc;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="RTCRtpParameters")
public interface RTCRtpParameters
{
@JsProperty(name="codecs")
com.user00.domjnate.api.Array<RTCRtpCodecParameters> getCodecs();
@JsProperty(name="codecs")
void setCodecs(com.user00.domjnate.api.Array<RTCRtpCodecParameters> val);
@JsProperty(name="headerExtensions")
com.user00.domjnate.api.Array<RTCRtpHeaderExtensionParameters> getHeaderExtensions();
@JsProperty(name="headerExtensions")
void setHeaderExtensions(com.user00.domjnate.api.Array<RTCRtpHeaderExtensionParameters> val);
@JsProperty(name="rtcp")
RTCRtcpParameters getRtcp();
@JsProperty(name="rtcp")
void setRtcp(RTCRtcpParameters val);
}
