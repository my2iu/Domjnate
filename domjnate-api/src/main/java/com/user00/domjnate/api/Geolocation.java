package com.user00.domjnate.api;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="Geolocation")
public interface Geolocation
{
@JsMethod(name="clearWatch")
void clearWatch(double watchId);
@JsMethod(name="getCurrentPosition")
void getCurrentPosition(PositionCallback successCallback);
@JsMethod(name="getCurrentPosition")
void getCurrentPosition(PositionCallback successCallback, PositionErrorCallback errorCallback);
@JsMethod(name="getCurrentPosition")
void getCurrentPosition(PositionCallback successCallback, PositionErrorCallback errorCallback, PositionOptions options);
@JsMethod(name="watchPosition")
double watchPosition(PositionCallback successCallback);
@JsMethod(name="watchPosition")
double watchPosition(PositionCallback successCallback, PositionErrorCallback errorCallback);
@JsMethod(name="watchPosition")
double watchPosition(PositionCallback successCallback, PositionErrorCallback errorCallback, PositionOptions options);
}
