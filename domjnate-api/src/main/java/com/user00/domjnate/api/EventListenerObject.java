package com.user00.domjnate.api;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="EventListenerObject")
public interface EventListenerObject
{
@JsMethod(name="handleEvent")
void handleEvent(com.user00.domjnate.api.dom.Event evt);
}
