package com.user00.domjnate.api;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="NavigatorOnLine")
public interface NavigatorOnLine
{
@JsProperty(name="onLine")
boolean getOnLine();
}
