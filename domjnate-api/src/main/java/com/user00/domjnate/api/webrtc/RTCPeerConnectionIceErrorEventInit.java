package com.user00.domjnate.api.webrtc;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="RTCPeerConnectionIceErrorEventInit")
public interface RTCPeerConnectionIceErrorEventInit extends com.user00.domjnate.api.dom.EventInit
{
@JsProperty(name="errorCode")
double getErrorCode();
@JsProperty(name="errorCode")
void setErrorCode(double val);
@JsProperty(name="hostCandidate")
String getHostCandidate();
@JsProperty(name="hostCandidate")
void setHostCandidate(String val);
@JsProperty(name="statusText")
String getStatusText();
@JsProperty(name="statusText")
void setStatusText(String val);
@JsProperty(name="url")
String getUrl();
@JsProperty(name="url")
void setUrl(String val);
}
