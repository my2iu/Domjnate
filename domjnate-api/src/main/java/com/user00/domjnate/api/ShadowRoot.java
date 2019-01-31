package com.user00.domjnate.api;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="ShadowRoot")
public interface ShadowRoot extends DocumentOrShadowRoot, com.user00.domjnate.api.dom.DocumentFragment
{
@JsProperty(name="host")
com.user00.domjnate.api.dom.Element getHost();
@JsProperty(name="innerHTML")
String getInnerHTML();
@JsProperty(name="innerHTML")
void setInnerHTML(String val);
@JsProperty(name="mode")
String getMode();
}
