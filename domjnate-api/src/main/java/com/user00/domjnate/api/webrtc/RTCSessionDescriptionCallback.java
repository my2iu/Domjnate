package com.user00.domjnate.api.webrtc;

import jsinterop.annotations.JsFunction;

@JsFunction
public interface RTCSessionDescriptionCallback
{
void accept(RTCSessionDescriptionInit description);
}
