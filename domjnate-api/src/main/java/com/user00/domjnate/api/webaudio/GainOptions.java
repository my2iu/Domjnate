package com.user00.domjnate.api.webaudio;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="GainOptions")
public interface GainOptions extends AudioNodeOptions
{
@JsProperty(name="gain")
Double getGain();
@JsProperty(name="gain")
void setGain(Double val);
}
