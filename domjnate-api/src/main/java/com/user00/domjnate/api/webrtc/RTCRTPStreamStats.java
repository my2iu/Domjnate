package com.user00.domjnate.api.webrtc;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="RTCRTPStreamStats")
public interface RTCRTPStreamStats extends RTCStats
{
@JsProperty(name="associateStatsId")
String getAssociateStatsId();
@JsProperty(name="associateStatsId")
void setAssociateStatsId(String val);
@JsProperty(name="codecId")
String getCodecId();
@JsProperty(name="codecId")
void setCodecId(String val);
@JsProperty(name="firCount")
Double getFirCount();
@JsProperty(name="firCount")
void setFirCount(Double val);
@JsProperty(name="isRemote")
Boolean getIsRemote();
@JsProperty(name="isRemote")
void setIsRemote(Boolean val);
@JsProperty(name="mediaTrackId")
String getMediaTrackId();
@JsProperty(name="mediaTrackId")
void setMediaTrackId(String val);
@JsProperty(name="mediaType")
String getMediaType();
@JsProperty(name="mediaType")
void setMediaType(String val);
@JsProperty(name="nackCount")
Double getNackCount();
@JsProperty(name="nackCount")
void setNackCount(Double val);
@JsProperty(name="pliCount")
Double getPliCount();
@JsProperty(name="pliCount")
void setPliCount(Double val);
@JsProperty(name="sliCount")
Double getSliCount();
@JsProperty(name="sliCount")
void setSliCount(Double val);
@JsProperty(name="ssrc")
String getSsrc();
@JsProperty(name="ssrc")
void setSsrc(String val);
@JsProperty(name="transportId")
String getTransportId();
@JsProperty(name="transportId")
void setTransportId(String val);
}
