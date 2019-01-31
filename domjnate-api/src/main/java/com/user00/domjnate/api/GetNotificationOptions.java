package com.user00.domjnate.api;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="GetNotificationOptions")
public interface GetNotificationOptions
{
@JsProperty(name="tag")
String getTag();
@JsProperty(name="tag")
void setTag(String val);
}
