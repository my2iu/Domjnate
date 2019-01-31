package com.user00.domjnate.api;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="KeyboardEventInit")
public interface KeyboardEventInit extends EventModifierInit
{
@JsProperty(name="code")
String getCode();
@JsProperty(name="code")
void setCode(String val);
@JsProperty(name="key")
String getKey();
@JsProperty(name="key")
void setKey(String val);
@JsProperty(name="location")
Double getLocation();
@JsProperty(name="location")
void setLocation(Double val);
@JsProperty(name="repeat")
Boolean getRepeat();
@JsProperty(name="repeat")
void setRepeat(Boolean val);
}
