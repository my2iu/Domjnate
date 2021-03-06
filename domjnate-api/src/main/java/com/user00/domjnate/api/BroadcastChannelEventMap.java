package com.user00.domjnate.api;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="BroadcastChannelEventMap")
public interface BroadcastChannelEventMap
{
@JsProperty(name="message")
MessageEvent getMessage();
@JsProperty(name="message")
void setMessage(MessageEvent val);
@JsProperty(name="messageerror")
MessageEvent getMessageerror();
@JsProperty(name="messageerror")
void setMessageerror(MessageEvent val);
}
