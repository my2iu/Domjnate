package com.user00.domjnate.api.webcrypto;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="DhImportKeyParams")
public interface DhImportKeyParams extends Algorithm
{
@JsProperty(name="generator")
com.user00.domjnate.api.Uint8Array getGenerator();
@JsProperty(name="generator")
void setGenerator(com.user00.domjnate.api.Uint8Array val);
@JsProperty(name="prime")
com.user00.domjnate.api.Uint8Array getPrime();
@JsProperty(name="prime")
void setPrime(com.user00.domjnate.api.Uint8Array val);
}
