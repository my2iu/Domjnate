package com.user00.domjnate.api;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="AddEventListenerOptions")
public interface AddEventListenerOptions extends EventListenerOptions
{
@JsProperty(name="once")
Boolean getOnce();
@JsProperty(name="once")
void setOnce(Boolean val);
@JsProperty(name="passive")
Boolean getPassive();
@JsProperty(name="passive")
void setPassive(Boolean val);
}
