package com.user00.domjnate.api;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="CompositionEventInit")
public interface CompositionEventInit extends UIEventInit
{
@JsProperty(name="data")
String getData();
@JsProperty(name="data")
void setData(String val);
}
