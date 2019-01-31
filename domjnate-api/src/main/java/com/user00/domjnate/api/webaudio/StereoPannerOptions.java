package com.user00.domjnate.api.webaudio;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="StereoPannerOptions")
public interface StereoPannerOptions extends AudioNodeOptions
{
@JsProperty(name="pan")
Double getPan();
@JsProperty(name="pan")
void setPan(Double val);
}
