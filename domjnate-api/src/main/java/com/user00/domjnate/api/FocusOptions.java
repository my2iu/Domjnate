package com.user00.domjnate.api;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="FocusOptions")
public interface FocusOptions
{
@JsProperty(name="preventScroll")
Boolean getPreventScroll();
@JsProperty(name="preventScroll")
void setPreventScroll(Boolean val);
}
