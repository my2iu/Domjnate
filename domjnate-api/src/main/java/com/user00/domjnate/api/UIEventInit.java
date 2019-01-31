package com.user00.domjnate.api;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="UIEventInit")
public interface UIEventInit extends com.user00.domjnate.api.dom.EventInit
{
@JsProperty(name="detail")
Double getDetail();
@JsProperty(name="detail")
void setDetail(Double val);
@JsProperty(name="view")
Window getView();
@JsProperty(name="view")
void setView(Window val);
}
