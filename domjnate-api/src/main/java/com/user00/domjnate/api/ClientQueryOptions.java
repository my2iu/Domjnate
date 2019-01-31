package com.user00.domjnate.api;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="ClientQueryOptions")
public interface ClientQueryOptions
{
@JsProperty(name="includeUncontrolled")
Boolean getIncludeUncontrolled();
@JsProperty(name="includeUncontrolled")
void setIncludeUncontrolled(Boolean val);
@JsProperty(name="type")
String getType();
@JsProperty(name="type")
void setType(String val);
}
