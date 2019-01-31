package com.user00.domjnate.api;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="WindowConsole")
public interface WindowConsole
{
@JsProperty(name="console")
Console getConsole();
}
