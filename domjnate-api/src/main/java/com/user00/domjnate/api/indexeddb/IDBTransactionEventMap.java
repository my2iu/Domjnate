package com.user00.domjnate.api.indexeddb;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="IDBTransactionEventMap")
public interface IDBTransactionEventMap
{
@JsProperty(name="abort")
com.user00.domjnate.api.dom.Event getAbort();
@JsProperty(name="abort")
void setAbort(com.user00.domjnate.api.dom.Event val);
@JsProperty(name="complete")
com.user00.domjnate.api.dom.Event getComplete();
@JsProperty(name="complete")
void setComplete(com.user00.domjnate.api.dom.Event val);
@JsProperty(name="error")
com.user00.domjnate.api.dom.Event getError();
@JsProperty(name="error")
void setError(com.user00.domjnate.api.dom.Event val);
}
