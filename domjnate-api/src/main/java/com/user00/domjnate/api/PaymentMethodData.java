package com.user00.domjnate.api;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="PaymentMethodData")
public interface PaymentMethodData
{
@JsProperty(name="data")
java.lang.Object getData();
@JsProperty(name="data")
void setData(java.lang.Object val);
@JsProperty(name="supportedMethods")
java.lang.Object getSupportedMethods();
@JsProperty(name="supportedMethods")
void setSupportedMethods(java.lang.Object val);
}
