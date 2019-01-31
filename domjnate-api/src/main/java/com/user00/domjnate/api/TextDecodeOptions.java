package com.user00.domjnate.api;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="TextDecodeOptions")
public interface TextDecodeOptions
{
@JsProperty(name="stream")
Boolean getStream();
@JsProperty(name="stream")
void setStream(Boolean val);
}
