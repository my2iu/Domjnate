package com.user00.domjnate.api;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="ArrayBufferView")
public interface ArrayBufferView
{
@JsProperty(name="buffer")
java.lang.Object getBuffer();
@JsProperty(name="buffer")
void setBuffer(java.lang.Object val);
@JsProperty(name="byteLength")
double getByteLength();
@JsProperty(name="byteLength")
void setByteLength(double val);
@JsProperty(name="byteOffset")
double getByteOffset();
@JsProperty(name="byteOffset")
void setByteOffset(double val);
}
