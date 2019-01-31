package com.user00.domjnate.api;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="CanvasCompositing")
public interface CanvasCompositing
{
@JsProperty(name="globalAlpha")
double getGlobalAlpha();
@JsProperty(name="globalAlpha")
void setGlobalAlpha(double val);
@JsProperty(name="globalCompositeOperation")
String getGlobalCompositeOperation();
@JsProperty(name="globalCompositeOperation")
void setGlobalCompositeOperation(String val);
}
