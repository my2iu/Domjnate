package com.user00.domjnate.api;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="ErrorEventInit")
public interface ErrorEventInit extends com.user00.domjnate.api.dom.EventInit
{
@JsProperty(name="colno")
Double getColno();
@JsProperty(name="colno")
void setColno(Double val);
@JsProperty(name="error")
java.lang.Object getError();
@JsProperty(name="error")
void setError(java.lang.Object val);
@JsProperty(name="filename")
String getFilename();
@JsProperty(name="filename")
void setFilename(String val);
@JsProperty(name="lineno")
Double getLineno();
@JsProperty(name="lineno")
void setLineno(Double val);
@JsProperty(name="message")
String getMessage();
@JsProperty(name="message")
void setMessage(String val);
}
