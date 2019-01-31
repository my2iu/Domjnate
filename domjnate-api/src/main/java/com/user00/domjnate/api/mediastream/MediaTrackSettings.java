package com.user00.domjnate.api.mediastream;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="MediaTrackSettings")
public interface MediaTrackSettings
{
@JsProperty(name="aspectRatio")
Double getAspectRatio();
@JsProperty(name="aspectRatio")
void setAspectRatio(Double val);
@JsProperty(name="deviceId")
String getDeviceId();
@JsProperty(name="deviceId")
void setDeviceId(String val);
@JsProperty(name="echoCancellation")
Boolean getEchoCancellation();
@JsProperty(name="echoCancellation")
void setEchoCancellation(Boolean val);
@JsProperty(name="facingMode")
String getFacingMode();
@JsProperty(name="facingMode")
void setFacingMode(String val);
@JsProperty(name="frameRate")
Double getFrameRate();
@JsProperty(name="frameRate")
void setFrameRate(Double val);
@JsProperty(name="groupId")
String getGroupId();
@JsProperty(name="groupId")
void setGroupId(String val);
@JsProperty(name="height")
Double getHeight();
@JsProperty(name="height")
void setHeight(Double val);
@JsProperty(name="sampleRate")
Double getSampleRate();
@JsProperty(name="sampleRate")
void setSampleRate(Double val);
@JsProperty(name="sampleSize")
Double getSampleSize();
@JsProperty(name="sampleSize")
void setSampleSize(Double val);
@JsProperty(name="volume")
Double getVolume();
@JsProperty(name="volume")
void setVolume(Double val);
@JsProperty(name="width")
Double getWidth();
@JsProperty(name="width")
void setWidth(Double val);
}
