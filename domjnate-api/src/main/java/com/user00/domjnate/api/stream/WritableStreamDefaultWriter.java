package com.user00.domjnate.api.stream;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="WritableStreamDefaultWriter")
public interface WritableStreamDefaultWriter<W> 
{
@JsProperty(name="closed")
com.user00.domjnate.api.Promise<Void> getClosed();
@JsProperty(name="desiredSize")
Double getDesiredSize();
@JsProperty(name="ready")
com.user00.domjnate.api.Promise<Void> getReady();
@JsMethod(name="abort")
com.user00.domjnate.api.Promise<Void> abort();
@JsMethod(name="abort")
com.user00.domjnate.api.Promise<Void> abort(java.lang.Object reason);
@JsMethod(name="close")
com.user00.domjnate.api.Promise<Void> close();
@JsMethod(name="releaseLock")
void releaseLock();
@JsMethod(name="write")
com.user00.domjnate.api.Promise<Void> write(W chunk);
}
