package com.user00.domjnate.api.eme;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="MediaKeyMessageEventInit")
public interface MediaKeyMessageEventInit extends com.user00.domjnate.api.dom.EventInit
{
@JsProperty(name="message")
com.user00.domjnate.api.ArrayBuffer getMessage();
@JsProperty(name="message")
void setMessage(com.user00.domjnate.api.ArrayBuffer val);
@JsProperty(name="messageType")
String getMessageType();
@JsProperty(name="messageType")
void setMessageType(String val);
}
