package com.user00.domjnate.api;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="ElementEventMap")
public interface ElementEventMap
{
@JsProperty(name="fullscreenchange")
com.user00.domjnate.api.dom.Event getFullscreenchange();
@JsProperty(name="fullscreenchange")
void setFullscreenchange(com.user00.domjnate.api.dom.Event val);
@JsProperty(name="fullscreenerror")
com.user00.domjnate.api.dom.Event getFullscreenerror();
@JsProperty(name="fullscreenerror")
void setFullscreenerror(com.user00.domjnate.api.dom.Event val);
}
