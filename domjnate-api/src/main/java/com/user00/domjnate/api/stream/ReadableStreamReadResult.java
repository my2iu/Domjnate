package com.user00.domjnate.api.stream;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="ReadableStreamReadResult")
public interface ReadableStreamReadResult<T> 
{
@JsProperty(name="done")
boolean getDone();
@JsProperty(name="done")
void setDone(boolean val);
@JsProperty(name="value")
T getValue();
@JsProperty(name="value")
void setValue(T val);
}
