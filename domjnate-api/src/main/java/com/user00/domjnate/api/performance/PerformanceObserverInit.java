package com.user00.domjnate.api.performance;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="PerformanceObserverInit")
public interface PerformanceObserverInit
{
@JsProperty(name="buffered")
Boolean getBuffered();
@JsProperty(name="buffered")
void setBuffered(Boolean val);
@JsProperty(name="entryTypes")
com.user00.domjnate.api.Array<String> getEntryTypes();
@JsProperty(name="entryTypes")
void setEntryTypes(com.user00.domjnate.api.Array<String> val);
}
