package com.user00.domjnate.api;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="CanvasDrawPath")
public interface CanvasDrawPath
{
@JsMethod(name="beginPath")
void beginPath();
@JsMethod(name="clip")
void clip();
@JsMethod(name="clip")
void clip(String fillRule);
@JsMethod(name="clip")
void clip(Path2D path);
@JsMethod(name="clip")
void clip(Path2D path, String fillRule);
@JsMethod(name="fill")
void fill();
@JsMethod(name="fill")
void fill(String fillRule);
@JsMethod(name="fill")
void fill(Path2D path);
@JsMethod(name="fill")
void fill(Path2D path, String fillRule);
@JsMethod(name="isPointInPath")
boolean isPointInPath(double x, double y);
@JsMethod(name="isPointInPath")
boolean isPointInPath(double x, double y, String fillRule);
@JsMethod(name="isPointInPath")
boolean isPointInPath(Path2D path, double x, double y);
@JsMethod(name="isPointInPath")
boolean isPointInPath(Path2D path, double x, double y, String fillRule);
@JsMethod(name="isPointInStroke")
boolean isPointInStroke(double x, double y);
@JsMethod(name="isPointInStroke")
boolean isPointInStroke(Path2D path, double x, double y);
@JsMethod(name="stroke")
void stroke();
@JsMethod(name="stroke")
void stroke(Path2D path);
}
