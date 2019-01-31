package com.user00.domjnate.api;

import jsinterop.annotations.JsFunction;

@JsFunction
public interface EventListener
{
void accept(com.user00.domjnate.api.dom.Event evt);
}
