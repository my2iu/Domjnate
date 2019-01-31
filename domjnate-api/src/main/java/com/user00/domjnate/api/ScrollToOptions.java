package com.user00.domjnate.api;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="ScrollToOptions")
public interface ScrollToOptions extends ScrollOptions
{
@JsProperty(name="left")
Double getLeft();
@JsProperty(name="left")
void setLeft(Double val);
@JsProperty(name="top")
Double getTop();
@JsProperty(name="top")
void setTop(Double val);
}
