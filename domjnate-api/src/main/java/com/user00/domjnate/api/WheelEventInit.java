package com.user00.domjnate.api;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="WheelEventInit")
public interface WheelEventInit extends MouseEventInit
{
@JsProperty(name="deltaMode")
Double getDeltaMode();
@JsProperty(name="deltaMode")
void setDeltaMode(Double val);
@JsProperty(name="deltaX")
Double getDeltaX();
@JsProperty(name="deltaX")
void setDeltaX(Double val);
@JsProperty(name="deltaY")
Double getDeltaY();
@JsProperty(name="deltaY")
void setDeltaY(Double val);
@JsProperty(name="deltaZ")
Double getDeltaZ();
@JsProperty(name="deltaZ")
void setDeltaZ(Double val);
}
