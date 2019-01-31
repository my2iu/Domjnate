package com.user00.domjnate.api;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="ProgressEventInit")
public interface ProgressEventInit extends com.user00.domjnate.api.dom.EventInit
{
@JsProperty(name="lengthComputable")
Boolean getLengthComputable();
@JsProperty(name="lengthComputable")
void setLengthComputable(Boolean val);
@JsProperty(name="loaded")
Double getLoaded();
@JsProperty(name="loaded")
void setLoaded(Double val);
@JsProperty(name="total")
Double getTotal();
@JsProperty(name="total")
void setTotal(Double val);
}
