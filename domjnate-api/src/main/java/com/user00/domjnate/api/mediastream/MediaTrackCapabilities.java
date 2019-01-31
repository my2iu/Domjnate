package com.user00.domjnate.api.mediastream;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="MediaTrackCapabilities")
public interface MediaTrackCapabilities
{
@JsProperty(name="aspectRatio")
java.lang.Object getAspectRatio();
@JsProperty(name="aspectRatio")
void setAspectRatio(java.lang.Object val);
@JsProperty(name="deviceId")
String getDeviceId();
@JsProperty(name="deviceId")
void setDeviceId(String val);
@JsProperty(name="echoCancellation")
com.user00.domjnate.api.Array<Boolean> getEchoCancellation();
@JsProperty(name="echoCancellation")
void setEchoCancellation(com.user00.domjnate.api.Array<Boolean> val);
@JsProperty(name="facingMode")
String getFacingMode();
@JsProperty(name="facingMode")
void setFacingMode(String val);
@JsProperty(name="frameRate")
java.lang.Object getFrameRate();
@JsProperty(name="frameRate")
void setFrameRate(java.lang.Object val);
@JsProperty(name="groupId")
String getGroupId();
@JsProperty(name="groupId")
void setGroupId(String val);
@JsProperty(name="height")
java.lang.Object getHeight();
@JsProperty(name="height")
void setHeight(java.lang.Object val);
@JsProperty(name="sampleRate")
java.lang.Object getSampleRate();
@JsProperty(name="sampleRate")
void setSampleRate(java.lang.Object val);
@JsProperty(name="sampleSize")
java.lang.Object getSampleSize();
@JsProperty(name="sampleSize")
void setSampleSize(java.lang.Object val);
@JsProperty(name="volume")
java.lang.Object getVolume();
@JsProperty(name="volume")
void setVolume(java.lang.Object val);
@JsProperty(name="width")
java.lang.Object getWidth();
@JsProperty(name="width")
void setWidth(java.lang.Object val);
}
