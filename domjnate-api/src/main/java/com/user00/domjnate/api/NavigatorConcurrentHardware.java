package com.user00.domjnate.api;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="NavigatorConcurrentHardware")
public interface NavigatorConcurrentHardware
{
@JsProperty(name="hardwareConcurrency")
double getHardwareConcurrency();
}
