package com.user00.domjnate.api.webcrypto;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="RsaKeyAlgorithm")
public interface RsaKeyAlgorithm extends KeyAlgorithm
{
@JsProperty(name="modulusLength")
double getModulusLength();
@JsProperty(name="modulusLength")
void setModulusLength(double val);
@JsProperty(name="publicExponent")
com.user00.domjnate.api.Uint8Array getPublicExponent();
@JsProperty(name="publicExponent")
void setPublicExponent(com.user00.domjnate.api.Uint8Array val);
}
