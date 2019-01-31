package com.user00.domjnate.api.dom;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="EventInit")
public interface EventInit
{
@JsProperty(name="bubbles")
Boolean getBubbles();
@JsProperty(name="bubbles")
void setBubbles(Boolean val);
@JsProperty(name="cancelable")
Boolean getCancelable();
@JsProperty(name="cancelable")
void setCancelable(Boolean val);
@JsProperty(name="composed")
Boolean getComposed();
@JsProperty(name="composed")
void setComposed(Boolean val);
}
