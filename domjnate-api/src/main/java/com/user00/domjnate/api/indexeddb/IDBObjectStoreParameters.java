package com.user00.domjnate.api.indexeddb;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="IDBObjectStoreParameters")
public interface IDBObjectStoreParameters
{
@JsProperty(name="autoIncrement")
Boolean getAutoIncrement();
@JsProperty(name="autoIncrement")
void setAutoIncrement(Boolean val);
@JsProperty(name="keyPath")
java.lang.Object getKeyPath();
@JsProperty(name="keyPath")
void setKeyPath(java.lang.Object val);
}
