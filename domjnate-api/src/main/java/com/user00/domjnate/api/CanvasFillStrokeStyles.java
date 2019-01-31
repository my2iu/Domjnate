package com.user00.domjnate.api;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="CanvasFillStrokeStyles")
public interface CanvasFillStrokeStyles
{
@JsProperty(name="fillStyle")
java.lang.Object getFillStyle();
@JsProperty(name="fillStyle")
void setFillStyle(java.lang.Object val);
@JsProperty(name="strokeStyle")
java.lang.Object getStrokeStyle();
@JsProperty(name="strokeStyle")
void setStrokeStyle(java.lang.Object val);
@JsMethod(name="createLinearGradient")
CanvasGradient createLinearGradient(double x0, double y0, double x1, double y1);
@JsMethod(name="createPattern")
CanvasPattern createPattern(ImageBitmap image, String repetition);
@JsMethod(name="createPattern")
CanvasPattern createPattern(com.user00.domjnate.api.html.HTMLCanvasElement image, String repetition);
@JsMethod(name="createPattern")
CanvasPattern createPattern(com.user00.domjnate.api.html.HTMLVideoElement image, String repetition);
@JsMethod(name="createPattern")
CanvasPattern createPattern(com.user00.domjnate.api.svg.SVGImageElement image, String repetition);
@JsMethod(name="createPattern")
CanvasPattern createPattern(com.user00.domjnate.api.html.HTMLImageElement image, String repetition);
@JsMethod(name="createRadialGradient")
CanvasGradient createRadialGradient(double x0, double y0, double r0, double x1, double y1, double r1);
}
