package com.user00.domjnate.api.webaudio;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="AudioScheduledSourceNodeEventMap")
public interface AudioScheduledSourceNodeEventMap
{
@JsProperty(name="ended")
com.user00.domjnate.api.dom.Event getEnded();
@JsProperty(name="ended")
void setEnded(com.user00.domjnate.api.dom.Event val);
}
