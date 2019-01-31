package com.user00.domjnate.api;

import jsinterop.annotations.JsFunction;

@JsFunction
public interface ErrorEventHandler
{
void accept(java.lang.Object event, String source, double fileno, double columnNumber, Error error);
}
