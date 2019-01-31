package com.user00.domjnate.api;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="DeviceOrientationEventInit")
public interface DeviceOrientationEventInit extends com.user00.domjnate.api.dom.EventInit
{
@JsProperty(name="absolute")
Boolean getAbsolute();
@JsProperty(name="absolute")
void setAbsolute(Boolean val);
@JsProperty(name="alpha")
Double getAlpha();
@JsProperty(name="alpha")
void setAlpha(Double val);
@JsProperty(name="beta")
Double getBeta();
@JsProperty(name="beta")
void setBeta(Double val);
@JsProperty(name="gamma")
Double getGamma();
@JsProperty(name="gamma")
void setGamma(Double val);
}
