package com.user00.domjnate.api;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="WindowSessionStorage")
public interface WindowSessionStorage
{
@JsProperty(name="sessionStorage")
Storage getSessionStorage();
}
