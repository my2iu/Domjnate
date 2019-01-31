package com.user00.domjnate.api.webaudio;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="WaveShaperOptions")
public interface WaveShaperOptions extends AudioNodeOptions
{
@JsProperty(name="curve")
java.lang.Object getCurve();
@JsProperty(name="curve")
void setCurve(java.lang.Object val);
@JsProperty(name="oversample")
String getOversample();
@JsProperty(name="oversample")
void setOversample(String val);
}
