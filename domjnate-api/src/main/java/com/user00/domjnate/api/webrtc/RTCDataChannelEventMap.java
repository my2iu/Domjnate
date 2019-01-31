package com.user00.domjnate.api.webrtc;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="RTCDataChannelEventMap")
public interface RTCDataChannelEventMap
{
@JsProperty(name="bufferedamountlow")
com.user00.domjnate.api.dom.Event getBufferedamountlow();
@JsProperty(name="bufferedamountlow")
void setBufferedamountlow(com.user00.domjnate.api.dom.Event val);
@JsProperty(name="close")
com.user00.domjnate.api.dom.Event getClose();
@JsProperty(name="close")
void setClose(com.user00.domjnate.api.dom.Event val);
@JsProperty(name="error")
RTCErrorEvent getError();
@JsProperty(name="error")
void setError(RTCErrorEvent val);
@JsProperty(name="message")
com.user00.domjnate.api.MessageEvent getMessage();
@JsProperty(name="message")
void setMessage(com.user00.domjnate.api.MessageEvent val);
@JsProperty(name="open")
com.user00.domjnate.api.dom.Event getOpen();
@JsProperty(name="open")
void setOpen(com.user00.domjnate.api.dom.Event val);
}
