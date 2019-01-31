package com.user00.domjnate.api;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="RegExpExecArray")
public interface RegExpExecArray extends Array<String>
{
@JsProperty(name="index")
double getIndex();
@JsProperty(name="index")
void setIndex(double val);
@JsProperty(name="input")
String getInput();
@JsProperty(name="input")
void setInput(String val);
}
