package com.user00.domjnate.api.webrtc;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="RTCMediaStreamTrackStats")
public interface RTCMediaStreamTrackStats extends RTCStats
{
@JsProperty(name="audioLevel")
Double getAudioLevel();
@JsProperty(name="audioLevel")
void setAudioLevel(Double val);
@JsProperty(name="echoReturnLoss")
Double getEchoReturnLoss();
@JsProperty(name="echoReturnLoss")
void setEchoReturnLoss(Double val);
@JsProperty(name="echoReturnLossEnhancement")
Double getEchoReturnLossEnhancement();
@JsProperty(name="echoReturnLossEnhancement")
void setEchoReturnLossEnhancement(Double val);
@JsProperty(name="frameHeight")
Double getFrameHeight();
@JsProperty(name="frameHeight")
void setFrameHeight(Double val);
@JsProperty(name="frameWidth")
Double getFrameWidth();
@JsProperty(name="frameWidth")
void setFrameWidth(Double val);
@JsProperty(name="framesCorrupted")
Double getFramesCorrupted();
@JsProperty(name="framesCorrupted")
void setFramesCorrupted(Double val);
@JsProperty(name="framesDecoded")
Double getFramesDecoded();
@JsProperty(name="framesDecoded")
void setFramesDecoded(Double val);
@JsProperty(name="framesDropped")
Double getFramesDropped();
@JsProperty(name="framesDropped")
void setFramesDropped(Double val);
@JsProperty(name="framesPerSecond")
Double getFramesPerSecond();
@JsProperty(name="framesPerSecond")
void setFramesPerSecond(Double val);
@JsProperty(name="framesReceived")
Double getFramesReceived();
@JsProperty(name="framesReceived")
void setFramesReceived(Double val);
@JsProperty(name="framesSent")
Double getFramesSent();
@JsProperty(name="framesSent")
void setFramesSent(Double val);
@JsProperty(name="remoteSource")
Boolean getRemoteSource();
@JsProperty(name="remoteSource")
void setRemoteSource(Boolean val);
@JsProperty(name="ssrcIds")
com.user00.domjnate.api.Array<String> getSsrcIds();
@JsProperty(name="ssrcIds")
void setSsrcIds(com.user00.domjnate.api.Array<String> val);
@JsProperty(name="trackIdentifier")
String getTrackIdentifier();
@JsProperty(name="trackIdentifier")
void setTrackIdentifier(String val);
}
