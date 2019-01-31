package com.user00.domjnate.api;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="ScrollIntoViewOptions")
public interface ScrollIntoViewOptions extends ScrollOptions
{
@JsProperty(name="block")
String getBlock();
@JsProperty(name="block")
void setBlock(String val);
@JsProperty(name="inline")
String getInline();
@JsProperty(name="inline")
void setInline(String val);
}
