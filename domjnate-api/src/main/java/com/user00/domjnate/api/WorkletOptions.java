package com.user00.domjnate.api;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="WorkletOptions")
public interface WorkletOptions
{
@JsProperty(name="credentials")
String getCredentials();
@JsProperty(name="credentials")
void setCredentials(String val);
}
