package com.user00.domjnate.api;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="EventListenerOptions")
public interface EventListenerOptions
{
@JsProperty(name="capture")
Boolean getCapture();
@JsProperty(name="capture")
void setCapture(Boolean val);
}
