package com.user00.domjnate.api.dom;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="CustomEventInit")
public interface CustomEventInit<T>  extends EventInit
{
@JsProperty(name="detail")
T getDetail();
@JsProperty(name="detail")
void setDetail(T val);
}
