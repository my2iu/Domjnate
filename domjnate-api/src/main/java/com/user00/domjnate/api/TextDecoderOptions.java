package com.user00.domjnate.api;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="TextDecoderOptions")
public interface TextDecoderOptions
{
@JsProperty(name="fatal")
Boolean getFatal();
@JsProperty(name="fatal")
void setFatal(Boolean val);
@JsProperty(name="ignoreBOM")
Boolean getIgnoreBOM();
@JsProperty(name="ignoreBOM")
void setIgnoreBOM(Boolean val);
}
