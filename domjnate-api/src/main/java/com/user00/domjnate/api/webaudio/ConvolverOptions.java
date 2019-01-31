package com.user00.domjnate.api.webaudio;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="ConvolverOptions")
public interface ConvolverOptions extends AudioNodeOptions
{
@JsProperty(name="buffer")
AudioBuffer getBuffer();
@JsProperty(name="buffer")
void setBuffer(AudioBuffer val);
@JsProperty(name="disableNormalization")
Boolean getDisableNormalization();
@JsProperty(name="disableNormalization")
void setDisableNormalization(Boolean val);
}
