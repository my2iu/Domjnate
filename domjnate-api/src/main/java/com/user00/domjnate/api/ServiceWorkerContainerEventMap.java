package com.user00.domjnate.api;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="ServiceWorkerContainerEventMap")
public interface ServiceWorkerContainerEventMap
{
@JsProperty(name="controllerchange")
com.user00.domjnate.api.dom.Event getControllerchange();
@JsProperty(name="controllerchange")
void setControllerchange(com.user00.domjnate.api.dom.Event val);
@JsProperty(name="message")
MessageEvent getMessage();
@JsProperty(name="message")
void setMessage(MessageEvent val);
@JsProperty(name="messageerror")
MessageEvent getMessageerror();
@JsProperty(name="messageerror")
void setMessageerror(MessageEvent val);
}
