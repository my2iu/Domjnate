package com.user00.domjnate.api.indexeddb;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="IDBOpenDBRequestEventMap")
public interface IDBOpenDBRequestEventMap extends IDBRequestEventMap
{
@JsProperty(name="blocked")
com.user00.domjnate.api.dom.Event getBlocked();
@JsProperty(name="blocked")
void setBlocked(com.user00.domjnate.api.dom.Event val);
@JsProperty(name="upgradeneeded")
IDBVersionChangeEvent getUpgradeneeded();
@JsProperty(name="upgradeneeded")
void setUpgradeneeded(IDBVersionChangeEvent val);
}
