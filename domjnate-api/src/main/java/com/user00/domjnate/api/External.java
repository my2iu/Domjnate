package com.user00.domjnate.api;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="External")
public interface External
{
@JsMethod(name="AddSearchProvider")
void AddSearchProvider();
@JsMethod(name="IsSearchProviderInstalled")
void IsSearchProviderInstalled();
}
