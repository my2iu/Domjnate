package com.user00.domjnate.api.svg;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="SVGURIReference")
public interface SVGURIReference
{
@JsProperty(name="href")
SVGAnimatedString getHref();
}
