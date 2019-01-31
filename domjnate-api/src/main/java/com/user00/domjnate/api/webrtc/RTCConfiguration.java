package com.user00.domjnate.api.webrtc;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="RTCConfiguration")
public interface RTCConfiguration
{
@JsProperty(name="bundlePolicy")
String getBundlePolicy();
@JsProperty(name="bundlePolicy")
void setBundlePolicy(String val);
@JsProperty(name="certificates")
com.user00.domjnate.api.Array<RTCCertificate> getCertificates();
@JsProperty(name="certificates")
void setCertificates(com.user00.domjnate.api.Array<RTCCertificate> val);
@JsProperty(name="iceCandidatePoolSize")
Double getIceCandidatePoolSize();
@JsProperty(name="iceCandidatePoolSize")
void setIceCandidatePoolSize(Double val);
@JsProperty(name="iceServers")
com.user00.domjnate.api.Array<RTCIceServer> getIceServers();
@JsProperty(name="iceServers")
void setIceServers(com.user00.domjnate.api.Array<RTCIceServer> val);
@JsProperty(name="iceTransportPolicy")
String getIceTransportPolicy();
@JsProperty(name="iceTransportPolicy")
void setIceTransportPolicy(String val);
@JsProperty(name="peerIdentity")
String getPeerIdentity();
@JsProperty(name="peerIdentity")
void setPeerIdentity(String val);
@JsProperty(name="rtcpMuxPolicy")
String getRtcpMuxPolicy();
@JsProperty(name="rtcpMuxPolicy")
void setRtcpMuxPolicy(String val);
}
