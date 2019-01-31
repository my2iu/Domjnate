package com.user00.domjnate.api;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="ResponseInit")
public interface ResponseInit
{
@JsProperty(name="headers")
java.lang.Object getHeaders();
@JsProperty(name="headers")
void setHeaders(java.lang.Object val);
@JsProperty(name="status")
Double getStatus();
@JsProperty(name="status")
void setStatus(Double val);
@JsProperty(name="statusText")
String getStatusText();
@JsProperty(name="statusText")
void setStatusText(String val);
}
