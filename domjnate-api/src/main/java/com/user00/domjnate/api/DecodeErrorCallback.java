package com.user00.domjnate.api;

import jsinterop.annotations.JsFunction;

@JsFunction
public interface DecodeErrorCallback
{
void accept(com.user00.domjnate.api.dom.DOMException error);
}
