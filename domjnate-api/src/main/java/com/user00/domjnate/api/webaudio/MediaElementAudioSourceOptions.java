package com.user00.domjnate.api.webaudio;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="MediaElementAudioSourceOptions")
public interface MediaElementAudioSourceOptions
{
@JsProperty(name="mediaElement")
com.user00.domjnate.api.html.HTMLMediaElement getMediaElement();
@JsProperty(name="mediaElement")
void setMediaElement(com.user00.domjnate.api.html.HTMLMediaElement val);
}
