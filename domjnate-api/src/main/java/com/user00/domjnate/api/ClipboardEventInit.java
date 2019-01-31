package com.user00.domjnate.api;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="ClipboardEventInit")
public interface ClipboardEventInit extends com.user00.domjnate.api.dom.EventInit
{
@JsProperty(name="data")
String getData();
@JsProperty(name="data")
void setData(String val);
@JsProperty(name="dataType")
String getDataType();
@JsProperty(name="dataType")
void setDataType(String val);
}
