package com.user00.domjnate.api;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="NonElementParentNode")
public interface NonElementParentNode
{
@JsMethod(name="getElementById")
com.user00.domjnate.api.dom.Element getElementById(String elementId);
}
