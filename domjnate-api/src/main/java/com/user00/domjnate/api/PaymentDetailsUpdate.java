package com.user00.domjnate.api;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="PaymentDetailsUpdate")
public interface PaymentDetailsUpdate extends PaymentDetailsBase
{
@JsProperty(name="error")
String getError();
@JsProperty(name="error")
void setError(String val);
@JsProperty(name="total")
PaymentItem getTotal();
@JsProperty(name="total")
void setTotal(PaymentItem val);
}
