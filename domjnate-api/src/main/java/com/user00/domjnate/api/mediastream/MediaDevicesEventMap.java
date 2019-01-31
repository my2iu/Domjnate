package com.user00.domjnate.api.mediastream;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="MediaDevicesEventMap")
public interface MediaDevicesEventMap
{
@JsProperty(name="devicechange")
com.user00.domjnate.api.dom.Event getDevicechange();
@JsProperty(name="devicechange")
void setDevicechange(com.user00.domjnate.api.dom.Event val);
}
