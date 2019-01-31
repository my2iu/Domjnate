package com.user00.domjnate.api;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="CanvasShadowStyles")
public interface CanvasShadowStyles
{
@JsProperty(name="shadowBlur")
double getShadowBlur();
@JsProperty(name="shadowBlur")
void setShadowBlur(double val);
@JsProperty(name="shadowColor")
String getShadowColor();
@JsProperty(name="shadowColor")
void setShadowColor(String val);
@JsProperty(name="shadowOffsetX")
double getShadowOffsetX();
@JsProperty(name="shadowOffsetX")
void setShadowOffsetX(double val);
@JsProperty(name="shadowOffsetY")
double getShadowOffsetY();
@JsProperty(name="shadowOffsetY")
void setShadowOffsetY(double val);
}
