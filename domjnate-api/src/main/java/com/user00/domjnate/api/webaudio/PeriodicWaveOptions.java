package com.user00.domjnate.api.webaudio;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="PeriodicWaveOptions")
public interface PeriodicWaveOptions extends PeriodicWaveConstraints
{
@JsProperty(name="imag")
java.lang.Object getImag();
@JsProperty(name="imag")
void setImag(java.lang.Object val);
@JsProperty(name="real")
java.lang.Object getReal();
@JsProperty(name="real")
void setReal(java.lang.Object val);
}
