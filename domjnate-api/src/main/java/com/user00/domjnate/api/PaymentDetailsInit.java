package com.user00.domjnate.api;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="PaymentDetailsInit")
public interface PaymentDetailsInit extends PaymentDetailsBase
{
@JsProperty(name="id")
String getId();
@JsProperty(name="id")
void setId(String val);
@JsProperty(name="total")
PaymentItem getTotal();
@JsProperty(name="total")
void setTotal(PaymentItem val);
}
