package com.user00.domjnate.api.stream;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="UnderlyingByteSource")
public interface UnderlyingByteSource
{
@JsProperty(name="autoAllocateChunkSize")
Double getAutoAllocateChunkSize();
@JsProperty(name="autoAllocateChunkSize")
void setAutoAllocateChunkSize(Double val);
@JsProperty(name="cancel")
ReadableStreamErrorCallback getCancel();
@JsProperty(name="cancel")
void setCancel(ReadableStreamErrorCallback val);
@JsProperty(name="pull")
ReadableByteStreamControllerCallback getPull();
@JsProperty(name="pull")
void setPull(ReadableByteStreamControllerCallback val);
@JsProperty(name="start")
ReadableByteStreamControllerCallback getStart();
@JsProperty(name="start")
void setStart(ReadableByteStreamControllerCallback val);
@JsProperty(name="type")
String getType();
@JsProperty(name="type")
void setType(String val);
}
