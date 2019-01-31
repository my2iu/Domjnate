package com.user00.domjnate.api;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="PushSubscriptionJSON")
public interface PushSubscriptionJSON
{
@JsProperty(name="endpoint")
String getEndpoint();
@JsProperty(name="endpoint")
void setEndpoint(String val);
@JsProperty(name="expirationTime")
Double getExpirationTime();
@JsProperty(name="expirationTime")
void setExpirationTime(Double val);
@JsProperty(name="keys")
java.lang.Object getKeys();
@JsProperty(name="keys")
void setKeys(java.lang.Object val);
}
