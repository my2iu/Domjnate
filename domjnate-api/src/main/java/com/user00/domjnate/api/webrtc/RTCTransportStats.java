package com.user00.domjnate.api.webrtc;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="RTCTransportStats")
public interface RTCTransportStats extends RTCStats
{
@JsProperty(name="activeConnection")
Boolean getActiveConnection();
@JsProperty(name="activeConnection")
void setActiveConnection(Boolean val);
@JsProperty(name="bytesReceived")
Double getBytesReceived();
@JsProperty(name="bytesReceived")
void setBytesReceived(Double val);
@JsProperty(name="bytesSent")
Double getBytesSent();
@JsProperty(name="bytesSent")
void setBytesSent(Double val);
@JsProperty(name="localCertificateId")
String getLocalCertificateId();
@JsProperty(name="localCertificateId")
void setLocalCertificateId(String val);
@JsProperty(name="remoteCertificateId")
String getRemoteCertificateId();
@JsProperty(name="remoteCertificateId")
void setRemoteCertificateId(String val);
@JsProperty(name="rtcpTransportStatsId")
String getRtcpTransportStatsId();
@JsProperty(name="rtcpTransportStatsId")
void setRtcpTransportStatsId(String val);
@JsProperty(name="selectedCandidatePairId")
String getSelectedCandidatePairId();
@JsProperty(name="selectedCandidatePairId")
void setSelectedCandidatePairId(String val);
}
