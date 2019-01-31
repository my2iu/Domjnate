package com.user00.domjnate.api;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="ElementContentEditable")
public interface ElementContentEditable
{
@JsProperty(name="contentEditable")
String getContentEditable();
@JsProperty(name="contentEditable")
void setContentEditable(String val);
@JsProperty(name="inputMode")
String getInputMode();
@JsProperty(name="inputMode")
void setInputMode(String val);
@JsProperty(name="isContentEditable")
boolean getIsContentEditable();
}
