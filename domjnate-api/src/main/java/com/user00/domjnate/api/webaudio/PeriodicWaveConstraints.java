package com.user00.domjnate.api.webaudio;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="PeriodicWaveConstraints")
public interface PeriodicWaveConstraints
{
@JsProperty(name="disableNormalization")
Boolean getDisableNormalization();
@JsProperty(name="disableNormalization")
void setDisableNormalization(Boolean val);
}
