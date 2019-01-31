package com.user00.domjnate.api.webrtc;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="RTCIceCandidatePairStats")
public interface RTCIceCandidatePairStats extends RTCStats
{
@JsProperty(name="availableIncomingBitrate")
Double getAvailableIncomingBitrate();
@JsProperty(name="availableIncomingBitrate")
void setAvailableIncomingBitrate(Double val);
@JsProperty(name="availableOutgoingBitrate")
Double getAvailableOutgoingBitrate();
@JsProperty(name="availableOutgoingBitrate")
void setAvailableOutgoingBitrate(Double val);
@JsProperty(name="bytesReceived")
Double getBytesReceived();
@JsProperty(name="bytesReceived")
void setBytesReceived(Double val);
@JsProperty(name="bytesSent")
Double getBytesSent();
@JsProperty(name="bytesSent")
void setBytesSent(Double val);
@JsProperty(name="localCandidateId")
String getLocalCandidateId();
@JsProperty(name="localCandidateId")
void setLocalCandidateId(String val);
@JsProperty(name="nominated")
Boolean getNominated();
@JsProperty(name="nominated")
void setNominated(Boolean val);
@JsProperty(name="priority")
Double getPriority();
@JsProperty(name="priority")
void setPriority(Double val);
@JsProperty(name="readable")
Boolean getReadable();
@JsProperty(name="readable")
void setReadable(Boolean val);
@JsProperty(name="remoteCandidateId")
String getRemoteCandidateId();
@JsProperty(name="remoteCandidateId")
void setRemoteCandidateId(String val);
@JsProperty(name="roundTripTime")
Double getRoundTripTime();
@JsProperty(name="roundTripTime")
void setRoundTripTime(Double val);
@JsProperty(name="state")
String getState();
@JsProperty(name="state")
void setState(String val);
@JsProperty(name="transportId")
String getTransportId();
@JsProperty(name="transportId")
void setTransportId(String val);
@JsProperty(name="writable")
Boolean getWritable();
@JsProperty(name="writable")
void setWritable(Boolean val);
}
