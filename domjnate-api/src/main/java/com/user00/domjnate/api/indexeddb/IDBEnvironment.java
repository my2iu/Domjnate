package com.user00.domjnate.api.indexeddb;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="IDBEnvironment")
public interface IDBEnvironment
{
@JsProperty(name="indexedDB")
IDBFactory getIndexedDB();
}
