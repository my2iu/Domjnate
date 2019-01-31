package com.user00.domjnate.api;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="AbortSignalEventMap")
public interface AbortSignalEventMap
{
@JsProperty(name="abort")
ProgressEvent getAbort();
@JsProperty(name="abort")
void setAbort(ProgressEvent val);
}
