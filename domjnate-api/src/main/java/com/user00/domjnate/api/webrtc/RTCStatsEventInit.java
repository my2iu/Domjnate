package com.user00.domjnate.api.webrtc;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="RTCStatsEventInit")
public interface RTCStatsEventInit extends com.user00.domjnate.api.dom.EventInit
{
@JsProperty(name="report")
RTCStatsReport getReport();
@JsProperty(name="report")
void setReport(RTCStatsReport val);
}
