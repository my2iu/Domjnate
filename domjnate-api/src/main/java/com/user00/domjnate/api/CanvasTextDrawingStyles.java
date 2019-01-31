package com.user00.domjnate.api;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="CanvasTextDrawingStyles")
public interface CanvasTextDrawingStyles
{
@JsProperty(name="direction")
String getDirection();
@JsProperty(name="direction")
void setDirection(String val);
@JsProperty(name="font")
String getFont();
@JsProperty(name="font")
void setFont(String val);
@JsProperty(name="textAlign")
String getTextAlign();
@JsProperty(name="textAlign")
void setTextAlign(String val);
@JsProperty(name="textBaseline")
String getTextBaseline();
@JsProperty(name="textBaseline")
void setTextBaseline(String val);
}
