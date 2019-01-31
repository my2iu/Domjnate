package com.user00.domjnate.api;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="WindowBase64")
public interface WindowBase64
{
@JsMethod(name="atob")
String atob(String encodedString);
@JsMethod(name="btoa")
String btoa(String rawString);
}
