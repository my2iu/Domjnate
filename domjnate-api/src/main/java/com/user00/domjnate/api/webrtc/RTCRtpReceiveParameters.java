package com.user00.domjnate.api.webrtc;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="RTCRtpReceiveParameters")
public interface RTCRtpReceiveParameters extends RTCRtpParameters
{
@JsProperty(name="encodings")
com.user00.domjnate.api.Array<RTCRtpDecodingParameters> getEncodings();
@JsProperty(name="encodings")
void setEncodings(com.user00.domjnate.api.Array<RTCRtpDecodingParameters> val);
}
