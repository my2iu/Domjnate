package com.user00.domjnate.api;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="MediaQueryListEventMap")
public interface MediaQueryListEventMap
{
@JsProperty(name="change")
MediaQueryListEvent getChange();
@JsProperty(name="change")
void setChange(MediaQueryListEvent val);
}
