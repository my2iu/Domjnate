package com.user00.domjnate.api;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="CanvasRenderingContext2DSettings")
public interface CanvasRenderingContext2DSettings
{
@JsProperty(name="alpha")
Boolean getAlpha();
@JsProperty(name="alpha")
void setAlpha(Boolean val);
}
