package com.user00.domjnate.api;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="AnimationPlaybackEventInit")
public interface AnimationPlaybackEventInit extends com.user00.domjnate.api.dom.EventInit
{
@JsProperty(name="currentTime")
Double getCurrentTime();
@JsProperty(name="currentTime")
void setCurrentTime(Double val);
@JsProperty(name="timelineTime")
Double getTimelineTime();
@JsProperty(name="timelineTime")
void setTimelineTime(Double val);
}
