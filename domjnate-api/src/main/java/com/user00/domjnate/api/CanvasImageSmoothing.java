package com.user00.domjnate.api;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="CanvasImageSmoothing")
public interface CanvasImageSmoothing
{
@JsProperty(name="imageSmoothingEnabled")
boolean getImageSmoothingEnabled();
@JsProperty(name="imageSmoothingEnabled")
void setImageSmoothingEnabled(boolean val);
@JsProperty(name="imageSmoothingQuality")
String getImageSmoothingQuality();
@JsProperty(name="imageSmoothingQuality")
void setImageSmoothingQuality(String val);
}
