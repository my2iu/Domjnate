package com.user00.domjnate.api;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="StorageEventInit")
public interface StorageEventInit extends com.user00.domjnate.api.dom.EventInit
{
@JsProperty(name="key")
String getKey();
@JsProperty(name="key")
void setKey(String val);
@JsProperty(name="newValue")
String getNewValue();
@JsProperty(name="newValue")
void setNewValue(String val);
@JsProperty(name="oldValue")
String getOldValue();
@JsProperty(name="oldValue")
void setOldValue(String val);
@JsProperty(name="storageArea")
Storage getStorageArea();
@JsProperty(name="storageArea")
void setStorageArea(Storage val);
@JsProperty(name="url")
String getUrl();
@JsProperty(name="url")
void setUrl(String val);
}
