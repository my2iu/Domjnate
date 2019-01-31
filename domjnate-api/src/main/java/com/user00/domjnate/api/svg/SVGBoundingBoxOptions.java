package com.user00.domjnate.api.svg;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="SVGBoundingBoxOptions")
public interface SVGBoundingBoxOptions
{
@JsProperty(name="clipped")
Boolean getClipped();
@JsProperty(name="clipped")
void setClipped(Boolean val);
@JsProperty(name="fill")
Boolean getFill();
@JsProperty(name="fill")
void setFill(Boolean val);
@JsProperty(name="markers")
Boolean getMarkers();
@JsProperty(name="markers")
void setMarkers(Boolean val);
@JsProperty(name="stroke")
Boolean getStroke();
@JsProperty(name="stroke")
void setStroke(Boolean val);
}
