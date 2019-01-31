package com.user00.domjnate.api;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="XMLHttpRequestEventMap")
public interface XMLHttpRequestEventMap extends XMLHttpRequestEventTargetEventMap
{
@JsProperty(name="readystatechange")
com.user00.domjnate.api.dom.Event getReadystatechange();
@JsProperty(name="readystatechange")
void setReadystatechange(com.user00.domjnate.api.dom.Event val);
}
