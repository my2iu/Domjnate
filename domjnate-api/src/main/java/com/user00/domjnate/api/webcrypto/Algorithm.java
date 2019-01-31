package com.user00.domjnate.api.webcrypto;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="Algorithm")
public interface Algorithm
{
@JsProperty(name="name")
String getName();
@JsProperty(name="name")
void setName(String val);
}
