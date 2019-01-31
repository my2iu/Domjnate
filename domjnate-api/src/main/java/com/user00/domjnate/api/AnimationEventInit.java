package com.user00.domjnate.api;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="AnimationEventInit")
public interface AnimationEventInit extends com.user00.domjnate.api.dom.EventInit
{
@JsProperty(name="animationName")
String getAnimationName();
@JsProperty(name="animationName")
void setAnimationName(String val);
@JsProperty(name="elapsedTime")
Double getElapsedTime();
@JsProperty(name="elapsedTime")
void setElapsedTime(Double val);
@JsProperty(name="pseudoElement")
String getPseudoElement();
@JsProperty(name="pseudoElement")
void setPseudoElement(String val);
}
