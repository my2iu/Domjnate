package com.user00.domjnate.api.stream;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="QueuingStrategy")
public interface QueuingStrategy<T> 
{
@JsProperty(name="highWaterMark")
Double getHighWaterMark();
@JsProperty(name="highWaterMark")
void setHighWaterMark(Double val);
@JsProperty(name="size")
QueuingStrategySizeCallback<T> getSize();
@JsProperty(name="size")
void setSize(QueuingStrategySizeCallback<T> val);
}
