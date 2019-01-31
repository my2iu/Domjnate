package com.user00.domjnate.api.webrtc;

import jsinterop.annotations.JsFunction;

@JsFunction
public interface RTCStatsCallback
{
void accept(RTCStatsReport report);
}
