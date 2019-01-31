package com.user00.domjnate.api.webrtc;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="RTCIceGatherOptions")
public interface RTCIceGatherOptions
{
@JsProperty(name="gatherPolicy")
String getGatherPolicy();
@JsProperty(name="gatherPolicy")
void setGatherPolicy(String val);
@JsProperty(name="iceservers")
com.user00.domjnate.api.Array<RTCIceServer> getIceservers();
@JsProperty(name="iceservers")
void setIceservers(com.user00.domjnate.api.Array<RTCIceServer> val);
}
