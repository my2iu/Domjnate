package com.user00.domjnate.api.mediastream;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="MediaStreamErrorEventInit")
public interface MediaStreamErrorEventInit extends com.user00.domjnate.api.dom.EventInit
{
@JsProperty(name="error")
MediaStreamError getError();
@JsProperty(name="error")
void setError(MediaStreamError val);
}
