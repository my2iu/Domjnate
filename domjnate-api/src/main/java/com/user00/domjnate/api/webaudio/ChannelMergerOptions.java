package com.user00.domjnate.api.webaudio;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="ChannelMergerOptions")
public interface ChannelMergerOptions extends AudioNodeOptions
{
@JsProperty(name="numberOfInputs")
Double getNumberOfInputs();
@JsProperty(name="numberOfInputs")
void setNumberOfInputs(Double val);
}
