package com.user00.domjnate.api;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="ScopedCredentialParameters")
public interface ScopedCredentialParameters
{
@JsProperty(name="algorithm")
java.lang.Object getAlgorithm();
@JsProperty(name="algorithm")
void setAlgorithm(java.lang.Object val);
@JsProperty(name="type")
String getType();
@JsProperty(name="type")
void setType(String val);
}
