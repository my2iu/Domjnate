package com.user00.domjnate.api;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="VRStageParameters")
public interface VRStageParameters
{
@JsProperty(name="sittingToStandingTransform")
Float32Array getSittingToStandingTransform();
@JsProperty(name="sittingToStandingTransform")
void setSittingToStandingTransform(Float32Array val);
@JsProperty(name="sizeX")
Double getSizeX();
@JsProperty(name="sizeX")
void setSizeX(Double val);
@JsProperty(name="sizeY")
Double getSizeY();
@JsProperty(name="sizeY")
void setSizeY(Double val);
}
