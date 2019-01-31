package com.user00.domjnate.api.webaudio;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="DynamicsCompressorOptions")
public interface DynamicsCompressorOptions extends AudioNodeOptions
{
@JsProperty(name="attack")
Double getAttack();
@JsProperty(name="attack")
void setAttack(Double val);
@JsProperty(name="knee")
Double getKnee();
@JsProperty(name="knee")
void setKnee(Double val);
@JsProperty(name="ratio")
Double getRatio();
@JsProperty(name="ratio")
void setRatio(Double val);
@JsProperty(name="release")
Double getRelease();
@JsProperty(name="release")
void setRelease(Double val);
@JsProperty(name="threshold")
Double getThreshold();
@JsProperty(name="threshold")
void setThreshold(Double val);
}
