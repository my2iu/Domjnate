package com.user00.domjnate.api.webcrypto;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="AesCfbParams")
public interface AesCfbParams extends Algorithm
{
@JsProperty(name="iv")
java.lang.Object getIv();
@JsProperty(name="iv")
void setIv(java.lang.Object val);
}
