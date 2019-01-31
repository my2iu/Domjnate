package com.user00.domjnate.api.svg;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="SVGAnimatedPoints")
public interface SVGAnimatedPoints
{
@JsProperty(name="animatedPoints")
SVGPointList getAnimatedPoints();
@JsProperty(name="points")
SVGPointList getPoints();
}
