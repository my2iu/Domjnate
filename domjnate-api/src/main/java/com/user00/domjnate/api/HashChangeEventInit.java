package com.user00.domjnate.api;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="HashChangeEventInit")
public interface HashChangeEventInit extends com.user00.domjnate.api.dom.EventInit
{
@JsProperty(name="newURL")
String getNewURL();
@JsProperty(name="newURL")
void setNewURL(String val);
@JsProperty(name="oldURL")
String getOldURL();
@JsProperty(name="oldURL")
void setOldURL(String val);
}
