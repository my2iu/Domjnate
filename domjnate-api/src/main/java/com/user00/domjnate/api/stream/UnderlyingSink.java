package com.user00.domjnate.api.stream;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="UnderlyingSink")
public interface UnderlyingSink<W> 
{
@JsProperty(name="abort")
WritableStreamErrorCallback getAbort();
@JsProperty(name="abort")
void setAbort(WritableStreamErrorCallback val);
@JsProperty(name="close")
WritableStreamDefaultControllerCloseCallback getClose();
@JsProperty(name="close")
void setClose(WritableStreamDefaultControllerCloseCallback val);
@JsProperty(name="start")
WritableStreamDefaultControllerStartCallback getStart();
@JsProperty(name="start")
void setStart(WritableStreamDefaultControllerStartCallback val);
@JsProperty(name="type")
Void getType();
@JsProperty(name="type")
void setType(Void val);
@JsProperty(name="write")
WritableStreamDefaultControllerWriteCallback<W> getWrite();
@JsProperty(name="write")
void setWrite(WritableStreamDefaultControllerWriteCallback<W> val);
}
