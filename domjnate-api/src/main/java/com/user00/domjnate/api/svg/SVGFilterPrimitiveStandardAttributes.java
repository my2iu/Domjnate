package com.user00.domjnate.api.svg;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="SVGFilterPrimitiveStandardAttributes")
public interface SVGFilterPrimitiveStandardAttributes
{
@JsProperty(name="height")
SVGAnimatedLength getHeight();
@JsProperty(name="result")
SVGAnimatedString getResult();
@JsProperty(name="width")
SVGAnimatedLength getWidth();
@JsProperty(name="x")
SVGAnimatedLength getX();
@JsProperty(name="y")
SVGAnimatedLength getY();
}
