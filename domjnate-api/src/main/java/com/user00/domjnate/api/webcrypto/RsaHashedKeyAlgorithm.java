package com.user00.domjnate.api.webcrypto;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="RsaHashedKeyAlgorithm")
public interface RsaHashedKeyAlgorithm extends RsaKeyAlgorithm
{
@JsProperty(name="hash")
KeyAlgorithm getHash();
@JsProperty(name="hash")
void setHash(KeyAlgorithm val);
}
