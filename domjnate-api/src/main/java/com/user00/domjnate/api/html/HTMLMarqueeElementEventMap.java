package com.user00.domjnate.api.html;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="HTMLMarqueeElementEventMap")
public interface HTMLMarqueeElementEventMap extends HTMLElementEventMap
{
@JsProperty(name="bounce")
com.user00.domjnate.api.dom.Event getBounce();
@JsProperty(name="bounce")
void setBounce(com.user00.domjnate.api.dom.Event val);
@JsProperty(name="finish")
com.user00.domjnate.api.dom.Event getFinish();
@JsProperty(name="finish")
void setFinish(com.user00.domjnate.api.dom.Event val);
@JsProperty(name="start")
com.user00.domjnate.api.dom.Event getStart();
@JsProperty(name="start")
void setStart(com.user00.domjnate.api.dom.Event val);
}
