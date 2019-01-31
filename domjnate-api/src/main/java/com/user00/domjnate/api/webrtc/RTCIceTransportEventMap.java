package com.user00.domjnate.api.webrtc;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="RTCIceTransportEventMap")
public interface RTCIceTransportEventMap
{
@JsProperty(name="gatheringstatechange")
com.user00.domjnate.api.dom.Event getGatheringstatechange();
@JsProperty(name="gatheringstatechange")
void setGatheringstatechange(com.user00.domjnate.api.dom.Event val);
@JsProperty(name="selectedcandidatepairchange")
com.user00.domjnate.api.dom.Event getSelectedcandidatepairchange();
@JsProperty(name="selectedcandidatepairchange")
void setSelectedcandidatepairchange(com.user00.domjnate.api.dom.Event val);
@JsProperty(name="statechange")
com.user00.domjnate.api.dom.Event getStatechange();
@JsProperty(name="statechange")
void setStatechange(com.user00.domjnate.api.dom.Event val);
}
