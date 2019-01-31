package com.user00.domjnate.api;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="CanvasTransform")
public interface CanvasTransform
{
@JsMethod(name="getTransform")
DOMMatrix getTransform();
@JsMethod(name="resetTransform")
void resetTransform();
@JsMethod(name="rotate")
void rotate(double angle);
@JsMethod(name="scale")
void scale(double x, double y);
@JsMethod(name="setTransform")
void setTransform(double a, double b, double c, double d, double e, double f);
@JsMethod(name="setTransform")
void setTransform();
@JsMethod(name="setTransform")
void setTransform(DOMMatrix2DInit transform);
@JsMethod(name="transform")
void transform(double a, double b, double c, double d, double e, double f);
@JsMethod(name="translate")
void translate(double x, double y);
}
