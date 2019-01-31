package com.user00.domjnate.api.stream;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="ReadableStreamBYOBRequest")
public interface ReadableStreamBYOBRequest
{
@JsProperty(name="view")
com.user00.domjnate.api.ArrayBufferView getView();
@JsMethod(name="respond")
void respond(double bytesWritten);
@JsMethod(name="respondWithNewView")
void respondWithNewView(com.user00.domjnate.api.ArrayBufferView view);
}
