package com.user00.domjnate.api.webrtc;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="RTCRtpRtxParameters")
public interface RTCRtpRtxParameters
{
@JsProperty(name="ssrc")
Double getSsrc();
@JsProperty(name="ssrc")
void setSsrc(Double val);
}
