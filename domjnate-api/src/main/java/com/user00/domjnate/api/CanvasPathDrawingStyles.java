package com.user00.domjnate.api;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="CanvasPathDrawingStyles")
public interface CanvasPathDrawingStyles
{
@JsProperty(name="lineCap")
String getLineCap();
@JsProperty(name="lineCap")
void setLineCap(String val);
@JsProperty(name="lineDashOffset")
double getLineDashOffset();
@JsProperty(name="lineDashOffset")
void setLineDashOffset(double val);
@JsProperty(name="lineJoin")
String getLineJoin();
@JsProperty(name="lineJoin")
void setLineJoin(String val);
@JsProperty(name="lineWidth")
double getLineWidth();
@JsProperty(name="lineWidth")
void setLineWidth(double val);
@JsProperty(name="miterLimit")
double getMiterLimit();
@JsProperty(name="miterLimit")
void setMiterLimit(double val);
@JsMethod(name="getLineDash")
Array<Double> getLineDash();
@JsMethod(name="setLineDash")
void setLineDash(Array<Double> segments);
}
