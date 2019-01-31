package com.user00.domjnate.api.html;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="HTMLBodyElementEventMap")
public interface HTMLBodyElementEventMap extends HTMLElementEventMap, com.user00.domjnate.api.WindowEventHandlersEventMap
{
@JsProperty(name="orientationchange")
com.user00.domjnate.api.dom.Event getOrientationchange();
@JsProperty(name="orientationchange")
void setOrientationchange(com.user00.domjnate.api.dom.Event val);
}
