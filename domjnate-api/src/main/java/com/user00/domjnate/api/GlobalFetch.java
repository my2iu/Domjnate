package com.user00.domjnate.api;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="GlobalFetch")
public interface GlobalFetch
{
@JsMethod(name="fetch")
Promise<Response> fetch(String input);
@JsMethod(name="fetch")
Promise<Response> fetch(Request input);
@JsMethod(name="fetch")
Promise<Response> fetch(String input, RequestInit init);
@JsMethod(name="fetch")
Promise<Response> fetch(Request input, RequestInit init);
}
