package com.user00.domjnate.api;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="ElementDefinitionOptions")
public interface ElementDefinitionOptions
{
@JsProperty(name="extends")
String getExtends();
@JsProperty(name="extends")
void setExtends(String val);
}
