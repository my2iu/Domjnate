package com.user00.domjnate.api;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="VRDisplayEventInit")
public interface VRDisplayEventInit extends com.user00.domjnate.api.dom.EventInit
{
@JsProperty(name="display")
VRDisplay getDisplay();
@JsProperty(name="display")
void setDisplay(VRDisplay val);
@JsProperty(name="reason")
String getReason();
@JsProperty(name="reason")
void setReason(String val);
}
