package com.user00.domjnate.api;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="WorkerOptions")
public interface WorkerOptions
{
@JsProperty(name="credentials")
String getCredentials();
@JsProperty(name="credentials")
void setCredentials(String val);
@JsProperty(name="name")
String getName();
@JsProperty(name="name")
void setName(String val);
@JsProperty(name="type")
String getType();
@JsProperty(name="type")
void setType(String val);
}
