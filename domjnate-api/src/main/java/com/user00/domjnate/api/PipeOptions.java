package com.user00.domjnate.api;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="PipeOptions")
public interface PipeOptions
{
@JsProperty(name="preventAbort")
Boolean getPreventAbort();
@JsProperty(name="preventAbort")
void setPreventAbort(Boolean val);
@JsProperty(name="preventCancel")
Boolean getPreventCancel();
@JsProperty(name="preventCancel")
void setPreventCancel(Boolean val);
@JsProperty(name="preventClose")
Boolean getPreventClose();
@JsProperty(name="preventClose")
void setPreventClose(Boolean val);
}
