package com.user00.domjnate.api.indexeddb;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="IDBIndexParameters")
public interface IDBIndexParameters
{
@JsProperty(name="multiEntry")
Boolean getMultiEntry();
@JsProperty(name="multiEntry")
void setMultiEntry(Boolean val);
@JsProperty(name="unique")
Boolean getUnique();
@JsProperty(name="unique")
void setUnique(Boolean val);
}
