package com.user00.domjnate.api;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="OptionalEffectTiming")
public interface OptionalEffectTiming
{
@JsProperty(name="delay")
Double getDelay();
@JsProperty(name="delay")
void setDelay(Double val);
@JsProperty(name="direction")
String getDirection();
@JsProperty(name="direction")
void setDirection(String val);
@JsProperty(name="duration")
java.lang.Object getDuration();
@JsProperty(name="duration")
void setDuration(java.lang.Object val);
@JsProperty(name="easing")
String getEasing();
@JsProperty(name="easing")
void setEasing(String val);
@JsProperty(name="endDelay")
Double getEndDelay();
@JsProperty(name="endDelay")
void setEndDelay(Double val);
@JsProperty(name="fill")
String getFill();
@JsProperty(name="fill")
void setFill(String val);
@JsProperty(name="iterationStart")
Double getIterationStart();
@JsProperty(name="iterationStart")
void setIterationStart(Double val);
@JsProperty(name="iterations")
Double getIterations();
@JsProperty(name="iterations")
void setIterations(Double val);
}
