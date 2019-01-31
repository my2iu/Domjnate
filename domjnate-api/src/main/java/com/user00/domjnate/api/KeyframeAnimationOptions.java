package com.user00.domjnate.api;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="KeyframeAnimationOptions")
public interface KeyframeAnimationOptions extends KeyframeEffectOptions
{
@JsProperty(name="id")
String getId();
@JsProperty(name="id")
void setId(String val);
}
