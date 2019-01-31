package com.user00.domjnate.api.stream;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="TransformStreamDefaultController")
public interface TransformStreamDefaultController<O> 
{
@JsProperty(name="desiredSize")
Double getDesiredSize();
@JsMethod(name="enqueue")
void enqueue(O chunk);
@JsMethod(name="error")
void error();
@JsMethod(name="error")
void error(java.lang.Object reason);
@JsMethod(name="terminate")
void terminate();
}
