package com.user00.domjnate.api.dom;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="NonDocumentTypeChildNode")
public interface NonDocumentTypeChildNode
{
@JsProperty(name="nextElementSibling")
Element getNextElementSibling();
@JsProperty(name="previousElementSibling")
Element getPreviousElementSibling();
}
