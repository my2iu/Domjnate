package com.user00.domjnate.api.webrtc;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="RTCIceCandidateAttributes")
public interface RTCIceCandidateAttributes extends RTCStats
{
@JsProperty(name="addressSourceUrl")
String getAddressSourceUrl();
@JsProperty(name="addressSourceUrl")
void setAddressSourceUrl(String val);
@JsProperty(name="candidateType")
String getCandidateType();
@JsProperty(name="candidateType")
void setCandidateType(String val);
@JsProperty(name="ipAddress")
String getIpAddress();
@JsProperty(name="ipAddress")
void setIpAddress(String val);
@JsProperty(name="portNumber")
Double getPortNumber();
@JsProperty(name="portNumber")
void setPortNumber(Double val);
@JsProperty(name="priority")
Double getPriority();
@JsProperty(name="priority")
void setPriority(Double val);
@JsProperty(name="transport")
String getTransport();
@JsProperty(name="transport")
void setTransport(String val);
}
