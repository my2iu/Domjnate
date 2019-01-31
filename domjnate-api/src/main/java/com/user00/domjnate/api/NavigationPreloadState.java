package com.user00.domjnate.api;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="NavigationPreloadState")
public interface NavigationPreloadState
{
@JsProperty(name="enabled")
Boolean getEnabled();
@JsProperty(name="enabled")
void setEnabled(Boolean val);
@JsProperty(name="headerValue")
String getHeaderValue();
@JsProperty(name="headerValue")
void setHeaderValue(String val);
}
