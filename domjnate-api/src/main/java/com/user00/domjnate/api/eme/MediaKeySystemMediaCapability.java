package com.user00.domjnate.api.eme;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="MediaKeySystemMediaCapability")
public interface MediaKeySystemMediaCapability
{
@JsProperty(name="contentType")
String getContentType();
@JsProperty(name="contentType")
void setContentType(String val);
@JsProperty(name="robustness")
String getRobustness();
@JsProperty(name="robustness")
void setRobustness(String val);
}
