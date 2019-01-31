package com.user00.domjnate.api.mediastream;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="LongRange")
public interface LongRange
{
@JsProperty(name="max")
Double getMax();
@JsProperty(name="max")
void setMax(Double val);
@JsProperty(name="min")
Double getMin();
@JsProperty(name="min")
void setMin(Double val);
}
