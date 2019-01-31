package com.user00.domjnate.api;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="StorageEstimate")
public interface StorageEstimate
{
@JsProperty(name="quota")
Double getQuota();
@JsProperty(name="quota")
void setQuota(Double val);
@JsProperty(name="usage")
Double getUsage();
@JsProperty(name="usage")
void setUsage(Double val);
}
