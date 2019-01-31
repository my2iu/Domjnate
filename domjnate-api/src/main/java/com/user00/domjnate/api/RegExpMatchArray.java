package com.user00.domjnate.api;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="RegExpMatchArray")
public interface RegExpMatchArray extends Array<String>
{
@JsProperty(name="index")
Double getIndex();
@JsProperty(name="index")
void setIndex(Double val);
@JsProperty(name="input")
String getInput();
@JsProperty(name="input")
void setInput(String val);
}
