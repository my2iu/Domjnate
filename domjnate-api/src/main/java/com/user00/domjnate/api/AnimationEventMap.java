package com.user00.domjnate.api;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="AnimationEventMap")
public interface AnimationEventMap
{
@JsProperty(name="cancel")
AnimationPlaybackEvent getCancel();
@JsProperty(name="cancel")
void setCancel(AnimationPlaybackEvent val);
@JsProperty(name="finish")
AnimationPlaybackEvent getFinish();
@JsProperty(name="finish")
void setFinish(AnimationPlaybackEvent val);
}
