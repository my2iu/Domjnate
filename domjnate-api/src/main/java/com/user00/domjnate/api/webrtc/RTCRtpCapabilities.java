package com.user00.domjnate.api.webrtc;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="RTCRtpCapabilities")
public interface RTCRtpCapabilities
{
@JsProperty(name="codecs")
com.user00.domjnate.api.Array<RTCRtpCodecCapability> getCodecs();
@JsProperty(name="codecs")
void setCodecs(com.user00.domjnate.api.Array<RTCRtpCodecCapability> val);
@JsProperty(name="headerExtensions")
com.user00.domjnate.api.Array<RTCRtpHeaderExtensionCapability> getHeaderExtensions();
@JsProperty(name="headerExtensions")
void setHeaderExtensions(com.user00.domjnate.api.Array<RTCRtpHeaderExtensionCapability> val);
}
