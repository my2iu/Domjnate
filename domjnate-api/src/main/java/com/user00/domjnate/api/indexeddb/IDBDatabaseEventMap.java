package com.user00.domjnate.api.indexeddb;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="IDBDatabaseEventMap")
public interface IDBDatabaseEventMap
{
@JsProperty(name="abort")
com.user00.domjnate.api.dom.Event getAbort();
@JsProperty(name="abort")
void setAbort(com.user00.domjnate.api.dom.Event val);
@JsProperty(name="close")
com.user00.domjnate.api.dom.Event getClose();
@JsProperty(name="close")
void setClose(com.user00.domjnate.api.dom.Event val);
@JsProperty(name="error")
com.user00.domjnate.api.dom.Event getError();
@JsProperty(name="error")
void setError(com.user00.domjnate.api.dom.Event val);
@JsProperty(name="versionchange")
IDBVersionChangeEvent getVersionchange();
@JsProperty(name="versionchange")
void setVersionchange(IDBVersionChangeEvent val);
}
