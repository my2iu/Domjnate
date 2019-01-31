package com.user00.domjnate.api.webaudio;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="DelayOptions")
public interface DelayOptions extends AudioNodeOptions
{
@JsProperty(name="delayTime")
Double getDelayTime();
@JsProperty(name="delayTime")
void setDelayTime(Double val);
@JsProperty(name="maxDelayTime")
Double getMaxDelayTime();
@JsProperty(name="maxDelayTime")
void setMaxDelayTime(Double val);
}
