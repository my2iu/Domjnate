package com.user00.domjnate.api.mediastream;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="MediaTrackSupportedConstraints")
public interface MediaTrackSupportedConstraints
{
@JsProperty(name="aspectRatio")
Boolean getAspectRatio();
@JsProperty(name="aspectRatio")
void setAspectRatio(Boolean val);
@JsProperty(name="deviceId")
Boolean getDeviceId();
@JsProperty(name="deviceId")
void setDeviceId(Boolean val);
@JsProperty(name="echoCancellation")
Boolean getEchoCancellation();
@JsProperty(name="echoCancellation")
void setEchoCancellation(Boolean val);
@JsProperty(name="facingMode")
Boolean getFacingMode();
@JsProperty(name="facingMode")
void setFacingMode(Boolean val);
@JsProperty(name="frameRate")
Boolean getFrameRate();
@JsProperty(name="frameRate")
void setFrameRate(Boolean val);
@JsProperty(name="groupId")
Boolean getGroupId();
@JsProperty(name="groupId")
void setGroupId(Boolean val);
@JsProperty(name="height")
Boolean getHeight();
@JsProperty(name="height")
void setHeight(Boolean val);
@JsProperty(name="sampleRate")
Boolean getSampleRate();
@JsProperty(name="sampleRate")
void setSampleRate(Boolean val);
@JsProperty(name="sampleSize")
Boolean getSampleSize();
@JsProperty(name="sampleSize")
void setSampleSize(Boolean val);
@JsProperty(name="volume")
Boolean getVolume();
@JsProperty(name="volume")
void setVolume(Boolean val);
@JsProperty(name="width")
Boolean getWidth();
@JsProperty(name="width")
void setWidth(Boolean val);
}
