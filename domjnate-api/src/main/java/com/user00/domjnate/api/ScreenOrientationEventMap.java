package com.user00.domjnate.api;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="ScreenOrientationEventMap")
public interface ScreenOrientationEventMap
{
@JsProperty(name="change")
com.user00.domjnate.api.dom.Event getChange();
@JsProperty(name="change")
void setChange(com.user00.domjnate.api.dom.Event val);
}
