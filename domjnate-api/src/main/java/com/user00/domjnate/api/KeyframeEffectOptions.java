package com.user00.domjnate.api;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="KeyframeEffectOptions")
public interface KeyframeEffectOptions extends EffectTiming
{
@JsProperty(name="composite")
String getComposite();
@JsProperty(name="composite")
void setComposite(String val);
@JsProperty(name="iterationComposite")
String getIterationComposite();
@JsProperty(name="iterationComposite")
void setIterationComposite(String val);
}
