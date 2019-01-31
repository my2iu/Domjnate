package com.user00.domjnate.api.webrtc;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="RTCIceCandidateDictionary")
public interface RTCIceCandidateDictionary
{
@JsProperty(name="foundation")
String getFoundation();
@JsProperty(name="foundation")
void setFoundation(String val);
@JsProperty(name="ip")
String getIp();
@JsProperty(name="ip")
void setIp(String val);
@JsProperty(name="msMTurnSessionId")
String getMsMTurnSessionId();
@JsProperty(name="msMTurnSessionId")
void setMsMTurnSessionId(String val);
@JsProperty(name="port")
Double getPort();
@JsProperty(name="port")
void setPort(Double val);
@JsProperty(name="priority")
Double getPriority();
@JsProperty(name="priority")
void setPriority(Double val);
@JsProperty(name="protocol")
String getProtocol();
@JsProperty(name="protocol")
void setProtocol(String val);
@JsProperty(name="relatedAddress")
String getRelatedAddress();
@JsProperty(name="relatedAddress")
void setRelatedAddress(String val);
@JsProperty(name="relatedPort")
Double getRelatedPort();
@JsProperty(name="relatedPort")
void setRelatedPort(Double val);
@JsProperty(name="tcpType")
String getTcpType();
@JsProperty(name="tcpType")
void setTcpType(String val);
@JsProperty(name="type")
String getType();
@JsProperty(name="type")
void setType(String val);
}
