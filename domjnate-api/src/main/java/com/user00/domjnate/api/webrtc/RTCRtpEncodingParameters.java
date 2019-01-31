package com.user00.domjnate.api.webrtc;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="RTCRtpEncodingParameters")
public interface RTCRtpEncodingParameters extends RTCRtpCodingParameters
{
@JsProperty(name="active")
Boolean getActive();
@JsProperty(name="active")
void setActive(Boolean val);
@JsProperty(name="codecPayloadType")
Double getCodecPayloadType();
@JsProperty(name="codecPayloadType")
void setCodecPayloadType(Double val);
@JsProperty(name="dtx")
String getDtx();
@JsProperty(name="dtx")
void setDtx(String val);
@JsProperty(name="maxBitrate")
Double getMaxBitrate();
@JsProperty(name="maxBitrate")
void setMaxBitrate(Double val);
@JsProperty(name="maxFramerate")
Double getMaxFramerate();
@JsProperty(name="maxFramerate")
void setMaxFramerate(Double val);
@JsProperty(name="priority")
String getPriority();
@JsProperty(name="priority")
void setPriority(String val);
@JsProperty(name="ptime")
Double getPtime();
@JsProperty(name="ptime")
void setPtime(Double val);
@JsProperty(name="scaleResolutionDownBy")
Double getScaleResolutionDownBy();
@JsProperty(name="scaleResolutionDownBy")
void setScaleResolutionDownBy(Double val);
}
