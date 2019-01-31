package com.user00.domjnate.api.webspeech;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="SpeechSynthesisEventMap")
public interface SpeechSynthesisEventMap
{
@JsProperty(name="voiceschanged")
com.user00.domjnate.api.dom.Event getVoiceschanged();
@JsProperty(name="voiceschanged")
void setVoiceschanged(com.user00.domjnate.api.dom.Event val);
}
