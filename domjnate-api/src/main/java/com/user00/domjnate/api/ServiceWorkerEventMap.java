package com.user00.domjnate.api;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="ServiceWorkerEventMap")
public interface ServiceWorkerEventMap extends AbstractWorkerEventMap
{
@JsProperty(name="statechange")
com.user00.domjnate.api.dom.Event getStatechange();
@JsProperty(name="statechange")
void setStatechange(com.user00.domjnate.api.dom.Event val);
}
