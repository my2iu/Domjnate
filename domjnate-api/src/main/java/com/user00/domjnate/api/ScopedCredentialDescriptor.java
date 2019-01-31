package com.user00.domjnate.api;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="ScopedCredentialDescriptor")
public interface ScopedCredentialDescriptor
{
@JsProperty(name="id")
java.lang.Object getId();
@JsProperty(name="id")
void setId(java.lang.Object val);
@JsProperty(name="transports")
Array<String> getTransports();
@JsProperty(name="transports")
void setTransports(Array<String> val);
@JsProperty(name="type")
String getType();
@JsProperty(name="type")
void setType(String val);
}
