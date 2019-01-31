package com.user00.domjnate.api.webcrypto;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="KeyAlgorithm")
public interface KeyAlgorithm
{
@JsProperty(name="name")
String getName();
@JsProperty(name="name")
void setName(String val);
}
