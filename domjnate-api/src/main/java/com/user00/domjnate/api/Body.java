package com.user00.domjnate.api;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="Body")
public interface Body
{
@JsProperty(name="body")
com.user00.domjnate.api.stream.ReadableStream<Uint8Array> getBody();
@JsProperty(name="bodyUsed")
boolean getBodyUsed();
@JsMethod(name="arrayBuffer")
Promise<ArrayBuffer> arrayBuffer();
@JsMethod(name="blob")
Promise<Blob> blob();
@JsMethod(name="formData")
Promise<FormData> formData();
@JsMethod(name="json")
Promise<java.lang.Object> json();
@JsMethod(name="text")
Promise<String> text();
}
