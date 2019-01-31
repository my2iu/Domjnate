package com.user00.domjnate.api;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="PopStateEventInit")
public interface PopStateEventInit extends com.user00.domjnate.api.dom.EventInit
{
@JsProperty(name="state")
java.lang.Object getState();
@JsProperty(name="state")
void setState(java.lang.Object val);
}
