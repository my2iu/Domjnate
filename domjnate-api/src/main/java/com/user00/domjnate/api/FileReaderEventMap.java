package com.user00.domjnate.api;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="FileReaderEventMap")
public interface FileReaderEventMap
{
@JsProperty(name="abort")
ProgressEvent getAbort();
@JsProperty(name="abort")
void setAbort(ProgressEvent val);
@JsProperty(name="error")
ProgressEvent getError();
@JsProperty(name="error")
void setError(ProgressEvent val);
@JsProperty(name="load")
ProgressEvent getLoad();
@JsProperty(name="load")
void setLoad(ProgressEvent val);
@JsProperty(name="loadend")
ProgressEvent getLoadend();
@JsProperty(name="loadend")
void setLoadend(ProgressEvent val);
@JsProperty(name="loadstart")
ProgressEvent getLoadstart();
@JsProperty(name="loadstart")
void setLoadstart(ProgressEvent val);
@JsProperty(name="progress")
ProgressEvent getProgress();
@JsProperty(name="progress")
void setProgress(ProgressEvent val);
}
