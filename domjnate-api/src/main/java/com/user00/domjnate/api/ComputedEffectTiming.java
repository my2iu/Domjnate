package com.user00.domjnate.api;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="ComputedEffectTiming")
public interface ComputedEffectTiming extends EffectTiming
{
@JsProperty(name="activeDuration")
Double getActiveDuration();
@JsProperty(name="activeDuration")
void setActiveDuration(Double val);
@JsProperty(name="currentIteration")
Double getCurrentIteration();
@JsProperty(name="currentIteration")
void setCurrentIteration(Double val);
@JsProperty(name="endTime")
Double getEndTime();
@JsProperty(name="endTime")
void setEndTime(Double val);
@JsProperty(name="localTime")
Double getLocalTime();
@JsProperty(name="localTime")
void setLocalTime(Double val);
@JsProperty(name="progress")
Double getProgress();
@JsProperty(name="progress")
void setProgress(Double val);
}
