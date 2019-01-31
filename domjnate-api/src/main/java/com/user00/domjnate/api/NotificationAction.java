package com.user00.domjnate.api;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="NotificationAction")
public interface NotificationAction
{
@JsProperty(name="action")
String getAction();
@JsProperty(name="action")
void setAction(String val);
@JsProperty(name="icon")
String getIcon();
@JsProperty(name="icon")
void setIcon(String val);
@JsProperty(name="title")
String getTitle();
@JsProperty(name="title")
void setTitle(String val);
}
