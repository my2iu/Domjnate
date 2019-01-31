package com.user00.domjnate.api;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="CanvasImageData")
public interface CanvasImageData
{
@JsMethod(name="createImageData")
ImageData createImageData(double sw, double sh);
@JsMethod(name="createImageData")
ImageData createImageData(ImageData imagedata);
@JsMethod(name="getImageData")
ImageData getImageData(double sx, double sy, double sw, double sh);
@JsMethod(name="putImageData")
void putImageData(ImageData imagedata, double dx, double dy);
@JsMethod(name="putImageData")
void putImageData(ImageData imagedata, double dx, double dy, double dirtyX, double dirtyY, double dirtyWidth, double dirtyHeight);
}
