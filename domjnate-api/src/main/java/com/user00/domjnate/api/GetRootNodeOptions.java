package com.user00.domjnate.api;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="GetRootNodeOptions")
public interface GetRootNodeOptions
{
@JsProperty(name="composed")
Boolean getComposed();
@JsProperty(name="composed")
void setComposed(Boolean val);
}
