package com.user00.domjnate.api;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="PushSubscriptionOptionsInit")
public interface PushSubscriptionOptionsInit
{
@JsProperty(name="applicationServerKey")
java.lang.Object getApplicationServerKey();
@JsProperty(name="applicationServerKey")
void setApplicationServerKey(java.lang.Object val);
@JsProperty(name="userVisibleOnly")
Boolean getUserVisibleOnly();
@JsProperty(name="userVisibleOnly")
void setUserVisibleOnly(Boolean val);
}
