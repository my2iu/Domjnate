package com.user00.domjnate.api;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="PromiseRejectionEventInit")
public interface PromiseRejectionEventInit extends com.user00.domjnate.api.dom.EventInit
{
@JsProperty(name="promise")
Promise<java.lang.Object> getPromise();
@JsProperty(name="promise")
void setPromise(Promise<java.lang.Object> val);
@JsProperty(name="reason")
java.lang.Object getReason();
@JsProperty(name="reason")
void setReason(java.lang.Object val);
}
