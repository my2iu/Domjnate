package com.user00.domjnate.api.stream;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="ReadableByteStreamController")
public interface ReadableByteStreamController
{
@JsProperty(name="byobRequest")
java.lang.Object getByobRequest();
@JsProperty(name="desiredSize")
Double getDesiredSize();
@JsMethod(name="close")
void close();
@JsMethod(name="enqueue")
void enqueue(com.user00.domjnate.api.ArrayBufferView chunk);
@JsMethod(name="error")
void error();
@JsMethod(name="error")
void error(java.lang.Object error);
}
