package com.user00.domjnate.api.mediastream;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="ConstrainLongRange")
public interface ConstrainLongRange extends LongRange
{
@JsProperty(name="exact")
Double getExact();
@JsProperty(name="exact")
void setExact(Double val);
@JsProperty(name="ideal")
Double getIdeal();
@JsProperty(name="ideal")
void setIdeal(Double val);
}
