package com.user00.domjnate.api.webaudio;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="OscillatorOptions")
public interface OscillatorOptions extends AudioNodeOptions
{
@JsProperty(name="detune")
Double getDetune();
@JsProperty(name="detune")
void setDetune(Double val);
@JsProperty(name="frequency")
Double getFrequency();
@JsProperty(name="frequency")
void setFrequency(Double val);
@JsProperty(name="periodicWave")
PeriodicWave getPeriodicWave();
@JsProperty(name="periodicWave")
void setPeriodicWave(PeriodicWave val);
@JsProperty(name="type")
String getType();
@JsProperty(name="type")
void setType(String val);
}
