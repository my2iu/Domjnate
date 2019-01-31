package com.user00.domjnate.api;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="NotificationEventMap")
public interface NotificationEventMap
{
@JsProperty(name="click")
com.user00.domjnate.api.dom.Event getClick();
@JsProperty(name="click")
void setClick(com.user00.domjnate.api.dom.Event val);
@JsProperty(name="close")
com.user00.domjnate.api.dom.Event getClose();
@JsProperty(name="close")
void setClose(com.user00.domjnate.api.dom.Event val);
@JsProperty(name="error")
com.user00.domjnate.api.dom.Event getError();
@JsProperty(name="error")
void setError(com.user00.domjnate.api.dom.Event val);
@JsProperty(name="show")
com.user00.domjnate.api.dom.Event getShow();
@JsProperty(name="show")
void setShow(com.user00.domjnate.api.dom.Event val);
}
