package com.user00.domjnate.api.webaudio;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="OfflineAudioContextEventMap")
public interface OfflineAudioContextEventMap extends BaseAudioContextEventMap
{
@JsProperty(name="complete")
OfflineAudioCompletionEvent getComplete();
@JsProperty(name="complete")
void setComplete(OfflineAudioCompletionEvent val);
}
