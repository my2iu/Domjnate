package com.user00.domjnate.api;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="ShadowRootInit")
public interface ShadowRootInit
{
@JsProperty(name="delegatesFocus")
Boolean getDelegatesFocus();
@JsProperty(name="delegatesFocus")
void setDelegatesFocus(Boolean val);
@JsProperty(name="mode")
String getMode();
@JsProperty(name="mode")
void setMode(String val);
}
