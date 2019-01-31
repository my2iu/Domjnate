package com.user00.domjnate.api.stream;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="UnderlyingSource")
public interface UnderlyingSource<R> 
{
@JsProperty(name="cancel")
ReadableStreamErrorCallback getCancel();
@JsProperty(name="cancel")
void setCancel(ReadableStreamErrorCallback val);
@JsProperty(name="pull")
ReadableStreamDefaultControllerCallback<R> getPull();
@JsProperty(name="pull")
void setPull(ReadableStreamDefaultControllerCallback<R> val);
@JsProperty(name="start")
ReadableStreamDefaultControllerCallback<R> getStart();
@JsProperty(name="start")
void setStart(ReadableStreamDefaultControllerCallback<R> val);
@JsProperty(name="type")
Void getType();
@JsProperty(name="type")
void setType(Void val);
}
