package com.user00.domjnate.api;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="ArrayBufferTypes")
public interface ArrayBufferTypes
{
@JsProperty(name="ArrayBuffer")
ArrayBuffer getArrayBuffer();
@JsProperty(name="ArrayBuffer")
void setArrayBuffer(ArrayBuffer val);
}
