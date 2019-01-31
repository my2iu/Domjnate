package com.user00.domjnate.api;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="CanvasPath")
public interface CanvasPath
{
@JsMethod(name="arc")
void arc(double x, double y, double radius, double startAngle, double endAngle);
@JsMethod(name="arc")
void arc(double x, double y, double radius, double startAngle, double endAngle, boolean anticlockwise);
@JsMethod(name="arcTo")
void arcTo(double x1, double y1, double x2, double y2, double radius);
@JsMethod(name="bezierCurveTo")
void bezierCurveTo(double cp1x, double cp1y, double cp2x, double cp2y, double x, double y);
@JsMethod(name="closePath")
void closePath();
@JsMethod(name="ellipse")
void ellipse(double x, double y, double radiusX, double radiusY, double rotation, double startAngle, double endAngle);
@JsMethod(name="ellipse")
void ellipse(double x, double y, double radiusX, double radiusY, double rotation, double startAngle, double endAngle, boolean anticlockwise);
@JsMethod(name="lineTo")
void lineTo(double x, double y);
@JsMethod(name="moveTo")
void moveTo(double x, double y);
@JsMethod(name="quadraticCurveTo")
void quadraticCurveTo(double cpx, double cpy, double x, double y);
@JsMethod(name="rect")
void rect(double x, double y, double w, double h);
}
