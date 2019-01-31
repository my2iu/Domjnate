package com.user00.domjnate.api.indexeddb;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="IDBVersionChangeEventInit")
public interface IDBVersionChangeEventInit extends com.user00.domjnate.api.dom.EventInit
{
@JsProperty(name="newVersion")
Double getNewVersion();
@JsProperty(name="newVersion")
void setNewVersion(Double val);
@JsProperty(name="oldVersion")
Double getOldVersion();
@JsProperty(name="oldVersion")
void setOldVersion(Double val);
}
