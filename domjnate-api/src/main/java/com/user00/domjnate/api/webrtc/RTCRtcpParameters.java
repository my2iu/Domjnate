package com.user00.domjnate.api.webrtc;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="RTCRtcpParameters")
public interface RTCRtcpParameters
{
@JsProperty(name="cname")
String getCname();
@JsProperty(name="cname")
void setCname(String val);
@JsProperty(name="reducedSize")
Boolean getReducedSize();
@JsProperty(name="reducedSize")
void setReducedSize(Boolean val);
}
