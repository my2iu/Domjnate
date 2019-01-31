package com.user00.domjnate.api;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="Coordinates")
public interface Coordinates
{
@JsProperty(name="accuracy")
double getAccuracy();
@JsProperty(name="altitude")
Double getAltitude();
@JsProperty(name="altitudeAccuracy")
Double getAltitudeAccuracy();
@JsProperty(name="heading")
Double getHeading();
@JsProperty(name="latitude")
double getLatitude();
@JsProperty(name="longitude")
double getLongitude();
@JsProperty(name="speed")
Double getSpeed();
}
