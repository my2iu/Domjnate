package com.user00.domjnate.api.webaudio;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="AudioNodeOptions")
public interface AudioNodeOptions
{
@JsProperty(name="channelCount")
Double getChannelCount();
@JsProperty(name="channelCount")
void setChannelCount(Double val);
@JsProperty(name="channelCountMode")
String getChannelCountMode();
@JsProperty(name="channelCountMode")
void setChannelCountMode(String val);
@JsProperty(name="channelInterpretation")
String getChannelInterpretation();
@JsProperty(name="channelInterpretation")
void setChannelInterpretation(String val);
}
