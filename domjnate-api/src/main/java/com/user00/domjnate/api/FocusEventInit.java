package com.user00.domjnate.api;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="FocusEventInit")
public interface FocusEventInit extends UIEventInit
{
@JsProperty(name="relatedTarget")
com.user00.domjnate.api.dom.EventTarget getRelatedTarget();
@JsProperty(name="relatedTarget")
void setRelatedTarget(com.user00.domjnate.api.dom.EventTarget val);
}
