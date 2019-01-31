package com.user00.domjnate.api;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="WebSocketEventMap")
public interface WebSocketEventMap
{
@JsProperty(name="close")
CloseEvent getClose();
@JsProperty(name="close")
void setClose(CloseEvent val);
@JsProperty(name="error")
com.user00.domjnate.api.dom.Event getError();
@JsProperty(name="error")
void setError(com.user00.domjnate.api.dom.Event val);
@JsProperty(name="message")
MessageEvent getMessage();
@JsProperty(name="message")
void setMessage(MessageEvent val);
@JsProperty(name="open")
com.user00.domjnate.api.dom.Event getOpen();
@JsProperty(name="open")
void setOpen(com.user00.domjnate.api.dom.Event val);
}
