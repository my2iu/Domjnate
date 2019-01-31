package com.user00.domjnate.api.webaudio;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="AudioWorkletNodeEventMap")
public interface AudioWorkletNodeEventMap
{
@JsProperty(name="processorerror")
com.user00.domjnate.api.dom.Event getProcessorerror();
@JsProperty(name="processorerror")
void setProcessorerror(com.user00.domjnate.api.dom.Event val);
}
