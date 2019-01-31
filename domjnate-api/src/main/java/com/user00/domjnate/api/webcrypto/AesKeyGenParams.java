package com.user00.domjnate.api.webcrypto;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="AesKeyGenParams")
public interface AesKeyGenParams extends Algorithm
{
@JsProperty(name="length")
double getLength();
@JsProperty(name="length")
void setLength(double val);
}
