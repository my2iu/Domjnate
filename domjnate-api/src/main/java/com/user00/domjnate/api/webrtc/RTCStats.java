package com.user00.domjnate.api.webrtc;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="RTCStats")
public interface RTCStats
{
@JsProperty(name="id")
String getId();
@JsProperty(name="id")
void setId(String val);
@JsProperty(name="timestamp")
double getTimestamp();
@JsProperty(name="timestamp")
void setTimestamp(double val);
@JsProperty(name="type")
String getType();
@JsProperty(name="type")
void setType(String val);
}
