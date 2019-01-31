package com.user00.domjnate.api.webcrypto;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="HmacKeyAlgorithm")
public interface HmacKeyAlgorithm extends KeyAlgorithm
{
@JsProperty(name="hash")
KeyAlgorithm getHash();
@JsProperty(name="hash")
void setHash(KeyAlgorithm val);
@JsProperty(name="length")
double getLength();
@JsProperty(name="length")
void setLength(double val);
}
