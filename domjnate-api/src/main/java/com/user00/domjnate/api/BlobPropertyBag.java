package com.user00.domjnate.api;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="BlobPropertyBag")
public interface BlobPropertyBag
{
@JsProperty(name="endings")
String getEndings();
@JsProperty(name="endings")
void setEndings(String val);
@JsProperty(name="type")
String getType();
@JsProperty(name="type")
void setType(String val);
}
