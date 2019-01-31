package com.user00.domjnate.api.webcrypto;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="RsaPssParams")
public interface RsaPssParams extends Algorithm
{
@JsProperty(name="saltLength")
double getSaltLength();
@JsProperty(name="saltLength")
void setSaltLength(double val);
}
