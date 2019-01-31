package com.user00.domjnate.api;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="AbstractWorkerEventMap")
public interface AbstractWorkerEventMap
{
@JsProperty(name="error")
ErrorEvent getError();
@JsProperty(name="error")
void setError(ErrorEvent val);
}
