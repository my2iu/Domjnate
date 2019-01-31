package com.user00.domjnate.api;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="RegistrationOptions")
public interface RegistrationOptions
{
@JsProperty(name="scope")
String getScope();
@JsProperty(name="scope")
void setScope(String val);
@JsProperty(name="type")
String getType();
@JsProperty(name="type")
void setType(String val);
@JsProperty(name="updateViaCache")
String getUpdateViaCache();
@JsProperty(name="updateViaCache")
void setUpdateViaCache(String val);
}
