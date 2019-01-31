package com.user00.domjnate.api;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="CanvasText")
public interface CanvasText
{
@JsMethod(name="fillText")
void fillText(String text, double x, double y);
@JsMethod(name="fillText")
void fillText(String text, double x, double y, double maxWidth);
@JsMethod(name="measureText")
TextMetrics measureText(String text);
@JsMethod(name="strokeText")
void strokeText(String text, double x, double y);
@JsMethod(name="strokeText")
void strokeText(String text, double x, double y, double maxWidth);
}
