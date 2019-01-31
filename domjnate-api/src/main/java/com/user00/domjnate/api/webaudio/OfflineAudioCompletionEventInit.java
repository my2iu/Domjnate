package com.user00.domjnate.api.webaudio;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="OfflineAudioCompletionEventInit")
public interface OfflineAudioCompletionEventInit extends com.user00.domjnate.api.dom.EventInit
{
@JsProperty(name="renderedBuffer")
AudioBuffer getRenderedBuffer();
@JsProperty(name="renderedBuffer")
void setRenderedBuffer(AudioBuffer val);
}
