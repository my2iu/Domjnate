package com.user00.domjnate.api;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="WorkerEventMap")
public interface WorkerEventMap extends AbstractWorkerEventMap
{
@JsProperty(name="message")
MessageEvent getMessage();
@JsProperty(name="message")
void setMessage(MessageEvent val);
}
