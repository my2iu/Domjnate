package com.user00.domjnate.api.webrtc;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="RTCRtpSendParameters")
public interface RTCRtpSendParameters extends RTCRtpParameters
{
@JsProperty(name="degradationPreference")
String getDegradationPreference();
@JsProperty(name="degradationPreference")
void setDegradationPreference(String val);
@JsProperty(name="encodings")
com.user00.domjnate.api.Array<RTCRtpEncodingParameters> getEncodings();
@JsProperty(name="encodings")
void setEncodings(com.user00.domjnate.api.Array<RTCRtpEncodingParameters> val);
@JsProperty(name="transactionId")
String getTransactionId();
@JsProperty(name="transactionId")
void setTransactionId(String val);
}
