package com.user00.domjnate.api;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="DocumentEvent")
public interface DocumentEvent
{
@JsMethod(name="createEvent")
com.user00.domjnate.api.dom.Event createEvent(String eventInterface);
}
