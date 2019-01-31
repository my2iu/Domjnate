package com.user00.domjnate.api;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="CanvasRect")
public interface CanvasRect
{
@JsMethod(name="clearRect")
void clearRect(double x, double y, double w, double h);
@JsMethod(name="fillRect")
void fillRect(double x, double y, double w, double h);
@JsMethod(name="strokeRect")
void strokeRect(double x, double y, double w, double h);
}
