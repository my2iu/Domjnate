package com.user00.domjnate.api.stream;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="ReadableStreamDefaultController")
public interface ReadableStreamDefaultController<R> 
{
@JsProperty(name="desiredSize")
Double getDesiredSize();
@JsMethod(name="close")
void close();
@JsMethod(name="enqueue")
void enqueue(R chunk);
@JsMethod(name="error")
void error();
@JsMethod(name="error")
void error(java.lang.Object error);
}
