package com.user00.domjnate.api.webcrypto;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="AesCtrParams")
public interface AesCtrParams extends Algorithm
{
@JsProperty(name="counter")
java.lang.Object getCounter();
@JsProperty(name="counter")
void setCounter(java.lang.Object val);
@JsProperty(name="length")
double getLength();
@JsProperty(name="length")
void setLength(double val);
}
