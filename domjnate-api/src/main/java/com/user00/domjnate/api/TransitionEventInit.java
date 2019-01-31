package com.user00.domjnate.api;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="TransitionEventInit")
public interface TransitionEventInit extends com.user00.domjnate.api.dom.EventInit
{
@JsProperty(name="elapsedTime")
Double getElapsedTime();
@JsProperty(name="elapsedTime")
void setElapsedTime(Double val);
@JsProperty(name="propertyName")
String getPropertyName();
@JsProperty(name="propertyName")
void setPropertyName(String val);
@JsProperty(name="pseudoElement")
String getPseudoElement();
@JsProperty(name="pseudoElement")
void setPseudoElement(String val);
}
