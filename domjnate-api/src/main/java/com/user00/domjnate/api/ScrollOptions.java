package com.user00.domjnate.api;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="ScrollOptions")
public interface ScrollOptions
{
@JsProperty(name="behavior")
String getBehavior();
@JsProperty(name="behavior")
void setBehavior(String val);
}
