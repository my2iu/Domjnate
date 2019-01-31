package com.user00.domjnate.api;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="WindowLocalStorage")
public interface WindowLocalStorage
{
@JsProperty(name="localStorage")
Storage getLocalStorage();
}
