package com.user00.domjnate.api.svg;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="SVGFitToViewBox")
public interface SVGFitToViewBox
{
@JsProperty(name="preserveAspectRatio")
SVGAnimatedPreserveAspectRatio getPreserveAspectRatio();
@JsProperty(name="viewBox")
SVGAnimatedRect getViewBox();
}
