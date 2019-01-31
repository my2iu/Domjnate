package com.user00.domjnate.api;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="CloseEventInit")
public interface CloseEventInit extends com.user00.domjnate.api.dom.EventInit
{
@JsProperty(name="code")
Double getCode();
@JsProperty(name="code")
void setCode(Double val);
@JsProperty(name="reason")
String getReason();
@JsProperty(name="reason")
void setReason(String val);
@JsProperty(name="wasClean")
Boolean getWasClean();
@JsProperty(name="wasClean")
void setWasClean(Boolean val);
}
