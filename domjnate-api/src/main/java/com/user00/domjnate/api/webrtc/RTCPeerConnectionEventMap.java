package com.user00.domjnate.api.webrtc;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="RTCPeerConnectionEventMap")
public interface RTCPeerConnectionEventMap
{
@JsProperty(name="connectionstatechange")
com.user00.domjnate.api.dom.Event getConnectionstatechange();
@JsProperty(name="connectionstatechange")
void setConnectionstatechange(com.user00.domjnate.api.dom.Event val);
@JsProperty(name="datachannel")
RTCDataChannelEvent getDatachannel();
@JsProperty(name="datachannel")
void setDatachannel(RTCDataChannelEvent val);
@JsProperty(name="icecandidate")
RTCPeerConnectionIceEvent getIcecandidate();
@JsProperty(name="icecandidate")
void setIcecandidate(RTCPeerConnectionIceEvent val);
@JsProperty(name="icecandidateerror")
RTCPeerConnectionIceErrorEvent getIcecandidateerror();
@JsProperty(name="icecandidateerror")
void setIcecandidateerror(RTCPeerConnectionIceErrorEvent val);
@JsProperty(name="iceconnectionstatechange")
com.user00.domjnate.api.dom.Event getIceconnectionstatechange();
@JsProperty(name="iceconnectionstatechange")
void setIceconnectionstatechange(com.user00.domjnate.api.dom.Event val);
@JsProperty(name="icegatheringstatechange")
com.user00.domjnate.api.dom.Event getIcegatheringstatechange();
@JsProperty(name="icegatheringstatechange")
void setIcegatheringstatechange(com.user00.domjnate.api.dom.Event val);
@JsProperty(name="negotiationneeded")
com.user00.domjnate.api.dom.Event getNegotiationneeded();
@JsProperty(name="negotiationneeded")
void setNegotiationneeded(com.user00.domjnate.api.dom.Event val);
@JsProperty(name="signalingstatechange")
com.user00.domjnate.api.dom.Event getSignalingstatechange();
@JsProperty(name="signalingstatechange")
void setSignalingstatechange(com.user00.domjnate.api.dom.Event val);
@JsProperty(name="statsended")
RTCStatsEvent getStatsended();
@JsProperty(name="statsended")
void setStatsended(RTCStatsEvent val);
@JsProperty(name="track")
RTCTrackEvent getTrack();
@JsProperty(name="track")
void setTrack(RTCTrackEvent val);
}
