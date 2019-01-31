package com.user00.domjnate.api.mediastream;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="MediaStreamEventInit")
public interface MediaStreamEventInit extends com.user00.domjnate.api.dom.EventInit
{
@JsProperty(name="stream")
MediaStream getStream();
@JsProperty(name="stream")
void setStream(MediaStream val);
}
