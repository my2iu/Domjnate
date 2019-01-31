package com.user00.domjnate.api.dom;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="ElementCreationOptions")
public interface ElementCreationOptions
{
@JsProperty(name="is")
String getIs();
@JsProperty(name="is")
void setIs(String val);
}
