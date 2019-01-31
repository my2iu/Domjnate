package com.user00.domjnate.api;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="ImageBitmapOptions")
public interface ImageBitmapOptions
{
@JsProperty(name="colorSpaceConversion")
String getColorSpaceConversion();
@JsProperty(name="colorSpaceConversion")
void setColorSpaceConversion(String val);
@JsProperty(name="imageOrientation")
String getImageOrientation();
@JsProperty(name="imageOrientation")
void setImageOrientation(String val);
@JsProperty(name="premultiplyAlpha")
String getPremultiplyAlpha();
@JsProperty(name="premultiplyAlpha")
void setPremultiplyAlpha(String val);
@JsProperty(name="resizeHeight")
Double getResizeHeight();
@JsProperty(name="resizeHeight")
void setResizeHeight(Double val);
@JsProperty(name="resizeQuality")
String getResizeQuality();
@JsProperty(name="resizeQuality")
void setResizeQuality(String val);
@JsProperty(name="resizeWidth")
Double getResizeWidth();
@JsProperty(name="resizeWidth")
void setResizeWidth(Double val);
}
