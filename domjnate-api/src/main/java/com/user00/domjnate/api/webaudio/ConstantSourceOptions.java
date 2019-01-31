package com.user00.domjnate.api.webaudio;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="ConstantSourceOptions")
public interface ConstantSourceOptions
{
@JsProperty(name="offset")
Double getOffset();
@JsProperty(name="offset")
void setOffset(Double val);
}
