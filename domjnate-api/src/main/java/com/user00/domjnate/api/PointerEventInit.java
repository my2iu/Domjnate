package com.user00.domjnate.api;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="PointerEventInit")
public interface PointerEventInit extends MouseEventInit
{
@JsProperty(name="height")
Double getHeight();
@JsProperty(name="height")
void setHeight(Double val);
@JsProperty(name="isPrimary")
Boolean getIsPrimary();
@JsProperty(name="isPrimary")
void setIsPrimary(Boolean val);
@JsProperty(name="pointerId")
Double getPointerId();
@JsProperty(name="pointerId")
void setPointerId(Double val);
@JsProperty(name="pointerType")
String getPointerType();
@JsProperty(name="pointerType")
void setPointerType(String val);
@JsProperty(name="pressure")
Double getPressure();
@JsProperty(name="pressure")
void setPressure(Double val);
@JsProperty(name="tangentialPressure")
Double getTangentialPressure();
@JsProperty(name="tangentialPressure")
void setTangentialPressure(Double val);
@JsProperty(name="tiltX")
Double getTiltX();
@JsProperty(name="tiltX")
void setTiltX(Double val);
@JsProperty(name="tiltY")
Double getTiltY();
@JsProperty(name="tiltY")
void setTiltY(Double val);
@JsProperty(name="twist")
Double getTwist();
@JsProperty(name="twist")
void setTwist(Double val);
@JsProperty(name="width")
Double getWidth();
@JsProperty(name="width")
void setWidth(Double val);
}
