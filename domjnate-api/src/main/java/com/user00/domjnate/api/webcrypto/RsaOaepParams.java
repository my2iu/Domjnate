package com.user00.domjnate.api.webcrypto;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="RsaOaepParams")
public interface RsaOaepParams extends Algorithm
{
@JsProperty(name="label")
java.lang.Object getLabel();
@JsProperty(name="label")
void setLabel(java.lang.Object val);
}
