package com.user00.domjnate.api.svg;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="SVGTests")
public interface SVGTests
{
@JsProperty(name="requiredExtensions")
SVGStringList getRequiredExtensions();
@JsProperty(name="systemLanguage")
SVGStringList getSystemLanguage();
}
