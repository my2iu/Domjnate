package com.user00.domjnate.api;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="NavigatorLanguage")
public interface NavigatorLanguage
{
@JsProperty(name="language")
String getLanguage();
@JsProperty(name="languages")
ReadonlyArray<String> getLanguages();
}
