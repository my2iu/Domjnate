package com.user00.domjnate.api.webcrypto;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="HmacKeyGenParams")
public interface HmacKeyGenParams extends Algorithm
{
@JsProperty(name="hash")
java.lang.Object getHash();
@JsProperty(name="hash")
void setHash(java.lang.Object val);
@JsProperty(name="length")
Double getLength();
@JsProperty(name="length")
void setLength(Double val);
}
