package com.user00.domjnate.api.webaudio;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="ChannelSplitterOptions")
public interface ChannelSplitterOptions extends AudioNodeOptions
{
@JsProperty(name="numberOfOutputs")
Double getNumberOfOutputs();
@JsProperty(name="numberOfOutputs")
void setNumberOfOutputs(Double val);
}
