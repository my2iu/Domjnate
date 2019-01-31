package com.user00.domjnate.api;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="PaymentItem")
public interface PaymentItem
{
@JsProperty(name="amount")
PaymentCurrencyAmount getAmount();
@JsProperty(name="amount")
void setAmount(PaymentCurrencyAmount val);
@JsProperty(name="label")
String getLabel();
@JsProperty(name="label")
void setLabel(String val);
@JsProperty(name="pending")
Boolean getPending();
@JsProperty(name="pending")
void setPending(Boolean val);
}
