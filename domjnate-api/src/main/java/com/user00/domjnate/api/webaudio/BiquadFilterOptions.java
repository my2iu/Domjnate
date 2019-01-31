package com.user00.domjnate.api.webaudio;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="BiquadFilterOptions")
public interface BiquadFilterOptions extends AudioNodeOptions
{
@JsProperty(name="Q")
Double getQ();
@JsProperty(name="Q")
void setQ(Double val);
@JsProperty(name="detune")
Double getDetune();
@JsProperty(name="detune")
void setDetune(Double val);
@JsProperty(name="frequency")
Double getFrequency();
@JsProperty(name="frequency")
void setFrequency(Double val);
@JsProperty(name="gain")
Double getGain();
@JsProperty(name="gain")
void setGain(Double val);
@JsProperty(name="type")
String getType();
@JsProperty(name="type")
void setType(String val);
}
