package com.user00.domjnate.api.eme;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="MediaEncryptedEventInit")
public interface MediaEncryptedEventInit extends com.user00.domjnate.api.dom.EventInit
{
@JsProperty(name="initData")
com.user00.domjnate.api.ArrayBuffer getInitData();
@JsProperty(name="initData")
void setInitData(com.user00.domjnate.api.ArrayBuffer val);
@JsProperty(name="initDataType")
String getInitDataType();
@JsProperty(name="initDataType")
void setInitDataType(String val);
}
