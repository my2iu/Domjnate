package com.user00.domjnate.api.indexeddb;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="IDBRequestEventMap")
public interface IDBRequestEventMap
{
@JsProperty(name="error")
com.user00.domjnate.api.dom.Event getError();
@JsProperty(name="error")
void setError(com.user00.domjnate.api.dom.Event val);
@JsProperty(name="success")
com.user00.domjnate.api.dom.Event getSuccess();
@JsProperty(name="success")
void setSuccess(com.user00.domjnate.api.dom.Event val);
}
