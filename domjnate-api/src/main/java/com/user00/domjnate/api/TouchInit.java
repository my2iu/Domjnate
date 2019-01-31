package com.user00.domjnate.api;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="TouchInit")
public interface TouchInit
{
@JsProperty(name="altitudeAngle")
Double getAltitudeAngle();
@JsProperty(name="altitudeAngle")
void setAltitudeAngle(Double val);
@JsProperty(name="azimuthAngle")
Double getAzimuthAngle();
@JsProperty(name="azimuthAngle")
void setAzimuthAngle(Double val);
@JsProperty(name="clientX")
Double getClientX();
@JsProperty(name="clientX")
void setClientX(Double val);
@JsProperty(name="clientY")
Double getClientY();
@JsProperty(name="clientY")
void setClientY(Double val);
@JsProperty(name="force")
Double getForce();
@JsProperty(name="force")
void setForce(Double val);
@JsProperty(name="identifier")
double getIdentifier();
@JsProperty(name="identifier")
void setIdentifier(double val);
@JsProperty(name="pageX")
Double getPageX();
@JsProperty(name="pageX")
void setPageX(Double val);
@JsProperty(name="pageY")
Double getPageY();
@JsProperty(name="pageY")
void setPageY(Double val);
@JsProperty(name="radiusX")
Double getRadiusX();
@JsProperty(name="radiusX")
void setRadiusX(Double val);
@JsProperty(name="radiusY")
Double getRadiusY();
@JsProperty(name="radiusY")
void setRadiusY(Double val);
@JsProperty(name="rotationAngle")
Double getRotationAngle();
@JsProperty(name="rotationAngle")
void setRotationAngle(Double val);
@JsProperty(name="screenX")
Double getScreenX();
@JsProperty(name="screenX")
void setScreenX(Double val);
@JsProperty(name="screenY")
Double getScreenY();
@JsProperty(name="screenY")
void setScreenY(Double val);
@JsProperty(name="target")
com.user00.domjnate.api.dom.EventTarget getTarget();
@JsProperty(name="target")
void setTarget(com.user00.domjnate.api.dom.EventTarget val);
@JsProperty(name="touchType")
String getTouchType();
@JsProperty(name="touchType")
void setTouchType(String val);
}
