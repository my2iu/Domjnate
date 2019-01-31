package com.user00.domjnate.api;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="ExceptionInformation")
public interface ExceptionInformation
{
@JsProperty(name="domain")
String getDomain();
@JsProperty(name="domain")
void setDomain(String val);
}
