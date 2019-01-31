package com.user00.domjnate.api.webcrypto;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="RsaHashedImportParams")
public interface RsaHashedImportParams extends Algorithm
{
@JsProperty(name="hash")
java.lang.Object getHash();
@JsProperty(name="hash")
void setHash(java.lang.Object val);
}
