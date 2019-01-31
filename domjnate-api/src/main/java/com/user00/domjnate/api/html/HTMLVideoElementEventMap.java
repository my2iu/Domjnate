package com.user00.domjnate.api.html;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="HTMLVideoElementEventMap")
public interface HTMLVideoElementEventMap extends HTMLMediaElementEventMap
{
@JsProperty(name="MSVideoFormatChanged")
com.user00.domjnate.api.dom.Event getMSVideoFormatChanged();
@JsProperty(name="MSVideoFormatChanged")
void setMSVideoFormatChanged(com.user00.domjnate.api.dom.Event val);
@JsProperty(name="MSVideoFrameStepCompleted")
com.user00.domjnate.api.dom.Event getMSVideoFrameStepCompleted();
@JsProperty(name="MSVideoFrameStepCompleted")
void setMSVideoFrameStepCompleted(com.user00.domjnate.api.dom.Event val);
@JsProperty(name="MSVideoOptimalLayoutChanged")
com.user00.domjnate.api.dom.Event getMSVideoOptimalLayoutChanged();
@JsProperty(name="MSVideoOptimalLayoutChanged")
void setMSVideoOptimalLayoutChanged(com.user00.domjnate.api.dom.Event val);
}
