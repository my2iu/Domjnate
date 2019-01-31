package com.user00.domjnate.api.webgl;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="WebGLContextEventInit")
public interface WebGLContextEventInit extends com.user00.domjnate.api.dom.EventInit
{
@JsProperty(name="statusMessage")
String getStatusMessage();
@JsProperty(name="statusMessage")
void setStatusMessage(String val);
}
