package com.user00.domjnate.api.webcrypto;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="EcdhKeyDeriveParams")
public interface EcdhKeyDeriveParams extends Algorithm
{
@JsProperty(name="public")
CryptoKey getPublic();
@JsProperty(name="public")
void setPublic(CryptoKey val);
}
