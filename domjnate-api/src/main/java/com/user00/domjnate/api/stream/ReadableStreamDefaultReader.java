package com.user00.domjnate.api.stream;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="ReadableStreamDefaultReader")
public interface ReadableStreamDefaultReader<R> 
{
@JsProperty(name="closed")
com.user00.domjnate.api.Promise<Void> getClosed();
@JsMethod(name="cancel")
com.user00.domjnate.api.Promise<Void> cancel();
@JsMethod(name="cancel")
com.user00.domjnate.api.Promise<Void> cancel(java.lang.Object reason);
@JsMethod(name="read")
com.user00.domjnate.api.Promise<ReadableStreamReadResult<R>> read();
@JsMethod(name="releaseLock")
void releaseLock();
}
