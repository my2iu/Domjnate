package com.user00.domjnate.api;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="LinkStyle")
public interface LinkStyle
{
@JsProperty(name="sheet")
StyleSheet getSheet();
}
